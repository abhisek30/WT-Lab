public class prog5 {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
    static String add(String a, String b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(100,200,300));
        System.out.println(add("1929195 ","Abhisek"));
    }
}
