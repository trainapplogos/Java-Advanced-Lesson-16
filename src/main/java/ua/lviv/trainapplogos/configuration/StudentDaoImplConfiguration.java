package ua.lviv.trainapplogos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.trainapplogos.dao.Impl.StudentDaoImpl;

@Configuration
public class StudentDaoImplConfiguration {

	@Bean(name = "studentDaoImpl")
	public StudentDaoImpl getStudentDaoImplConfiguration() {
		return StudentDaoImpl.getStudentDaoImplInst();
	}
	
}
