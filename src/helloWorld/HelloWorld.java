
package helloWorld;
import java.util.Scanner;
import java.util.*;
//import java.lang.NullPointerException;
public class HelloWorld {

	public static void main(String[] args) {
		double total = 0.0, cost1=0,cost2= 0;
	String productCode="0";
				// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(System.in);
	        System.out.println("enter product code: ");
	         productCode = sc.nextLine();
	       
	        System.out.println("enter cost : ");
	         cost1 = sc.nextDouble();
	         cost2 = sc.nextDouble();

	        total = cost1 + cost2;
		}
		catch(Exception e)
		{
			System.out.println("Error" + e.getMessage());
		}
        
        System.out.println("productCode is :" + productCode + "\ncost1 is: " +cost1 + "\ncost2 is: " +cost2 + "\nTotal is: " + total);
        
	}
	
	

}
