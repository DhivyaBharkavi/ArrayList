package exercise1aug19;

import java.util.ArrayList;

public class SquareCube {
	
	public void getInput(ArrayList al)
	{
		System.out.println(al);
	}
	public ArrayList square(ArrayList sq)
	{
		ArrayList result = new ArrayList();
		for(int i=0;i<sq.size();i++)
		{
			int s=(int)sq.get(i);
			//double d=Math.pow(s, 3);
			result.add(s*s);
		}
		return result;
	}
	public ArrayList cube(ArrayList cu)
	{
		ArrayList result = new ArrayList();
		for(int i=0;i<cu.size();i++)
		{
			int c=(int)cu.get(i);
			result.add(Math.pow(c, 3));
		}
		return result;
	}
}
