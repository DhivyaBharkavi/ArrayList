package exercise1aug19;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareCubeTest {
	private  static int n,i;
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		SquareCube sc = new SquareCube(); 
		ArrayList s = new ArrayList();
		ArrayList c = new ArrayList();
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter elements "+i); 
		n=scan.nextInt();
		list.add(n);
		}
		System.out.println("Given elements are ");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		sc.getInput(list);
		
		System.out.println("Square elements are");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		s=sc.square(list);
		System.out.println(s);
		
		System.out.println("Cube  elements are");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		c=sc.cube(list);
		System.out.println(c);
	}

}
