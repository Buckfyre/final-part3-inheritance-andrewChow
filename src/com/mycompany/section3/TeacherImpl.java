package com.mycompany.section3;

public class TeacherImpl extends PersonBaseImpl implements Teacher {
	private String name, thoughtCourseTitle;
	
	public TeacherImpl(String _name, String _thoughtCourseTitle ) {
		super(_name);
		name = _name;
		thoughtCourseTitle = _thoughtCourseTitle;
	}
		@Override
		public String getDetails() {
			return "teacher";
		}
		@Override
		public String teachesFor() {
			// TODO Auto-generated method stub
			return thoughtCourseTitle;
		}
}
