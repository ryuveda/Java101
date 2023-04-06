package patika;
import java.util.Scanner;

public class ebob_ekok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number_1=scan.nextInt();
		System.out.println("Enter a number: ");
		int number_2=scan.nextInt();
		find(number_1,number_2);
	}
	
	public static void find(int a,int b)
	{
		int ebob = 0;
	
		
		for(int i=1;i<=(a*b);i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println("Girilen sayıların ekok'u : "+i);
				break;
			}
		}
		
		for(int j=1;j<=a+1;j++)
		{
			if(a%j==0 && b%j==0)
			{
				
				ebob=j;
			}
			
		}
		System.out.println("Girilen sayıların ebob'u : "+ebob);
		
		
	}

}
