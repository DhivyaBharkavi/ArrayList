package exercise30july19;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
private	int n,i;
Scanner scan = new Scanner(System.in);
ArrayList numbers = new ArrayList();
ArrayList backupList = new ArrayList();
ArrayList even = new ArrayList();
ArrayList odd = new ArrayList();
public void getInput()
{
	for(int i=0;i<5;i++)
	{
	System.out.println("Enter a elements "+i);
	n=scan.nextInt();
	numbers.add(n);
	}
	System.out.println("Given elements "+numbers);
}
public void backup()
{
	System.out.println("Backup elements in add All Method");
	System.out.println("=========================");
	backupList.addAll(numbers);
	System.out.println(backupList);
}
public void oddOrEven()
{
	int check=0,count=0,count1=0;
	for(i=0;i<numbers.size();i++)
	{
		if((int)numbers.get(i) %2 ==0)
		{
			even.add(numbers.get(i));
			//System.out.println("Even numbers are "+even);
			check=1;
			count++;
		}
		else if((int)numbers.get(i) %2 ==1)
		{
			odd.add(numbers.get(i));
			check=2;
			count1++;
			//System.out.println("Odd numbers are "+odd);
		}
	
	if(check==1)
	{
		//even.add(numbers.get(i));
		System.out.println("Even numbers are "+even+" Numbers of times "+count+" Position is "+i);
	}
	else if(check==2)
	{
		//odd.add(numbers.get(i));
		System.out.println("Odd numbers are "+odd+" Numbers of times "+count1+" Position is "+i);
	}
	}
}
}
