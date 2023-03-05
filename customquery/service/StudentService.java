package com.student.customquery.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.customquery.model.Student;
import com.student.customquery.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	//add student
	public Student addStudent(Student newStudent) {
		return studentRepository.save(newStudent);
	}
	
	//get all student
	public List<Student> getAllStudent(){
		return studentRepository.findAllStudents();
	}
	
	//find all by first name
	public List<Student> getAllByFirstName(String firstName){
		return studentRepository.findByFirstName(firstName);
	}
	
	//find by active true
	public List<Student> getAllByActiveTrue(){
		return studentRepository.findByActiveTrue();
	}
	
	//find all by age greater than 
	public List<Student> getAllByGreaterThanAge(int age){
		return studentRepository.findAllStudentsWithAgeGreaterThan(age);
	}
	
	//find by lastname  and active
	public List<Student> getStudentByLastNameAndActive(String lastName){
		return studentRepository.findActiveStudentsWithLastName(lastName);
		
	}
	
	//find all by age between
	public List<Student> getStudentByAgeBetween(int min, int max){
		return studentRepository.findByAgeBetween(min, max);
	}
	
	//find by date after
	public List<Student> getStudentByAddmissionDateAfter(Date date){
		return studentRepository.findByAdmissionDateAfter(date);
	}
	
	//delete by id
	public void deleteStudentById(int studentId) {
		studentRepository.deleteById(studentId);
	}

}
