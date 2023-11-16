package com.winsoft.app.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winsoft.app.model.Student;
import com.winsoft.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository sRepo;
	
	@Override
	public Student saveStudentDetails(Student student) {
		
		//
		Student savedStudent= sRepo.save(student);
		
		return savedStudent;
		
	}
	
	@Override
	public Student updateStudentDetails(Student student) {
		
		Optional<Student> opt = sRepo.findById(student.getRoll());
		
		if (opt.isEmpty()) {
			System.out.println("Not a valid roll number");
		}
		
		Student updatedData = sRepo.save(student);
		
		return updatedData;
	}

	@Override
	public Optional<Student> getStudentByRoll(int roll) {
		
		return sRepo.findById(roll);
	}

	@Override
	public String deleteStudentData(int roll) {
		
		Optional<Student> opt = sRepo.findById(roll);
		
		if (opt.isPresent()) {
			sRepo.deleteById(roll);
		}
		
		return "Data deleted successfully";
	}

}
