public class prog2 {
    void multiply(int a, int b) {
        double m1 = a * b;
        System.out.println("mul of two numbers" + m1);
    }
    void multiply(double a, double b) {
        double m2 = a * b;
        System.out.println("mul of two numbers: " + m2);
    }
    void multiply(float a, float b) {
        double m2 = a * b;
        System.out.println("mul of two numbers: " + m2);
    }
    public static void main(String[] args) {
        prog2 m = new prog2();
        m.multiply(10, 20);
        m.multiply(10.5, 30.5); 
        m.multiply(10.5, 30.5);
    }
}