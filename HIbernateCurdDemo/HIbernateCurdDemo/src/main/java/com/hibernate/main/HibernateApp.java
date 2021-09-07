package com.hibernate.main;

import java.util.List;
import java.util.Scanner;

import com.hibernate.model.Student;
import com.hibernate.service.StudentService;
import com.hibernate.service.StudentServiceImpl;

public class HibernateApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter student name");
		String name = scanner.nextLine();
		System.out.println("enter student email");
		String email = scanner.nextLine();
		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		StudentService studentService = new StudentServiceImpl();
		studentService.saveStudent(student);
		student.setName("rani");
		studentService.updateStudent(student);
		Student student2 = studentService.getStudentById(student.getId());
		List<Student> students = studentService.getAllStudents();
		if(students!=null) {
		students.forEach(stud -> System.out.println(stud.getId()));
		}
		//studentService.deleteStudent(student.getId());
	}

}
