package patika;
import java.util.Scanner;
public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter base value");
		int base=scan.nextInt();
		System.out.println("Enter exponent value");
		int exponent=scan.nextInt();
		int sum=1;
		for(int i=1;i<=exponent;i++)
		{
			sum=base*sum;
		}
		System.out.println("Result: "+sum);
	}

}
