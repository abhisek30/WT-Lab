public class prog4 {
    public static void main(String[] args) {
        String arr1 = "Abhisek", arr2 = "Samantaray";    
        System.out.println("Strings before swapping: " + arr1 + " " + arr2);    
        arr1 = arr1 + arr2;        
        arr2 = arr1.substring(0, (arr1.length() - arr2.length()));    
        arr1 = arr1.substring(arr2.length());    
        System.out.println("Strings after swapping: " + arr1 + " " + arr2); 
    }
}
