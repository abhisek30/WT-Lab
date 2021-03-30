import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input;
        input = s.nextInt();
        if(input<100 && input>=90){
            System.out.println("Grade: O");
        }
        else if(input<90 && input>=80){
            System.out.println("Grade: E");
        }
        else if(input<80 && input>=70){
            System.out.println("Grade: A");
        }
        else if(input<70 && input>=60){
            System.out.println("Grade: B");
        }
        else if(input<60 && input>=50){
            System.out.println("Grade: C");
        }
        else if(input<50 && input>=40){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}
