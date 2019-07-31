package exercise31july19;

import java.util.List;
import java.util.ArrayList;



public class StudentInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		ArrayList list1=new ArrayList();
		StudentInfo s = new StudentInfo();
		 list.add("Dhivya");
		 list.add("Bharkavi");
		 list.add("Anju");
		 list.add("Goodwin");
		 list.add("Bhuvaneswari");
		 s.Studentlist(list);
		 s.getStudent(list);
		 int noOfStudent=s.getStudentCount(list);
		 System.out.println("Number of students using passing parameter in main method ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("Number of students are "+noOfStudent);
		 System.out.println("\n");
		 s.sublist(list);
		 List lt=s.getSubList1(list, 2, 4);
		 System.out.println(lt);
		 System.out.println("\n");
	}

}
