import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        int a[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int diag1 = 0;
        int diag2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers for Matrix 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                if(i == j){
                   diag1 = diag1 + a[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i+j==2){
                    diag2 = diag2 + a[i][j];
                }
            }
        }
        System.out.println("Diagonal 1 = "+diag1);
        System.out.println("Diagonal 2 = "+diag2);
    }
}
