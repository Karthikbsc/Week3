package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop Siz : 15'inch");
	}

	public static void main(String[] args) {

		Desktop obj = new Desktop();
		System.out.println("*Single Inheritance*");
		obj.desktopSize();
		obj.computerModel();

	}

}
