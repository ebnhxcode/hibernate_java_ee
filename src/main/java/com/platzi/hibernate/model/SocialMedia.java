package com.platzi.hibernate.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="social_media")
public class SocialMedia implements Serializable {
	@Id
	@Column(name="id_social_media")
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Esto significa que este campo es un campo identidad autoincremental
	private Long idSocialMedia;
	
	@Column(name="name")
	private String name;
	
	@Column(name="icon")
	private String icon;
	
	public SocialMedia() {
		super();
	}
	public SocialMedia(String name, String icon) {
		super();
		this.name = name;
		this.icon = icon;
	}
	public Long getIdSocialMedia() {
		return idSocialMedia;
	}
	public void setIdSocialMedia(Long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
}