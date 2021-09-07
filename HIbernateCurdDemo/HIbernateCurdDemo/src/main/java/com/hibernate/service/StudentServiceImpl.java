package com.hibernate.service;

import java.util.List;

import com.hibernate.dao.StudentDao;
import com.hibernate.dao.StudentDaoImpl;
import com.hibernate.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	@Override
	public Student getStudentById(long id) {
		Student studentObj = studentDao.getStudentById(id);
		return studentObj;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentObj = studentDao.getStudents();
		return studentObj;
	}

	@Override
	public void deleteStudent(long id) {
		studentDao.deleteStudentById(id);

	}

}
