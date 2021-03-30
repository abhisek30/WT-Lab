import java.util.Scanner;

class Other {
    int departmentId;
    int Employee;

    void Others(int n) {
        System.out.println("amount of Other is " + (n * 200));
    }
}
class Worker extends Other {
    void Workers(int n) {
        System.out.println("amount of Worker is " + (n * 300));
    }
}
class Manager extends Worker {
    void manager(int n) {
        System.out.println("amount of manager is " + (n * 400));
    }
}
public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the no of days:");
        int n = sc.nextInt();
        Other obj = new Other();
        obj.Others(n);
        Worker obj1 = new Worker();
        obj1.Workers(n);
        Manager obj2 = new Manager();
        obj2.manager(n);
        sc.close();

    }
}
