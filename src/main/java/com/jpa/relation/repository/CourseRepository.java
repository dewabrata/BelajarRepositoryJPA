package com.jpa.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relation.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
