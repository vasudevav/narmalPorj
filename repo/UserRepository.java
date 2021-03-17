package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.nit.model.User;

public interface UserRepository 
	extends	JpaRepository<User, Integer> 
{

	@Modifying
	@Query("UPDATE User SET active=:status WHERE id=:id")
	public int updateUserStatus(boolean status, Integer id);
}
