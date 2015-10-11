/**
 *   File Name: Teacher.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 8, 2015
 *
 */

package com.sqa.employees;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher //ADDD (description of class)
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
public class Teacher extends Employee {

	public enum SpecificSubjects {
		BAND, BIOLOGY, CHEMISTRY, CHORUS, JAZZ, MOLECULAR, ORCHESTRA, PHYSICS;
	}

	public enum Subjects {
		ENGLISH, MATH, MUSIC, SCIENCE
	}

	private boolean hasAssistant;

	private Set<SpecificSubjects> specificSubjects;

	private String subject;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String address, int empId, String empType, boolean hasAssistant,
			Set<SpecificSubjects> specificSubjects, String subject) {
		super(name, age, address, empId, empType);
		this.hasAssistant = hasAssistant;
		this.specificSubjects = specificSubjects;
		this.subject = subject;
	}

	public Set<SpecificSubjects> getSpecificSubjects() {
		return specificSubjects;
	}

	public String getSubject() {
		return subject;
	}

	public boolean isHasAssistant() {
		return hasAssistant;
	}

	@Override
	public void requestValues() {
		super.requestValues();

		boolean contains = false;

		while (!contains) {
			System.out.println("Which subject does the teacher teach?");
			System.out.print("[ ");
			for (Subjects s : Subjects.values()) {
				System.out.print(s + " ");
			}
			System.out.println("]");
			String input = scanner.nextLine();

			for (Subjects s : Subjects.values()) {
				if (input.equalsIgnoreCase(s.toString())) {
					contains = true;
				}
			}
			if (!contains) {
				System.out.println("You did not enter a valid subject.");
			} else {
				this.setSubject(input.toUpperCase());
			}
		}

		Set<SpecificSubjects> specificSubjects = new HashSet<SpecificSubjects>();

		System.out.println("Which specific subject(s) does " + this.getName() + " teach?");

		boolean hasMoreSubjects = true;

		while (hasMoreSubjects) {

			boolean containsSpecSubject = false;

			while (!containsSpecSubject) {
				System.out.println("Please provide a specific subject:");

				System.out.print("[ ");
				for (SpecificSubjects s : SpecificSubjects.values()) {
					System.out.print(s + " ");
				}
				System.out.println("]");

				String input = scanner.nextLine();

				for (SpecificSubjects s : SpecificSubjects.values()) {
					if (input.equalsIgnoreCase(s.toString())) {
						containsSpecSubject = true;
					}
				}
				if (!containsSpecSubject) {
					System.out.println("You did not enter a valid subject.");
					hasMoreSubjects = !(AbstractPerson
							.requestBooleanValue("Would you like to cancel adding a Specific Subject?"));
					containsSpecSubject = !hasMoreSubjects;
				} else {
					specificSubjects.add(SpecificSubjects.valueOf(input.toUpperCase()));
					hasMoreSubjects = AbstractPerson
							.requestBooleanValue("Would you like to enter another Specific Subject?");
				}

			}
		}
		this.setSpecificSubjects(specificSubjects);
		this.setHasAssistant(requestBooleanValue("Does " + getName() + " have an assistant?"));
	}

	public void setHasAssistant(boolean hasAssistant) {
		this.hasAssistant = hasAssistant;
	}

	public void setSpecificSubjects(Set<SpecificSubjects> specificSubjects) {
		this.specificSubjects = specificSubjects;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() + ", hasAssistant=" + hasAssistant + ", specificSubjects=" + specificSubjects
				+ ", subject=" + subject;
	}

}
