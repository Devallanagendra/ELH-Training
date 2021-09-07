package com.hibernate.service;

import java.util.List;

import com.hibernate.model.Student;

public interface StudentService {

	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(long id);

	List<Student> getAllStudents();

	void deleteStudent(long id);

}
