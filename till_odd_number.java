
package patika;
import java.util.Scanner;

public class till_odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int total=0;
		int number=0;
		
		do
		{
			System.out.print("Enter a number:");
			number =scan.nextInt();
			if(number%2==0 && number%4==0)
			{
				total=total+number;
			}		
		}while(number%2!=1);
		System.out.print(total);
		
	}

}
