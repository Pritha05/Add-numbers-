import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Input the first number: ");
  int n1 = scanner.nextInt();
  System.out.println("Input the second number: ");
  int n2 = scanner.nextInt();
  int sum = n1 + n2;
  int subtract = n1 - n2;
  int multiply = n1 * n2;
  int divide = n1 / n2;
  int reminder= n1 % n2;
  System.out.printf("Sum = %d\nsubtract = %d\nMultiply = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, subtract, multiply,divide, reminder);
 }
}