import java.util.Scanner;
public class palindrome{
	public static void main(String args[]){
		int n,sum=0,r;
		System.out.println("Enter the value:");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int c=n;
		while(n>0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==c){
			System.out.println("This is palindrome number");
		}else{
			System.out.println("This is not palindrome number");
		}
	}
}
