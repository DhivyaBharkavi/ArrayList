package exercise30july19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	ArrayList numbers = new ArrayList();
	ArrayList backupList = new ArrayList();
	public void processArrayList()
	{
		
		numbers.add(5);
		numbers.add(50);
		numbers.add(15);
		numbers.add(45);
		numbers.add(53);
		System.out.println("Array elements in  normal");
		System.out.println("=========================");
		System.out.println(numbers);
		
		System.out.println("Backup elements in addAll Method");
		System.out.println("=========================");
		backupList.addAll(numbers);
		System.out.println(backupList);
		
		System.out.println("Backup using iterator method1");
		System.out.println("=========================");
		backupList.iterator();
		System.out.println(backupList);
		
		System.out.println("Add elements in array list");
		System.out.println("=========================");
		numbers.add(3, 12);
		System.out.println(numbers);
		
		System.out.println("Remove elements in array list");
		System.out.println("=========================");
		numbers.remove(4);
		System.out.println(numbers);
		
		System.out.println("Remove elements in array list");
		System.out.println("=========================");
		//numbers.remove(53);
		System.out.println(numbers.remove(null));
		
		
		
		System.out.println("Backup using in iterator method2");
		System.out.println("=========================");
		Iterator itr = backupList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Backup using sum in iterator method3");
		System.out.println("=========================");
		Iterator itr2 = backupList.iterator();
		int sum=0;
		while(itr2.hasNext())
		{
			sum=sum+(int)itr2.next();
			//System.out.println(itr2.next());
		}
		System.out.println("Sum of all elements "+sum);
		
		System.out.println("Sorted Ascending Order");
		System.out.println("=========================");
		Collections.sort(numbers);
		System.out.println(numbers);
		
		System.out.println("Sorted Descending Order");
		System.out.println("=========================");
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
		System.out.println("Sorted Descending Order using reverse method");
		System.out.println("=========================");
		Collections.reverse(backupList);
		System.out.println(backupList);
		
	}
	
}
