import java.util.Scanner;

class student 
{ 
    int roll;
    String name;      
    void details(){ 
        System.out.println("enter the name");          
        Scanner sc=new Scanner(System.in);          
        name=sc.nextLine(); 
        System.out.println("enter the roll no of the student");          
        roll=sc.nextInt(); 
     }  
     void print(){ 
         System.out.println("Name:"+name); 
         System.out.println("Roll:"+roll); 
     } 
 }
 class result extends student{     
    int dbms,coa,wt,os;     
    void getDetails(){ 
        System.out.println("enter the marks"); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter the dbms marks"); 
        dbms=sc.nextInt(); 
        System.out.println("enter the coa marks");         
        coa=sc.nextInt(); 
        System.out.println("enter the wt marks");         
        wt=sc.nextInt(); 
        System.out.println("enter the os marks");         
        os=sc.nextInt();         
        sc.close(); 
    }      
    float sgpa(){         
        float r;         
        r=(((dbms)+(os)+(wt)+(coa))/14);         
        return r; 
    } 
 } 
 class prog3{     
     public static void main(String args[]) {        
        result r=new result(); 
        r.details(); 
        r.getDetails(); 
        System.out.println("\tTHE Result:"); 
        r.print();         
        float c=r.sgpa(); 
        System.out.println("SGPA:"+c); 
    }
}
