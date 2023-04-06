package patika;
import java.util.Scanner;
public class math_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number \n");
		int number = scan.nextInt();
		int sum=0;
		int total=0;
		while(i<=number)
		{
			if(i%3==0 && i%4==0)
			{
				sum=sum+i;
				total++;
				System.out.print(i+" ");
			}				
			i++;
		}
		System.out.println("\nOrtalama :"+sum/total);
	}
}
