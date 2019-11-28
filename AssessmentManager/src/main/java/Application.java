import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		// Integer list manipulation example 
		List<Integer> myList= new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		System.out.println(myList);
		// or rather like this 
		int[] myArray = new int[]{7,2,4};

		for (int number: myList) {
			System.out.println(number);
		}
		
		
		
		// Teacher object
        Address address = new Address ("Bxl",1000,"Rue du test",10);
		Teacher combe = new Teacher(14,"seb","Combefis","PWD");
		System.out.println(combe.firstName);
		// Teacher object list 
		List<Teacher> myTeachers = new ArrayList<Teacher>();
		myTeachers.add(combe);
		System.out.println(myTeachers.get(0).firstName);
	}

}
