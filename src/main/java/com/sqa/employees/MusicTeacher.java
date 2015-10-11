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
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class MusicTeacher extends Teacher {
	public enum Instruments {
		DRUM, GUITAR, HARMONICA, PIANO, VIOLIN;
	}

	private Set<Instruments> instruments;

	public MusicTeacher() {
		super();
	}

	public MusicTeacher(String name, int age, String address, int empId, String empType, boolean hasAssistant,
			Set<SpecificSubjects> specificSubjects, String subject, boolean hasLab) {
		super(name, age, address, empId, empType, hasAssistant, specificSubjects, subject);
	}

	@Override
	public void requestValues() {
		super.requestValues();
	}
}
