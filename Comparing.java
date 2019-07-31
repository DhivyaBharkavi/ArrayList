package exercise31july19;
import java.util.Collections;

public class Comparing {//implements Comparable<Integer> {
	private int regno;
	private String name,location;
	public Comparing()
	{
		regno=34;
		name="Anju";
		location="Thisyavinali";
	}
	public Comparing(int regno, String name, String location) {
		super();
		this.regno = regno;
		this.name = name;
		this.location = location;
	}
	public int Comparable(Comparing c)
	{
		if(this.regno==c.regno)
		{
			return 0;
		}
		else if(this.regno > c.regno)
		{
			return 1;
		}
		else
			return -1;
	}
	public String toString()
	{
		String str=" Regno "+regno+" Name "+name+" Location "+location;
		System.out.println(str);
		return str;
	}

	/*public int compareTo(Integer o) {
		if(this.regno==o.reg)
		{
			return 0;
		}
		else if(this.regno > o.regno)
		{
			return 1;
		}
		else
			return -1;
		return 0;
	}*/

}
