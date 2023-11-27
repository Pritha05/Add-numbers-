import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        double SI, P, R, T;
        System.out.print("Enter the principal:");
        Scanner sc = new Scanner(System.in);
        P = sc.nextInt();
        System.out.print("Enter the rate:");
        Scanner sc1 = new Scanner(System.in);
        R = sc1.nextInt();
        System.out.print("Enter the time:");
        Scanner sc2 = new Scanner(System.in);
        T = sc2.nextInt();
        SI = (P * R * T) / 100;
        System.out.println("Simple Interest: " + SI);

    }

}
