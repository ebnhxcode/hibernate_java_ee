package com.platzi.hibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

//import com.platzi.hibernate.model.Teacher;

@Entity
@Table(name="course")
public class Course implements Serializable {
	@Id
	@Column(name="id_course")
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Esto significa que este campo es un campo identidad autoincremental
	private Long idCourse;
	
	@Column(name="name")
	private String name;
	
	@Column(name="themes")
	private String themes;
	
	@Column(name="project")
	private String project;
	
	//fetch indica que al traer los datos de course, forza traer tambien los datos relacionados con teacher
	@ManyToOne(optional=true,fetch=FetchType.EAGER)
	@JoinColumn(name="id_teacher")
	private Teacher teacher;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, String themes, String project /*, Teacher teacher*/) {
		super();
		this.name = name;
		this.themes = themes;
		this.project = project;
		//this.teacher = teacher;
	}
	public Long getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
}
