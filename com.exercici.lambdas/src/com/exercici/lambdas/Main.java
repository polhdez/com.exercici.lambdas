package com.exercici.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		// Lists
		List<String> names = new ArrayList<String>();
		names.add("José");
		names.add("Pepe");
		names.add("Roberto");
		names.add("Alberto;");
		names.add("Andrea");
		names.add("María");
		names.add("Ana");
		names.add("Oriol");
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		
		List<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		// Level 1
		
		System.out.println("\n[*] Level 1");
		
		System.out.println("\nPrints names matching the first letter 'A' and with a length of 3");
		names.stream().filter(str -> str.substring(0,1).equals("A") && str.length() == 3).forEach(System.out::println);
		
		System.out.println("\nReturns a comma separated string appending e or o to the start of the number if they are even or odd");
		nums.stream().forEach(n -> { if(n % 2 == 0) System.out.print("e" + n  + ","); else System.out.print("o" + n + ","); });
		System.out.println();
		
		System.out.println("\nPrints names that contain the 'o' character");
		names.stream().filter(str -> str.contains("o") || str.contains("O")).forEach(System.out::println);
		
		System.out.println("\nPrints names that have more than 5 chars");
		names.stream().filter(str -> str.length() > 5).forEach(System.out::println);
		
		System.out.println("\nPrinting all the months with a lambda");
		months.forEach(str -> System.out.println(str));
		
		System.out.println("\nPrinting all the months with method reference");
		months.forEach(System.out::println);
		
		// Level 2
		
		System.out.println("\n[*] Level 2");
		
		List<String> lvl2list = new ArrayList<String>();
		lvl2list.add("lorem");
		lvl2list.add("8475");
		lvl2list.add("ipsum");
		lvl2list.add("3274");
		lvl2list.add("dolor");
		lvl2list.add("1342");
		lvl2list.add("sit");
		lvl2list.add("7362");
		lvl2list.add("amet");
		
		System.out.println("\nOrdering strings by length");
		lvl2list.stream().sorted((a,b) -> Integer.compare(a.length(), b.length())).forEach(System.out::println);
		
		System.out.println("\nThe same but in reverse");
		lvl2list.stream().sorted((a,b) -> Integer.compare(b.length(), a.length())).forEach(System.out::println);
		
		System.out.println("\nAlphabetically");
		lvl2list.stream().sorted((a,b) -> Integer.compare(a.charAt(0), b.charAt(0))).forEach(System.out::println);
		
		System.out.println("\nReplace 'a' by '4'");
		lvl2list.stream().map(str -> str.replace("a", "4")).forEach(System.out::println);
		
		System.out.println("\nShow only numbers");
		lvl2list.stream().filter(str -> { try { Integer.parseInt(str); return true; }
										catch(NumberFormatException e) { return false; }}).forEach(System.out::println);
		
		// Level 3
		System.out.println("\n[*] Level 3");
		
		System.out.println("\nCreate new sorted list filtering the students list starting by 'A'");
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Juan", 34, "PHP", 5));
		students.add(new Student("Antonia", 30, "Python", 3));
		students.add(new Student("Pepe", 22, "Javascript", 8));
		students.add(new Student("Jose", 34, "PHP", 5));
		students.add(new Student("Alberto", 40, "Python", 1));
		students.add(new Student("Maria", 25, "PHP", 4));
		students.add(new Student("Ana", 31, "Java", 10));
		students.add(new Student("Carmen", 29, "Java", 3));
		students.add(new Student("Mariano", 16, "Java", 6));
		students.add(new Student("Laura", 17, "Java", 7));
		
		List<Student> sortedStudents = students.stream().filter(a -> a.getName().substring(0,1).equals("A")).collect(Collectors.toList());
		sortedStudents.forEach(a -> System.out.println(a.getInfo()));
		
		System.out.println("\nDisplay the students with a 5 or more grades");
		students.stream().filter(a -> a.getGrades() >= 5).forEach(a -> System.out.println(a.getInfo()));
		
		System.out.println("\nDisplay the students with a 5 or more grades and they are not doing PHP");
		students.stream().filter(a -> a.getGrades() >= 5 && !a.getCourse().equals("PHP")).forEach(a -> System.out.println(a.getInfo()));
		
		System.out.println("\nDisplay the students that are over 18 and do Java");
		students.stream().filter(a -> a.getCourse().equals("Java") && a.getAge() >= 18).forEach(a -> System.out.println(a.getInfo()));
	}
}
