public class Employee {

    protected int empid;
    private String ename;

    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public double earnings(double basic) {
        double earn =  basic + 0.8*basic + 0.15 * basic;
        return earn;
    }
}