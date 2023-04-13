package patika;
import java.util.Scanner;


public class Paliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scan.nextInt();
		
		boolean result= isPalindrom(number);
		if(result==true) {
			System.out.println(number+" is a palindrome");
		}
		else
		{
			System.out.println(number+" is not a palindrome");
		}
		
	}
	
	static boolean isPalindrom(int number)
	{
		
		 
	    int reversedNum = 0, remainder;
	    
	    // store the number to originalNum
	    int originalNum = number;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (number != 0) {
	      remainder = number% 10;
	      reversedNum = reversedNum * 10 + remainder;
	      number /= 10;
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (originalNum == reversedNum) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	 
		
	}
}
