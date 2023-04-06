package patika;
import java.util.Scanner;

public class four_and_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			if(Math.sqrt(i)%4==0 && Math.sqrt(i)%5==0  ) {
				System.out.print(i+" ");
			}
		}
	}

}
