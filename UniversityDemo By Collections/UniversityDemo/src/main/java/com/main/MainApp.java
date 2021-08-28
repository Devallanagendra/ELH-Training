package com.main;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.exception.MyException;
import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;
import com.service.DepartmantService;
import com.service.DepartmentServiceImpl;

/**
 * 
 * @author devalla.nagendrababu
 *
 */
public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		int idNo = scan.nextInt();
		Student student1 = new Student(11, "Nagendra", 22);
		Student student2 = new Student(12, "Mounika", 23);
		Student student3 = new Student(13, "Aravind", 24);
		Student student4 = new Student(14, "Rohini", 25);
		Student student5 = new Student(15, "Kalyan", 26);

		Student student6 = new Student(16, "Varun", 22);
		Student student7 = new Student(17, "Mouni", 23);
		Student student8 = new Student(18, "Kevin", 24);
		Student student9 = new Student(19, "Mike", 25);
		Student student10 = new Student(20, "Vikas", 26);

		Student student11 = new Student(21, "Arashad", 22);
		Student student12 = new Student(22, "Naresh", 23);
		Student student13 = new Student(23, "Junnu", 24);
		Student student14 = new Student(24, "Sunitha", 25);
		Student student15 = new Student(25, "Hema", 26);

		Student student16 = new Student(26, "Mouni", 22);
		Student student17 = new Student(27, "Kumar", 23);
		Student student18 = new Student(28, "Janu", 24);
		Student student19 = new Student(29, "Balu", 25);
		Student student20 = new Student(30, "Mahesh", 26);

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		students.add(student11);
		students.add(student12);
		students.add(student13);
		students.add(student14);
		students.add(student15);
		students.add(student16);
		students.add(student17);
		students.add(student18);
		students.add(student19);
		students.add(student20);

		Department department1 = new Department(101, "CSE", students);
		Department department2 = new Department(102, "MCA", students);
		Department department3 = new Department(201, "MBA", students);
		Department department4 = new Department(202, "BCA", students);
		Set<Department> departments = new HashSet<>();
		departments.add(department1);
		departments.add(department2);
		departments.add(department3);
		departments.add(department4);
		Department department = new Department();
		department.setStudents(students);

		College college1 = new College(1001, "Nethaji", departments);
		College college2 = new College(1002, "Geethanjali", departments);
		Set<College> colleges = new HashSet<>();
		colleges.add(college1);
		colleges.add(college2);
		College college = new College();
		college.setDepartments(departments);

		University university = new University(1234, "JNTU", colleges);
		university.setColleges(colleges);

		DepartmantService departmentService = new DepartmentServiceImpl();
		// Student info = null;
		try {
			Student info = departmentService.searchStudent(department, idNo);

			if (info != null) {

				if (info.getStudentId() >= 11 && info.getStudentId() <= 15) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college1.getCollegeId());
					System.out.println("College name is : " + college1.getCollegeName());
					System.out.println("Department Id is : " + department1.getDepartmentId());
					System.out.println("Department name is : " + department1.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());

				}

				else if (info.getStudentId() >= 16 && info.getStudentId() <= 20) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college1.getCollegeId());
					System.out.println("College name is : " + college1.getCollegeName());
					System.out.println("Department Id is : " + department2.getDepartmentId());
					System.out.println("Department name is : " + department2.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				} else if (info.getStudentId() >= 21 && info.getStudentId() <= 25) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college2.getCollegeId());
					System.out.println("College name is : " + college2.getCollegeName());
					System.out.println("Department Id is : " + department3.getDepartmentId());
					System.out.println("Department name is : " + department3.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				} else if (info.getStudentId() >= 26 && info.getStudentId() <= 30) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college2.getCollegeId());
					System.out.println("College name is : " + college2.getCollegeName());
					System.out.println("Department Id is : " + department3.getDepartmentId());
					System.out.println("Department name is : " + department3.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				}

			}

		} catch (MyException e) {
			System.err.println(e.getMessage());
		}
	}
}
