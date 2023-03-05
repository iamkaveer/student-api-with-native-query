package com.student.customquery.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.student.customquery.model.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//select all students from table
	@Query(value = "SELECT * FROM tbl_student", nativeQuery = true)
	List<Student> findAllStudents();
	
	
	//find by first name
	public List<Student> findByFirstName(String firstName);
	
	//find active user
	public List<Student> findByActiveTrue();
	
	//find student whose age > 
	@Query(value = "SELECT * FROM tbl_student WHERE age > :age", nativeQuery = true)
	List<Student> findAllStudentsWithAgeGreaterThan(int age);
	
	//find by lastname and active
	@Query(value = "SELECT * FROM tbl_student WHERE active = true AND last_name = :lastName", nativeQuery = true)
	List<Student> findActiveStudentsWithLastName(String lastName);
	
	List<Student> findByAgeBetween(int start, int end);
	
	//find student who took admission after certain date
	List<Student> findByAdmissionDateAfter(Date date);
	
	
	//delete student by modifying its active status true to false
	@Modifying
	@Transactional
	@Query(value = "update tbl_student set active = false WHERE student_id = :studentId", nativeQuery = true)
	public void deleteById(int studentId);
	



}
