package com.nagarro.user_data.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagarro.user_data.entities.*;

@Repository
public interface UserRepo extends JpaRepository<UserData,Long> {
	
//	UserData save();
//
//	List<UserData> findAll();

}
