package patika;
import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int number=scan.nextInt();
		
		int total=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				total=total+i;
			}
		}
		
		if(total==number)
		{
			System.out.println(number+" Mükemmel sayıdır");
		}
		else
		{
			System.out.println(number+" Mükemmel sayı değildir");
		}
	}

}
