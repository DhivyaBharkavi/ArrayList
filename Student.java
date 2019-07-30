package exercise30july19;

public class Student {
	int regno;
	String name;
	String city;
	Student()
	{
		regno=12;
		name="Dhivya";
		city="Pavoor";
	}
	public String toString()//If you call the object to converts toString() it is override
	{// ToString() - has Object is a super class
		String str = " Regno : "+regno+" Name : "+name+" City : "+city;
		return str;
	}
}
