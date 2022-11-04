package com.userMng_SwaggerRepository;

import com.userMng_SwaggerModel.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User , Long> {
	
	//user defined query to retrieve User via UserId
	@Query(value="select * from User where User_id=?1", nativeQuery=true)
	User findByUserId(long id);

}