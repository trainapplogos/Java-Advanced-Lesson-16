package ua.lviv.trainapplogos.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.trainapplogos.dao.StudentDao;
import ua.lviv.trainapplogos.domain.Student;

public class StudentDaoImpl implements StudentDao {
	private static StudentDaoImpl studentDaoImpl;
	private List<Student> list = new ArrayList<>();
	
	public static StudentDaoImpl getStudentDaoImplInst() {
		if (studentDaoImpl == null) {
			studentDaoImpl = new StudentDaoImpl();
		}
		return studentDaoImpl;
	}
	
	private StudentDaoImpl() {}
	
	@Override
	public Student create(Student student) {
		list.add(student);
		return student;
	}

	@Override
	public Student read(int id) {
		return list.get(id);
	}

	@Override
	public Student update(Student student) {
		Student studUpd = list.get(student.getId());
		
		if (studUpd != null) {
			studUpd.setName(student.getName());
			studUpd.setAge(student.getAge());
		} else {
			System.err.println("Error. Coudn't find Student" + student.getName());
		}
		
		return studUpd;
	}

	@Override
	public void delete(int id) {
		list.remove(id);
	}

}
