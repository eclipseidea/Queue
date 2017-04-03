package core_04;

import java.util.Comparator;

public class SortByAgeB implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge()-o2.getAge();
	}

}
