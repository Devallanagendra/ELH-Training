package com.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.Student;
import com.hibernate.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSeessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	@Override
	public void updateStudent(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSeessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(student);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	@Override
	public Student getStudentById(long id) {
		Transaction transaction = null;
		Student student = null;
		try (Session session = HibernateUtil.getSeessionFactory().openSession()) {
			transaction = session.beginTransaction();
			student = session.get(Student.class, id);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return student;
	}

	@Override
	public List<Student> getStudents() {
		Transaction transaction = null;
		List<Student> students = null;
		try (Session session = HibernateUtil.getSeessionFactory().openSession()) {
			transaction = session.beginTransaction();
			students = session.createQuery("from Student").list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return students;
	}

	@Override
	public void deleteStudentById(long id) {
		Transaction transaction = null;
		Student student = null;
		try (Session session = HibernateUtil.getSeessionFactory().openSession()) {
			transaction = session.beginTransaction();
			student = session.get(Student.class, id);
			session.delete(student);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

}
