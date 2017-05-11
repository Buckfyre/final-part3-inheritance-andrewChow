package com.mycompany.section3;

public class MainEntry {

	public static void main(String[] args) {
		// local variables
		Teacher t = new TeacherImpl("ilker", "java");
		Student s = new StudentImpl("andrew", "java");

		Person p1 = (Person) t;
		Person p2 = (Person) s;
		
		// output
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}

}
