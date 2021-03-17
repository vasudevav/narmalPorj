package in.nit.service;

import java.util.List;

import in.nit.model.User;

public interface IUserService {

	Integer saveUser(User user);
	List<User> getAllUsers();
	int updateUserStatus(boolean status, Integer id);
}
