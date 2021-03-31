import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID:");
        int empid = sc.nextInt();
        System.out.print("Enter Employee Name:");
        String ename = sc.next();
        System.out.print("Enter Employee basic salary amount:");
        double basicSalaryamt = sc.nextDouble();

        Sales person1 = new Sales(empid, ename);
        double earnings = person1.earnings(basicSalaryamt);
        double towallowance = person1.tallowance(basicSalaryamt);

        System.out.println("Earnings of  Employee " + person1.getEname() + " is " + (int)earnings);
        System.out.println("Total allowance of  Employee ID "+ empid+ " , Name " + person1.getName() + " is " + (int)towallowance);
                        
    }
}
