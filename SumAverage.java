package exercise31july19;

import java.util.ArrayList;

public class SumAverage {
	private int sum=0,avg,count=0;
	public void getInput(ArrayList li )
	{
		System.out.println("Given elements are "+li);
	}
	public int sumOfElements(ArrayList<Integer> lis)
	{
		for(int i=0;i<lis.size();i++)
		{
		sum=sum+lis.get(i);
		count++;
		}
		return sum;
	}
	public int average(ArrayList<Integer> al)
	{
		for(Integer i:al)
		{
			avg=sum/count;
			//System.out.println("Avg "+avg+" sum "+sum+" I is "+i);
		}
		
		return avg;
	}
}
