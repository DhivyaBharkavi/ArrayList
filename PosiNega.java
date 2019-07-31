package exercise30july19;

import java.util.ArrayList;
import java.util.Scanner;

public class PosiNega {
	Scanner scan = new Scanner(System.in);
	private int n,i;
	ArrayList list = new ArrayList();
	ArrayList positive = new ArrayList();
	ArrayList negative = new ArrayList();
	public void getInput()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter a elements "+i);
			n=scan.nextInt();
			list.add(n);
		}
		System.out.println("Given elements "+list);
	}
	public void posNeg()
	{
		int check=0,count=0,count1=0;
		for(i=0;i<5;i++)
		{
			if((int)list.get(i)>0)
			{
				positive.add(list.get(i));
				check=1;
				count++;
			}
			else if((int)list.get(i)<0)
			{
				check=2;
				negative.add(list.get(i));
				count1++;
			}
		}
		if(check==1)
		{
			System.out.println("The positive numbers are "+positive+" Number of times  "+count);
		}
		else if(check==2)
		{
			System.out.println("The negative numbers are "+negative+" Number of times "+count1);
		}
	}
}
