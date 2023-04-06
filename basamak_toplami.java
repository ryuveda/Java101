package patika;
import java.util.Scanner;

public class basamak_toplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=scan.nextInt();
		int left,sum=0;
		int n=1;
		
	    for(int i=1;i<=n;i++) 
	    {
		left=number%10;
		sum=sum+left;
		number=number/10;
		n++;
		if(number<10) {
			sum=number+sum;
			 System.out.println(sum);
			break;
		}
	    }
	   
	}

}
