package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.model.User;
import in.nit.repo.UserRepository;
import in.nit.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository repo; //HAS-A
	
	@Override
	public Integer saveUser(User user) {
		user = repo.save(user);
		return user.getId();
	}
	
	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}
	
	@Override
	@Transactional
	public int updateUserStatus(boolean status, Integer id) {
		return repo.updateUserStatus(status, id);
	}
}
