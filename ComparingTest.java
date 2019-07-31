package exercise31july19;

import java.util.ArrayList;
import java.util.Collections;

public class ComparingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		Comparing cc = new Comparing();
		Comparing c = new Comparing(12,"Dhivya","Pavoor");
		Comparing c1 = new Comparing(22,"Bharu","Singapore");
		Comparing c2 = new Comparing(2,"Sivaprasath","Madurai");
		Comparing c3 = new Comparing(126,"Bhuvaneswari","Sivakasi");
		Comparing c4 = new Comparing(52,"Guru","Tirunelveli");
		list.add(c);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		//System.out.println(list);
		String result=cc.toString();
		System.out.println("List of students passing parameter  ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(result);
		System.out.println("\n");
		System.out.println("List of students display a given ordering");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
