package patika;
import java.util.Scanner;
public class combination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n and r values");
		int n=scan.nextInt();
		int r=scan.nextInt();
		int output=fac(n)/(fac(r)*fac(n-r)); //C(n,r) = n! / (r! * (n-r)!)
		System.out.println(output);
	}
	public static int fac(int x) //faktöriyel işlemi
	{
		int fac=1;
		for(int i=1;i<=x;i++) {
			fac=fac*i;
		}
		return fac;
	}
}
