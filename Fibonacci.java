import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,fibo,n;
		System.out.print("Enter the series:");
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(a+" ");
			fibo=a+b;
			a=b;
			b=fibo;
			
		}
	}
}