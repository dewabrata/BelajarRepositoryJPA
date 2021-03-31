package com.jpa.relation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.relation.entity.Comment;
import com.jpa.relation.entity.Course;
import com.jpa.relation.entity.Instructor;
import com.jpa.relation.entity.InstructorDetail;
import com.jpa.relation.entity.Post;
import com.jpa.relation.entity.Student;
import com.jpa.relation.repository.CourseRepository;
import com.jpa.relation.repository.InstructorRepository;
import com.jpa.relation.repository.PostRepository;
import com.jpa.relation.repository.StudentRepository;

@SpringBootApplication
public class JpaRelationTableApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaRelationTableApplication.class, args);
	}

	@Autowired
	InstructorRepository instructorRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	PostRepository postRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	Instructor instruktur = new Instructor();
		instruktur.setEmail("dewabrata@gmail.com");
		instruktur.setFirstName("Dewa");
		instruktur.setLastName("Brata");
		
		InstructorDetail detail1 = new InstructorDetail();
		detail1.setHobby("Nyupang");
		detail1.setYoutubeChannel("tokodewacupang");
		
		instruktur.setInstructorDetail(detail1);
		
		this.instructorRepository.save(instruktur);
		
		Post post = new Post();
		post.setTitle("TitTok Keren");
		post.setDescription("Cerita tiktok gw");
		
		Comment comment1 = new Comment();
		comment1.setText("Wuihh keren banget");
		
		Comment comment2 = new Comment();
		comment2.setText("Upload lagi dunk");
		
		
		List<Comment> lstComment = new ArrayList<Comment>();
		lstComment.add(comment1);
		lstComment.add(comment2);
		
		post.setLstComment(lstComment);
		
		this.postRepository.save(post); */
		
	/*	Student student = new Student();
		student.setName("Dewi");
		
		Course course1 = new Course();
		course1.setTitle("Belajar Memasak");
		
		Course course2 = new Course();
		course2.setTitle("Belajar Youtuber");
		
	    List<Course>lstCourses = new ArrayList<Course>();
	    lstCourses.add(course1);
	    lstCourses.add(course2);
		
	//	student.setLstCourse(lstCourses);
	//	this.studentRepository.save(student);
		
		
		List<Student> lstStudent = new ArrayList<Student>();
		lstStudent.add(student);
		
		Course course3 = new Course();
		course3.setTitle("Belajar Instagram");
		course3.setModule(2);
		course3.setFee(99000.00);
		course3.setAbbreviation("Ini apa si");
		course3.setLstStudent(lstStudent);
		
		this.courseRepository.save(course3);
	*/
		
		
		
		Student lstStudent = this.studentRepository.findByName("Dewabrata");
		
		lstStudent.toString();
		
		
		
		
		
		
		
	}

}
