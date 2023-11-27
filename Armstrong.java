import java.util.Scanner;
public class armstrong{
	public static void main(String[] args) {
		int n,sum=0,r,c;
		System.out.print("Enter the number:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0){
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if(c==sum){
			System.out.println("This is Armstrong Number");
		}else{
			System.out.println("This is not Armstrong Number");
		}
		
	}
}