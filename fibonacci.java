package patika;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        int n1=0,n2=1,n3,i,n;
	        System.out.print("N Sayısını Girin:");
	        n = scan.nextInt();
	        System.out.print(n1+" "+n2);//0 ve 1 yazdır 
	  
	 for(i=2;i<n;++i) 
	 {  
	  n3=n1+n2;  
	  System.out.print(" "+n3);  
	  n1=n2;  
	  n2=n3;  
	    }
	 System.out.println();
	    }
	    
	}

