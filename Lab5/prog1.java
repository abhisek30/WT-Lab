import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        System.out.println("enter 3 numberes\n");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int largest = Math.max(Math.max(a, b), c);

        System.out.println("largest = " + largest);
    }
}
