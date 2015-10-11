/**
 *   File Name: EmployeesTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 8, 2015
 *
 */

package com.sqa.employees;

import org.junit.Ignore;
import org.junit.Test;

/**
 * EmployeesTest //ADDD (description of class)
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
public class EmployeesTest {

	@Test
	@Ignore
	public void test() {
		Employee employee = new Employee();
		System.out.println("Your employee object details:" + employee.toString());

	}

	@Test
	@Ignore
	public void test2() {
		Employee teacher = new Teacher();

		System.out.println("Your teacher object details:" + teacher.toString());

	}

	@Test
	@Ignore
	public void test3() {
		boolean isHappy = AbstractPerson.requestBooleanValue("Are you happy?");
		if (isHappy) {
			System.out.println("I am glad you are happy!!!");
		} else {
			System.out.println("Sorry to hear you are not so happy...");
		}

	}

	@Test
	public void test4() {
		Employee teacher = new ScienceTeacher();

		System.out.println("Your Science teacher object details:" + teacher);

	}

}
