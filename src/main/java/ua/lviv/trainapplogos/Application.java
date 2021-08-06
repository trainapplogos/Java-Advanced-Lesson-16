package ua.lviv.trainapplogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.trainapplogos.dao.StudentDao;
import ua.lviv.trainapplogos.domain.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		StudentDao studentDao = (StudentDao) ctx.getBean("studentDao");
		
		//create
		studentDao.create(new Student(0, "Jonh", 20));
		studentDao.create(new Student(1, "Peter", 23));
		studentDao.create(new Student(2, "Matthew", 35));
		studentDao.create(new Student(3, "Lucas", 47));

		//read
		Student stud2nd = studentDao.read(1);
		System.out.println("> The 2nd student is " + stud2nd);
		
		//update
		stud2nd.setAge(55);
		studentDao.update(stud2nd);
		System.out.println("> The 2nd student after update: " + stud2nd);
		
		//delete
		Student stud1st = studentDao.read(0);
		System.out.println("> The 1st student before delete: " + stud1st);
		studentDao.delete(0);
		stud1st = studentDao.read(0);
		System.out.println("> The 1st student after delete: " + stud1st);	
	}
}
