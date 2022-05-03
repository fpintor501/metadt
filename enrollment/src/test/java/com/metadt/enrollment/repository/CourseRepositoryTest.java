package com.metadt.enrollment.repository;

//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.Collection;
//import java.util.List;

import org.junit.jupiter.api.Test;

//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.metadt.enrollment.model.Course;
//import com.metadt.enrollment.repository.CourseRepository;


//@ExtendWith(SpringExtension.class)
//@DataJpaTest
class CourseRepositoryTest {
	
//	@Autowired
//	CourseRepository courseRepository;


	@Test
	void testFindByCode() {
		
//		Long courseId = courseRepository.findByCode("MATH-101").get(0).getId();
//		Long c1 = 100L;
//		
//		assertThat(courseId).isEqualTo(c1);
	}

	@Test
	void testFindByCodeContains() {
		
//		Long courseId = courseRepository.findByCodeContains("MATH-101").get(0).getId();
//		Long c1 = 100L;
//		
//		assertThat(courseId).isEqualTo(c1);
	}

	@Test
	void testFindByTitle() {
		
//		Long courseId = courseRepository.findByTitle("Introduction to Algebra").get(0).getId();
//		Long c1 = 100L;
//		
//		assertThat(courseId).isEqualTo(c1);
	}

	@Test
	void testFindByTitleContains() {
		
//		Long courseId = courseRepository.findByTitleContains("Introduction to Algebra").get(0).getId();
//		Long c1 = 100L;
//		
//		assertThat(courseId).isEqualTo(c1);
	}

	@Test
	void testSearchCoursesWithNoStudents() {
		
//		Collection<Course> courses = courseRepository.searchCoursesWithNoStudents();
//		
//		assertThat(courses).hasSizeGreaterThan(0);
		
	}
	@Test
	void testSearchCoursesWithNoStudentsInSemester() {

//		Collection<Course> courses = courseRepository.searchCoursesWithNoStudentsInSemester("20201");
//		
//		assertThat(courses).hasSizeGreaterThan(0);
		
	}

}
