package in.hcl.amar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.hcl.amar.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
