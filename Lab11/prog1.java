import java.util.Scanner;

class prog1{
    public static void main(String args[])
    {
       String arr, reverse = "";
       Scanner input = new Scanner(System.in);
  
       System.out.print("Enter a string:");
       arr = input.nextLine();
  
       int length = arr.length();
  
       for ( int i = length - 1; i >= 0; i-- )
          reverse = reverse + arr.charAt(i);
  
       if (arr.equals(reverse))
          System.out.println(arr+" is a pallindrome");
       else
          System.out.println(arr+" is not a pallindrome");
    }
}