import java.util.Scanner;

public class prog4 {
    public static class Box {
        public int length, breadth, height;

        public Box(int length, int breadth, int height) {
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }

        public int volume() {
            return length * breadth * height;
        }
    }

    public static class AnotherBox extends Box {

        public AnotherBox(int length, int breadth, int height) {
            super(length, breadth, height);
        }

        Box object1 = new Box(length,breadth,height);
        
        public void displayVolume () {
            System.out.println("volume is " + object1.volume());
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length breadth height");
        int length =sc.nextInt();
        int breadth =sc.nextInt();
        int height =sc.nextInt();
        var box = new AnotherBox(length,breadth,height);
        box.displayVolume();
    }
}