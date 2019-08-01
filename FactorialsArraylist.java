package exercise1aug19;

import java.util.ArrayList;

public class FactorialsArraylist {
	ArrayList factorial = new ArrayList();
	ArrayList<Integer> factorial1 = new ArrayList<Integer>();
	ArrayList result = new ArrayList();
	public void getFact(ArrayList list)
	{
		System.out.println("Given elements "+list);
	}
	public ArrayList factorials(ArrayList<Integer> fac)
	{
		for(int j=0;j<fac.size();j++)
		{
		int fact=1;
		for(int i=1;i<=fac.get(j);i++)
		{
		fact=fact*i;
		}
		factorial.add(fact);
		}
		return factorial;
	}
	public void factorials1(ArrayList<Integer> fa)
	{
		for(int i=0;i<fa.size();i++)
		{
			int facts=1;
			for(int j=1;j<=(int)fa.get(i);j++)
			{
				facts=facts*j;
			}
			result.add(facts);
		}
		System.out.println("Factorials of "+result);
	}
	
}
