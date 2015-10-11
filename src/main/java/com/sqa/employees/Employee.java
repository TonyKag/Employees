/**
 *   File Name: Employee.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 7, 2015
 *
 */

package com.sqa.employees;

/**
 * Employee //ADDD (description of class)
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
public class Employee extends AbstractPerson {

	private int empId;
	private String empType;

	public Employee() {
		super();
	}

	public Employee(String name, int age, String address, int empId, String empType) {
		super(name, age, address);
		this.empId = empId;
		this.empType = empType;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpType() {
		return empType;
	}

	/**
	 * @see com.sqa.employees.AbstractPerson#requestValues()
	 */
	@Override
	public void requestValues() {
		System.out.print("What is the employee's name:");
		this.setName(scanner.nextLine());
		System.out.print("What is " + getName() + "'s age:");
		this.setAge(Integer.parseInt(scanner.nextLine()));
		System.out.print("What about their address:");
		this.setAddress(scanner.nextLine());
		System.out.print("What is there employee ID number:");
		this.setEmpId(Integer.parseInt(scanner.nextLine()));

		this.setEmpType(this.getClass().getSimpleName().toString());
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	@Override
	public String toString() {
		return super.toString() + ", empId=" + empId + ", empType=" + empType;
	}

}
