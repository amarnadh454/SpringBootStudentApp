package in.hcl.amar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hcl.amar.model.Student;
import in.hcl.amar.service.IStudentService;
@CrossOrigin(origins = "http://localhost:4200",  allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class StudentRestController {
	@Autowired
	private IStudentService service;

	
	// Save
	@CrossOrigin(origins = "http://localhost:4200",  allowedHeaders = "*")
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		Integer id = service.saveStudent(student);

		return new ResponseEntity<String>("Student '" + id + "' saved", HttpStatus.OK);

	}

	// fetch all
	@CrossOrigin(origins = "http://localhost:4200",  allowedHeaders = "*")
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> list = service.getAllStudents();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}

	// fetch one
	@CrossOrigin(origins = "http://localhost:4200",  allowedHeaders = "*")
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getOneStudent(@PathVariable Integer id) {
		Student student = service.getOneStudent(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	// delete
	@CrossOrigin(origins = "http://localhost:4200",  allowedHeaders = "*")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		service.deleteStudent(id);
		return new ResponseEntity<String>("Student '"+id+"' Deleted", HttpStatus.OK);
	}

	// modify
	@CrossOrigin(origins = "http://localhost:4200",  allowedHeaders = "*")
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateStudent(
			@PathVariable Integer id,
			@RequestBody Student student){
		Student db= service.getOneStudent(id);
		db.setStdName(student.getStdName());
		db.setSubject_1(student.getSubject_1());
		db.setSubject_2(student.getSubject_2());
		db.setSubject_3(student.getSubject_3());
		db.setSubject_4(student.getSubject_4());
		db.setSubject_5(student.getSubject_5());
		service.saveStudent(db);
		return new ResponseEntity<String>("Student '"+id+"' Updated", HttpStatus.OK);
	}


}
