package exercise1aug19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FactorialsArraylistTest {
	 static int n,i;
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList fact = new ArrayList();
		Scanner scan = new Scanner(System.in);
		FactorialsArraylist fl = new FactorialsArraylist();
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter elements "+i); 
		n=scan.nextInt();
		list.add(n);
		}
		System.out.println("Given elements are ");
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		fl.getFact(list);
		
		System.out.println("Factorial of elements using ArrayList with return type ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		ArrayList fact=fl.factorials(list);
		System.out.println("Factorials of "+list+" number is "+fact);
		
		
		System.out.println("Factorial of elements using ArrayList with void method ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		FactorialsArraylist fl1 = new FactorialsArraylist();
		fl1.factorials1(list);
		
		
		/*System.out.println("Factorial elements using iterator method");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=1;i<list.size();i++)
		{
			ArrayList fact1=fl.factorials(list);
			
			System.out.println("Factorials of "+fact1);
		}*/
		
		
	}

}
