package exercise31july19;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
	public void Studentlist(ArrayList al)
	{
		System.out.println("List of students by using passing parameter in main method ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(al);
		System.out.println("\n");
	}
	public void getStudent(ArrayList list)
	{
		System.out.println("Number of students using void method with parameter ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int size = list.size();
		System.out.println("Number of students is "+size);
		System.out.println("\n");
	}
	public int getStudentCount(ArrayList count)
	{
		System.out.println("Number of students using method with parameter and return type ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int co=count.size();
		System.out.println(" Number of students are "+co);
		System.out.println("\n");
		return co;
	}
	public void sublist(ArrayList l)
	{
		System.out.println(" SubList method in Collection Framework of List using void method with parameter ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		List li = l.subList(1, 4);
	//	ArrayList al=(ArrayList) l.subList(1, 2);//It can't be casting in java.util.ArrayList package
		System.out.println(li);
		System.out.println("\n");
		//System.out.println(al);
	}
	public List getSubList1(ArrayList li,int start, int end)
	{
		System.out.println(" SubList method in Collection Framework of List using a method with parameter and return type");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		List ls=li.subList(start, end);
		return ls;
	}
	
}
