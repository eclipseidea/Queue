package core_04;

import java.util.Scanner;
import java.util.UUID;

public class Main_MyQueue {
	static Scanner scanner = new Scanner(System.in);

	public static void info() {

		System.out.println("Input collection size: ");
	}

	public static void main(String[] args) {
		Main_MyQueue.info();
		MyQueue myQueue = new MyQueue();
		while (true) {
			System.out.println("Enter 1 for add person");
			System.out.println("Enter 2 for exit");
			String menu = Main_MyQueue.scanner.next();
			switch (menu) {
			case "1":
				myQueue.offer(new Person(UUID.randomUUID().toString()
						.replaceAll("[0-9]", "").toUpperCase().substring(0, 3),
						10 + (int) (Math.random() * (99 - 10))));
				myQueue.iterator();
				break;
			case "2":
				System.exit(2);
				break;
			}
		}

	}

}
