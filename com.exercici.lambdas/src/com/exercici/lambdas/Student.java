package com.exercici.lambdas;

public class Student {
	private String name;
	private int age;
	private String course;
	private double grades;
	
	public Student(String name, int age, String course, double grades) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.grades = grades;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getCourse() {
		return this.course;
	}
	
	public double getGrades() {
		return this.grades;
	}
	
	public String getInfo() {
		return "Name: " + this.name + " Age: " + this.age + " Course: " + this.course + " Grades: " + this.grades;
	}
}
