package com.example.OnlineQuizSystem.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineQuizSystem.Student;
import com.example.OnlineQuizSystem.StudentRepository;

@RestController
@RequestMapping(value="/api/v1")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@PostMapping(value="/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student s =this.studentRepository.save(student);
		return ResponseEntity.ok(s);
	}
	@GetMapping(value="/students")
	public ResponseEntity<List<Student>> getStudents() {
		return ResponseEntity.ok().body(mongoTemplate.findAll(Student.class));
	}
	@GetMapping(value="/students/{id}")
	public ResponseEntity<Student> getStudentsById(@PathVariable(value = "id") int id) {
		return ResponseEntity.ok().body(mongoTemplate.findById(id,Student.class));
	}
	@PutMapping(value="/students/{id}")
	public ResponseEntity<Student> updateStudentByid(@RequestBody Student student,@PathVariable(value = "id") int id) {
		Student s =mongoTemplate.findById(id,Student.class);
		if(student.getClas()!=null) {
			s.setClas(student.getClas());
		}if(student.getDepartment()!=null) {
			s.setDepartment(student.getDepartment());
		}if(student.getMoNo()!=null) {
			s.setMoNo(student.getMoNo());
		}if(student.getName()!=null) {
			s.setName(student.getName());
		}if(student.getRollNo()!=null) {
			s.setRollNo(student.getRollNo());
		}
		this.studentRepository.save(s);
		return ResponseEntity.ok(s);
	}
	
	
}
