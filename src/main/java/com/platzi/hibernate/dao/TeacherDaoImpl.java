package com.platzi.hibernate.dao;

import java.util.List;

import org.hibernate.query.Query;

import com.platzi.hibernate.model.Teacher;
import com.platzi.hibernate.dao.PlatziSession;


public class TeacherDaoImpl extends PlatziSession implements TeacherDao {

	private PlatziSession platziSession;
	private Teacher teacher;
	
	public TeacherDaoImpl () {
		platziSession = new PlatziSession();
	}

	
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		platziSession.getSession().persist(teacher);//o save(teacher);
		platziSession.getSession().getTransaction().commit();
	}

	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		teacher = platziSession.getSession().get(Teacher.class, idTeacher);
		platziSession.getSession().delete(teacher);
		platziSession.getSession().getTransaction().commit();
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		platziSession.getSession().update(teacher);
	}

	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return platziSession.getSession().createQuery("from Teacher").list();
	}

	public List<Teacher> findTeachersByName(String name) {
		// TODO Auto-generated method stub
		Query query = platziSession.getSession().createQuery("from Teacher where name like :name");
		query.setParameter("name", "%"+name+"%");
		return query.list();
	}
	
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		Query query = platziSession.getSession().createQuery("from Teacher where name=:name");
		query.setParameter("name", name);
		//teacher = query.getResultList();
		//teacher = (Teacher) query.uniqueResult();
		teacher = (Teacher) query.setMaxResults(1);
		return teacher;
	}
	
	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
        //return platziSession.getSession().load(Teacher.class, idTeacher);
		return platziSession.getSession().get(Teacher.class, idTeacher);
	}

}
