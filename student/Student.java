package org.student;

import org.college.College;

public class Student extends College {

	public void studentName() {
		System.out.println("Student Name : Karthik");
	}

	public void studentDept() {
		System.out.println("Student Dept : CS");
	}

	public void studentId() {
		System.out.println("Student Id : 1220888");
	}

	public static void main(String[] args) {

		Student obj = new Student();

		obj.studentName();
		obj.studentId();
		obj.studentDept();
		obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();

	}

}
