package in.hcl.amar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hcl.amar.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
