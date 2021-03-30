import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        int a[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int b[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int c[][] = {{0,0,0},{0,0,0},{0,0,0}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers for Matrix 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 9 numbers for Matrix 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of Matrix 1 & Matrix 2 = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
