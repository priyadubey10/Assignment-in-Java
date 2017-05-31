package Assignment;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		  int i,m=0,boolval=0;    
		  int n;//it is the number to be checked 
		  System.out.println("Enter the Number:");
		  
		  Scanner in=new Scanner(System.in);
		  n=in.nextInt();
		  m=n/2;    
		  for(i=2;i<=m;i++){    
		   if(n%i==0){    
		   System.out.println("Number is not prime");    
		   boolval=1;    
		   break;    
		   }    
		  }    
		  if(boolval==0)    
		  System.out.println("Number is prime");   

	

}
}
