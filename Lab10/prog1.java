import java.util.Scanner;

public class prog1 {
    static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("Enter length: ");
        int length = input.nextInt();
        
        int[] arr = new int[length];

        System.out.print("enter " + length + " elements:");
        for(int i = 0; i < length; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Enter Index : ");
        int index = input.nextInt();
        try{
            System.out.printf("%d is present at index %d",arr[index],index);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Given Index is not prosent!");
        };

    }
}
