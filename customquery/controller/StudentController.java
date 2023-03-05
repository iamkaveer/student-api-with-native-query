package com.student.customquery.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.customquery.model.Student;
import com.student.customquery.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	//create student
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student newStudent) {
		return studentService.addStudent(newStudent);
	}
	
	//get all student
	@GetMapping("/get-all")
	public List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	
	//get all by first name
	@GetMapping("/find-by-first-name/{firstName}")
	public List<Student> findsAllByFirstName(@PathVariable String firstName){
		return studentService.getAllByFirstName(firstName);
	}
	
	
	//get all by active true
	
	@GetMapping("/find-all-by-active-true")
	public List<Student> findsAllByActiveTrue(){
		return studentService.getAllByActiveTrue();
	}
	
	@GetMapping("/find-all-by-age-greater-than/{age}")
	public List<Student> findAllByAgeGreaterThan(@PathVariable int age){
		return studentService.getAllByGreaterThanAge(age);
	}
	
	@GetMapping("/find-by-lastname-and-active/{lastName}")
	public List<Student> findStudentByLastnameAndActive(@PathVariable String lastName){
		return studentService.getStudentByLastNameAndActive(lastName);
	}
	
	//in between
	@GetMapping("/find-by-age-between/{age}/{age2}")
	public List<Student> findStudentByAgeBetween(@PathVariable int age, int age2){
		return studentService.getStudentByAgeBetween(age, age2);
		
	}
	
	//after certain addmission date
	@GetMapping("/find-by-addmission-date-after/{date}")
	public List<Student> findStudentByAddmissionDateAfter(@PathVariable Date date){
		return studentService.getStudentByAddmissionDateAfter(date);
	}
	
	@PutMapping("/delete-by-id/{studentId}")
	public void deleteStudentById(@PathVariable int studentId) {
		studentService.deleteStudentById(studentId);
	}

}
