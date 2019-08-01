package exercise31july19;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAverageTest {
	private static int i,n;
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		SumAverage sa = new SumAverage();
		
		//System.out.println("Enter n value  ");
		
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter elements "+i); 
		n=scan.nextInt();
		list.add(n);
		}
		System.out.println("Given elements are ");
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		sa.getInput(list);
		//System.out.println("Given Elements are "+list);
		
		int sum = sa.sumOfElements(list);
		System.out.println("Sum of elements using size() a method and return type ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Sum of elements are "+sum); 
		
		double average=sa.average(list);
		System.out.println("Average of elements are "+average);
	}

}
