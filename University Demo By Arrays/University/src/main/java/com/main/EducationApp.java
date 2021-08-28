package com.main;

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;
import com.service.DepartmentService;
import com.service.DepartmentServiceImpl;

/**
 * 
 * @author devalla.nagendrababu
 *
 */
public class EducationApp {
	public static void main(String[] args) {
		Student student1 = new Student(123, "Nagendra", 25);
		Student student2 = new Student(456, "Mounika", 5);
		Student student3 = new Student(789, "Madhu", 1);
		Student student4 = new Student(11, "Narendra", 32);
		Student student5 = new Student(12, "Aravind", 31);

		Department department = new Department();
		department.setDeptId(100);
		department.setDeptName("MCA");
		Department dep = new Department();
		dep.setDeptId(101);
		dep.setDeptName("MBA");

		College college1 = new College();
		college1.setCollegeId("A20");
		college1.setCollegeName("Geethanjali");

		College college2 = new College();
		college2.setCollegeId("B21");
		college2.setCollegeName("Nethaji");
		College[] college = new College[2];
		college[0] = college1;
		college[1] = college2;
		Department[] departments = new Department[2];
		departments[0] = department;
		departments[1] = dep;
		college1.setDepartments(departments);
		student1.setDepartment(department);
		student2.setDepartment(dep);
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		department.setStudent(students);
		Student[] batch2 = new Student[2];
		batch2[0] = student4;
		batch2[1] = student5;
		dep.setStudent(batch2);
		University university = new University();
		university.setUniversityCode(122);
		university.setUniversityName("JNTUK");
		university.setColleges(college);

		DepartmentService departmentService = new DepartmentServiceImpl();

		Student student = departmentService.searchStudentById(department, 456);
		// Student[] student = departmentService.searchStudentById(departments, 456);

		Department departmentObj = departmentService.searhDepartmentsByDepartmentId(college1, "A20");
		College collegeresult = departmentService.searchCollegeName(university, "Geethanjali");

		if (departmentObj != null) {
			System.out.println("College Name : " + college1.getCollegeName());
			System.out.println("College id :" + college1.getCollegeId());

			for (int i = 0; i < college1.getDepartments().length; i++) {
 
				System.out.println("Department Id :" + departments[i].getDeptId());
				System.out.println("Department Name :" + departments[i].getDeptName());

			}
			System.out.println();
		}

		Student batch = departmentService.searchStudentById(dep, 12);
		if (batch != null) {
			System.out.println("student id :" + batch.getStudId());
			System.out.println("student name :" + batch.getStudName());
			System.out.println("student age :" + batch.getStudAge());
			System.out.println("student departmentid :" + dep.getDeptId());
			System.out.println("student department Name :" + dep.getDeptName());
			System.out.println("student collegeName : " + college1.getCollegeName());
			if (collegeresult != null) {
				System.out.println("student UniversityName :" + university.getUniversityName());
			}
			System.out.println();
		}
		if (student != null) {
			System.out.println("student id :" + student.getStudId());
			System.out.println("student name :" + student.getStudName());
			System.out.println("student age :" + student.getStudAge());
			System.out.println("student departmentid :" + department.getDeptId());
			System.out.println("student department Name :" + department.getDeptName());
			System.out.println("student collegeName : " + college2.getCollegeName());
			System.out.println("student UniversityName :" + university.getUniversityName());
		}
		 System.out.println();
		Student studentObj = departmentService.searchStudentByName(department,"Nagendra");
		if (studentObj != null) {
			System.out.println("student id :" + studentObj.getStudId());
			System.out.println("student name: " + studentObj.getStudName());
			System.out.println("student age :" + studentObj.getStudAge());
			System.out.println("student departmentid : " + department.getDeptId());
			System.out.println("student department Name :" + department.getDeptName());
			System.out.println("student collegeName : " + college2.getCollegeName());
			System.out.println("student UniversityName :" + university.getUniversityName());
		}

	}

}