import java.util.*;
class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Initializing A[]
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int A[] = new int [n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Calculating square of each elements of A[]
        int B[] = new int [n];
        for (int i = 0; i < n; i++) {
            B[i] = A[i] * A[i];
        }

        // Printing A[]
        System.out.println("A");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Printing B[]
        System.out.println("B");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}