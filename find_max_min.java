package patika;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class find_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Kaç tane sayı gireceksiniz:");
		int n = scan.nextInt();
		int[] number = new int[n];
		
		
		    for (int i = 0; i <= n-1; i++)
		    {
		        System.out.println((i+1)+".numarayı giriniz :");
		        number[i] = scan.nextInt();
		    }
		    int min = number[0];
			int max = number[0];
		    for (int j = 0; j < n; j++) {
		        min = Math.min(min, number[j]);
		        max = Math.max(max, number[j]);
		      }
		    System.out.println("Minimum sayı : "+ min );
		    System.out.println("Maximum sayı :"+max );
	}

}
