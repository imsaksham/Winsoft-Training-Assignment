package com.winsoft.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.winsoft.app.model.Student;
import com.winsoft.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> saveStudentHandler(@RequestBody Student student){
		
		Student savedStudent= sService.saveStudentDetails(student);
		
		
		return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Optional<Student>> getStudentHandler(@PathVariable("roll") int roll) {
		
		Optional<Student> getStudent = sService.getStudentByRoll(roll);
		System.out.println(getStudent);
		
		return new ResponseEntity<>(getStudent, HttpStatus.OK);
	}
	
	@PutMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentHandler(@RequestBody Student student) {
		
		Student getStudent = sService.updateStudentDetails(student);
		System.out.println(getStudent);
		
		return new ResponseEntity<>(getStudent, HttpStatus.OK);
	}

	@DeleteMapping("/students/{roll}")
	public ResponseEntity<String> deleteStudentHandler(@PathVariable("roll") int roll) {
		
		String getStudent = sService.deleteStudentData(roll);
		System.out.println(getStudent);
		
		return new ResponseEntity<>(getStudent, HttpStatus.OK);
	}
}
