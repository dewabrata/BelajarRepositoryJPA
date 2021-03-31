package com.jpa.relation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.relation.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	
	public Student findByName(String name);
	
}
