public class Main {
	public static void main(String[] args) {
		int n=21;
		int s=0;
		
		for(int i=7;i<n+1;i++)
		{
			if((i/2)!=0){
			
			System.out.println(i);
		
			}
			
			s=s+i;
			i++;
			
		}
		System.out.println("sum of elements"+s);	
	}
}