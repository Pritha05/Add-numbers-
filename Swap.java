import java.util.Scanner;
public class Swap{
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter 1st number:");

		Scanner sc1=new Scanner(System.in);
		a=sc1.nextInt();
			System.out.println("Enter 2nd number:");
		Scanner sc2=new Scanner(System.in);
		b=sc2.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Afrer swapping ");
		System.out.println(a+" "+b+" ");
	}
	
}