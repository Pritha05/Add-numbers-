import java.util.Scanner;

public class Attandance {
   
   public static String findAttandance(int percentage) {
      // check score is within 0-100 or not
      if(percentage < 0 || percentage > 100)
         return "Invalid score"; // or throw exception
      
      // switch-case
      switch(percentage/10) {
        // for >= 90
        case 1:
        case 2:
           return "F";
        // for >= 80 and <90
        case 3:
           return "E";
        // for >= 70 and <80
        case 4:
           return "D";
        // for >= 60 and <70
        case 5:
           return "C";
        // for >= 50 and <60
        case 6:
           return "B";
        // for < 50
        default:
           return "A";
      }
   }

   public static void main(String[] args) {
      // Create Scanner class object to get input value
      
      Scanner scan = new Scanner(System.in);
      
      // take input for score
      System.out.print("Enter the value: ");
      int percentage = scan.nextInt();
      String name= "john";
      
      // find grade and display result
      
      System.out.println("Student name="+name+"  "+"Grade= " + findAttandance(percentage));
      
      // close Scanner 
      scan.close();
   }

}