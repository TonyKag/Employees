/**
 *   File Name: AbstractPerson.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 7, 2015
 *
 */

package com.sqa.employees;

import java.util.Scanner;

/**
 * AbstractPerson //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public abstract class AbstractPerson {

	protected static Scanner scanner = new Scanner(System.in);

	public static boolean requestBooleanValue(String question) {
		boolean endValue = true;
		while (true) {
			System.out.print(question);
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				endValue = true;
				break;
			} else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				endValue = false;
				break;
			} else {
				System.out.println("You must enter Yes/Y or No/N.");
				continue;
			}
		}
		return endValue;
	}

	private String address;

	private int age;

	private String name;

	public AbstractPerson() {
		requestValues();
	}

	public AbstractPerson(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public abstract void requestValues();

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", address=" + address;
	}

}
