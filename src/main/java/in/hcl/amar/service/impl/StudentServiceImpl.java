package in.hcl.amar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcl.amar.exception.StudentNotFoundException;
import in.hcl.amar.model.Student;
import in.hcl.amar.repo.StudentRepository;
import in.hcl.amar.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public Integer saveStudent(Student s) {
		Integer id= repo.save(s).getStdId();
		return id;
	}

	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list=repo.findAll();
		return list;
	}

	@Override
	public Student getOneStudent(Integer id) {
		
		Optional<Student> opt=repo.findById(id);
		Student std = opt.orElseThrow(()-> new StudentNotFoundException("Student Not Exit"));
		return std;
	}

	@Override
	public void deleteStudent(Integer id) {

		Student std= getOneStudent(id);
		repo.delete(std);
	}

	
}
