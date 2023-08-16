package com.hibernate.DemoHib;

public class MyProgram {

	public static void main(String[] args) {
		
		Student stud = new Student(1,"kavya","java",87866686868l,"kozhikode");
		
		Database.insertStudent(stud);
		

	}

}
