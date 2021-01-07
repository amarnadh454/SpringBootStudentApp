package in.hcl.amar.service;

import java.util.List;

import in.hcl.amar.model.Student;

public interface IStudentService {
Integer saveStudent(Student s);
List<Student> getAllStudents();
Student getOneStudent(Integer id);
void deleteStudent(Integer id);
}
