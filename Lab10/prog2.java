import java.util.Scanner;

public class prog2 {
    static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Enter two numbers : ");
        try{
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf("Output : %d\n", a/b);
        }catch(ArithmeticException ae){
            System.out.println("Cannot divide with zero\n");
        }finally{
        System.out.println("Program completed");
        }
    }    
}
