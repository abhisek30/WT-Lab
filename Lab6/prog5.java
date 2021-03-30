import java.util.Scanner;

public class prog5 {
    private static class c2D {
        private float costOfSheet = 40;
        float area;

        float getCost(float area){
            return area * costOfSheet;
        }
    }

    public static class c3D extends c2D {
        private float costofMaking = 60;
        float totalSurfaceArea;
        float volume;

        c3D(float l, float b, float h){
            totalSurfaceArea =  2*(l*b + b*h + l*h);
            volume = l * b * h;
        }

        public float getTotalCost() {
            return getCost(totalSurfaceArea) + volume * costofMaking;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter L B H:");

        float l = sc.nextFloat();
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        c3D box = new c3D(l,b,h);
        var totalCost = box.getTotalCost();

        System.out.println("TOTAL COST: " + totalCost);
    }
}
