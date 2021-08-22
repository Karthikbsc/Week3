package org.students;

public class Students {

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID & name : " + id + " & " + name);

	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Email & Number : " + email + " & " + phoneNumber);

	}

	public static void main(String[] args) {

		Students obj = new Students();
		obj.getStudentInfo(1220888, "karthik");
		obj.getStudentInfo("kar@gmail.com", 9976543212L);
	}

}
