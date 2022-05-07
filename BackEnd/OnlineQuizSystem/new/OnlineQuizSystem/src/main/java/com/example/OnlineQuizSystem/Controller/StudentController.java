package com.example.OnlineQuizSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineQuizSystem.Student;
import com.example.OnlineQuizSystem.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping(value="/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student s = this.studentRepository.save(student);
		return ResponseEntity.ok(s);
	}
	@GetMapping(value="/students")
	public ResponseEntity<?> getStudents() {
		return ResponseEntity.ok(this.studentRepository.findAll());
	}
	
	
}
