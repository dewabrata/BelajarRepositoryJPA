package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="student")
public class Student {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String name;
	 private int age;
	 private String grade;
	 @ManyToMany(cascade= CascadeType.ALL)
	 @JoinTable(
		        name = "student_course", 
		        joinColumns = { @JoinColumn(name = "student_id", referencedColumnName = "id") }, 
		        inverseJoinColumns = { @JoinColumn(name = "course_id",referencedColumnName = "id") })
	 
	 List<Course> lstCourse = new ArrayList<Course>();
}
