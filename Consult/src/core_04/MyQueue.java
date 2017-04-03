package core_04;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<Person> {

	private List<Person> persons = new ArrayList<Person>();
	
	private int capacity =Main_MyQueue.scanner.nextInt();

	public MyQueue() {

	}
	
	@Override
	public String toString() {
		return "MyQueue [persons=" + persons + "]";
	}

	@Override
	public boolean offer(Person e) {
		if (persons.size() < capacity) {
			persons.add(e);
		} else {
			Collections.sort(persons, new SortByAgeB());
			poll();
			persons.add(e);
		}
		Collections.sort(persons, new SortByAge());
		return true;
    }

	@Override
	public Person poll() {
		persons.remove(peek());
		return null;
	}

	@Override
	public Person peek() {
		return persons.get(0);
	}
	
	@Override
	public Iterator<Person> iterator() {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		    return iterator;
	}

	@Override
	public int size() {
		return size();
	}

}
