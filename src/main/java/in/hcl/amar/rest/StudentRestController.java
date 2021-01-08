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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class StudentRestController {
	@Autowired
	private IStudentService service;

	//Home
	@GetMapping("/home")
    public String home() {
        return "Home Page";
    }
	
	//welcome
		@GetMapping("/welcome")
	    public String welcome() {
	        return "Hello Wellcome to Student Management App";
	    }
	//denied
	@GetMapping("/denied")
	public String denied() {
		return "Access Not Matched";
	}
	
	// Save
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		Integer id = service.saveStudent(student);

		return new ResponseEntity<String>("Student '" + id + "' saved", HttpStatus.OK);

	}

	// fetch all
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> list = service.getAllStudents();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}

	// fetch one
	@GetMapping("/one/{id}")
	public ResponseEntity<Student> getOneStudent(@PathVariable Integer id) {
		Student student = service.getOneStudent(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	// delete
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		service.deleteStudent(id);
		return new ResponseEntity<String>("Student '"+id+"' Deleted", HttpStatus.OK);
	}

	// modify
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> updateStudent(
			@PathVariable Integer id,
			@RequestBody Student student){
		Student db= service.getOneStudent(id);
		db.setStdName(student.getStdName());
		db.setEnglish(student.getEnglish());
		db.setSanskrit(student.getSanskrit());
		db.setMaths(student.getMaths());
		db.setPhysics(student.getPhysics());
		db.setChemistry(student.getChemistry());
		service.saveStudent(db);
		return new ResponseEntity<String>("Student '"+id+"' Updated", HttpStatus.OK);
	}


}
