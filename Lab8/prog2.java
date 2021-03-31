import java.util.Scanner;

abstract class bank{
    float rateInterest;
    abstract float find_rateInterest(float annual);
}
class HDFC extends bank {
    float find_rateInterest(float annual){
        rateInterest = annual / 15000000;
        return rateInterest;
    }
}
class ICICI extends bank{
    float find_rateInterest(float fund){
        rateInterest = fund/10000000;
        return rateInterest;
    }
}
public class prog2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(("Last Year Annual Profit:"));
        float annual = input.nextFloat();
        System.out.print("Fund Supported by Reserve Bank of India :");
        float fund = input.nextFloat();
        bank a;
        a = new HDFC();
        System.out.println("Rate of Interest of HDFC is "+ a.find_rateInterest(annual));
        a = new ICICI();
        System.out.println("Rate of Interest of ICICI is "+ a.find_rateInterest(fund));
    }
}
