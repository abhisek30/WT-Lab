import java.util.Arrays;
import java.util.Scanner;

public class prog1 {
    public static float getAvg(int[] arr){
        return Arrays.stream(arr).sum() / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = sc.nextInt();
        
        int[] arr = new int[length];

        System.out.println("enter " + length + " elements");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("AVERAGE: " + getAvg(arr));
    }
}
