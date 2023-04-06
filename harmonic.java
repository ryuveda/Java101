package patika;
import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=scan.nextInt();
		
		harmon(number);
	}
	public static void harmon(int number) {
		
		float sum=0;
		for(float i=1;i<=number;i++)
		{
			sum=sum+(1/i);
		}
		System.out.print("Result: "+sum);
	}
}
