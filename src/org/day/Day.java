package org.day;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
	
		Scanner a = new Scanner(System.in);
		
		String name = a.nextLine();
		System.out.println(name);
		
		int empId = a.nextInt();
		System.out.println("Employee Id:"+empId);
		
		String empEmail = a.nextLine();
		System.out.println("Emp Email"+empEmail);
	
	
	}

}
