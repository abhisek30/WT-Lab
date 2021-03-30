import java.util.Scanner;

class neg extends Exception{
    neg(String s) {
        super(s);
    }
}

public class prog3 {
    static Scanner input = new Scanner(System.in);

    static void Input(int n) throws neg {
        if(n<0){
            throw new neg("You Entered a Negative Number");
        }else{
            System.out.println("You Entered a Positive Number "+(double)n);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        try{
            int a = input.nextInt();
            Input(a);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}