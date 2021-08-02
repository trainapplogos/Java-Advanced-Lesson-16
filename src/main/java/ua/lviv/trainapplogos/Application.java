package ua.lviv.trainapplogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.trainapplogos.dao.Impl.StudentDaoImpl;
import ua.lviv.trainapplogos.domain.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		StudentDaoImpl studentDaoImpl = (StudentDaoImpl) ctx.getBean("studentDaoImpl");
		
		//create
		studentDaoImpl.create(new Student(0, "Jonh", 20));
		studentDaoImpl.create(new Student(1, "Peter", 23));
		studentDaoImpl.create(new Student(2, "Matthew", 35));
		studentDaoImpl.create(new Student(3, "Lucas", 47));

		//read
		Student stud2nd = studentDaoImpl.read(1);
		System.out.println("> The 2nd student is " + stud2nd);
		
		//update
		stud2nd.setAge(55);
		studentDaoImpl.update(stud2nd);
		System.out.println("> The 2nd student after update: " + stud2nd);
		
		//delete
		Student stud1st = studentDaoImpl.read(0);
		System.out.println("> The 1st student before delete: " + stud1st);
		studentDaoImpl.delete(0);
		stud1st = studentDaoImpl.read(0);
		System.out.println("> The 1st student after delete: " + stud1st);	
	}
}
