package com.jpa.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relation.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
