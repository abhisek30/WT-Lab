import java.util.Scanner;

interface motor2{
    void run();
    int c = 10;
    void consume();
}
class WM implements motor2 {
    Scanner input = new Scanner(System.in);
    int lt;
    public void consume() {
        System.out.print("liters of water available:");
        lt = input.nextInt();
    }
    public void run() {
        if(lt>c){
            System.out.println("Error,can't run");
        } else{
            System.out.println("Okay, Running fine");
        }
    }
}
class prog1 {
    public static void main(String[] args) {
        motor2 a = new WM();
        a.consume();
        a.run();
    }
}
