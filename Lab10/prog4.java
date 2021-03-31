class Parent{
    public void fun() throws Exception{
        System.out.println("Exception Thrown by parent");
    }
}

class Child extends Parent{
    public void fun() throws Exception{
        System.out.println("Exception Thrown by child");
        super.fun();
    }
}

public class prog4 extends Child {
    public static void main(String[] args) {
        Child child = new Child();
        try{
            child.fun();
        }catch(Exception e){

        }
    }
}