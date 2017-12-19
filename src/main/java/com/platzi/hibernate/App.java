package com.platzi.hibernate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.hibernate.dao.TeacherDaoImpl;
import com.platzi.hibernate.model.Course;
import com.platzi.hibernate.model.SocialMedia;
import com.platzi.hibernate.model.Teacher;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	/*
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        */
        /*
        Teacher teacher = new Teacher("Esteban Ramos","urlAvatar");
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();
        */
        /*
        Course course = new Course("Curso de Java Avanzado","Tema 1","RestAPI");
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
        */
    	
    	//Implementacion interfaz teacher DAO
    	TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
    	
    	//Guardar un teacher
    	/*
    	Teacher teacher = new Teacher("Esteban Ramos Fernandez","urlAvatar");
    	teacherDaoImpl.saveTeacher(teacher);
    	*/
    	
    	//Traer todos los teachers
    	/*
    	List<Teacher> teachers = teacherDaoImpl.findAllTeachers();
    	for (Teacher t : teachers) {
    		System.out.println("Nombre:" + t.getName());
    	}
    	*/
    	
    	//Traer un teacher por id
    	/*
    	Teacher teacher = teacherDaoImpl.findById(1L);
    	System.out.println(teacher);
    	System.out.println(teacher.getName());
    	System.out.println(teacher.getIdTeacher());
    	*/
    	
    	//Traer un teacher por nombre
    	/*
    	Teacher teacher = teacherDaoImpl.findByName("Esteban Ramos Fernandez");
    	System.out.println(teacher);
    	*/
    	
    	//Traer varios teachers por nombre
    	List<Teacher> teachers = teacherDaoImpl.findTeachersByName("Esteban");
    	for (Teacher t : teachers) {
    		System.out.println("Nombre:" + t.getName());
    	}
    	
    	
    }
}
