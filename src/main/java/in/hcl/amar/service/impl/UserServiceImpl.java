package in.hcl.amar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import in.hcl.amar.model.User;
import in.hcl.amar.repo.UserRepository;
import in.hcl.amar.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repo;
	@Override
	public Integer saveUser(User user) {

		return repo.save(user).getUserId();
	}

}
