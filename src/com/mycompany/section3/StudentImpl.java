package com.mycompany.section3;

public class StudentImpl extends PersonBaseImpl implements Student {
	private String name,takenCourseTitle;

	public StudentImpl(String _name, String _takenCourseTitle ) {
		super(_name);
		name = _name;
		takenCourseTitle = _takenCourseTitle;
	}
	public String getName() {
		return name;
	}
	public String studiesFor(){
		return takenCourseTitle;
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "student";
	}
		
}
