import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        System.out.println("enter first and last name\n");
        Scanner sc = new Scanner(System.in);
        String first = new String(sc.next());
        String second = sc.next();

        System.out.println(second + " " + first);
    }
}
