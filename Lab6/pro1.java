import java.io.Console;

public class pro1 {
    public static void main(String[] args) {
        int sum=0;
        double res = 0;
        Console console = System.console();
        System.out.println("Lenght:");
        String l = console.readLine();
        int length = Integer.parseInt(l);

        int[] arr = new int[length];
        System.out.println("enter " + length + " elements");
        for(int i = 0; i < length; i++){
            String line = console.readLine();
            arr[i] = Integer.parseInt(line);
            sum = sum + arr[i];
        }
        res = sum/arr.length;
        System.out.println("Average: " + res);
    }
}
