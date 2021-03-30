class x{
    x(){
        System.out.println("iscdc");
    }
    x(int i){
        System.out.println("iscpc");
    }
}
class y extends x {
    y(int i){
        System.out.println("iccpc");
    }
}
class demo{
    public static void main(String x[]) {
        y y1 = new y();
    }
}