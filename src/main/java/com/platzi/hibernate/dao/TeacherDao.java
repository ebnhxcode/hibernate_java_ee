package com.platzi.hibernate.dao;
import com.platzi.hibernate.model.Teacher;
import java.util.List;

public interface TeacherDao {
	
	void saveTeacher (Teacher teacher);
	
	void deleteTeacherById(Long idTeacher);

	void updateTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	List<Teacher> findTeachersByName(String name);
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);
}
