public class prog4 {
    static int count = 0;
    prog4(){
        count++;
    }
    public static void main(String[] args) {
        prog4 obj1 = new prog4();
        prog4 obj2 = new prog4();
        prog4 obj3 = new prog4();
        prog4 obj4 = new prog4();
        prog4 obj5 = new prog4();
        System.out.println("Numbers of object created:"+count);
    }
}
