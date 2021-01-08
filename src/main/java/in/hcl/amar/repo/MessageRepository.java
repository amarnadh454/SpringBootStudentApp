package in.hcl.amar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hcl.amar.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}
