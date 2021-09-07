package com.hibernate.dao;

import java.util.List;

import com.hibernate.model.Student;

public interface StudentDao {
	public abstract void saveStudent(Student student);

	public abstract void updateStudent(Student student);

	public abstract Student getStudentById(long id);

	public abstract List<Student> getStudents();

	public abstract void deleteStudentById(long id);

}
