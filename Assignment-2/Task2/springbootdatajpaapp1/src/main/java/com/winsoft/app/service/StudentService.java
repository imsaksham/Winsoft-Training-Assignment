package com.winsoft.app.service;

import java.util.Optional;

import com.winsoft.app.model.Student;

public interface StudentService {
	
	public Student saveStudentDetails(Student student);
	
	public Optional<Student> getStudentByRoll(int roll);
	
	public Student updateStudentDetails(Student student);
	
	public String deleteStudentData(int roll);

	
}
