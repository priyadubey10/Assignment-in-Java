package Assignment;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		int x,y;
		System.out.println("Enter first Number");
		Scanner in= new Scanner(System.in);
		x=in.nextInt();
		System.out.println("Enter second Number");
		Scanner m= new Scanner(System.in);
		y=m.nextInt();
		x=x+y;
		y=x-y;
		x=x-y; 
		
		System.out.println("After swapping value of first number is " +x +"  and second is "  +y);
		
	}

}
