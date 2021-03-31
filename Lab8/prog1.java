abstract class student {
        int roll,reg;
        abstract void course();
}
class kiitian extends student{
    void course(){
        System.out.println("School of CS - Btech - CSCE - 1929195");
    }
}
class prog1{
    public static void main(String[] args) {
        student stud;
        stud = new kiitian();
        stud.course();
    }
}
