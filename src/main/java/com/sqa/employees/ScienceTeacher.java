/**
 *   File Name: ScienceTeacher.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 8, 2015
 *
 */

package com.sqa.employees;

import java.util.Set;

/**
 * ScienceTeacher //ADDD (description of class)
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
public class ScienceTeacher extends Teacher {
	private boolean hasLab;

	public ScienceTeacher() {
		super();
	}

	public ScienceTeacher(String name, int age, String address, int empId, String empType, boolean hasAssistant,
			Set<SpecificSubjects> specificSubjects, String subject, boolean hasLab) {
		super(name, age, address, empId, empType, hasAssistant, specificSubjects, subject);
		this.hasLab = hasLab;
	}

	public boolean isHasLab() {
		return hasLab;
	}

	@Override
	public void requestValues() {
		super.requestValues();
		this.setHasLab(
				AbstractPerson.requestBooleanValue("Does " + getName() + "'s class structure include Lab work?"));

	}

	public void setHasLab(boolean hasLab) {
		this.hasLab = hasLab;
	}

	@Override
	public String toString() {
		return super.toString() + ", hasLab=" + hasLab;
	}
}
