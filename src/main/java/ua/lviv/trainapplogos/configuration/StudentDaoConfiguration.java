package ua.lviv.trainapplogos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.trainapplogos.dao.StudentDao;
import ua.lviv.trainapplogos.dao.Impl.StudentDaoImpl;

@Configuration
public class StudentDaoConfiguration {

	@Bean(name = "studentDao")
	public StudentDao getStudentDaoConfiguration() {
		return StudentDaoImpl.getStudentDaoInst();
	}
	
}
