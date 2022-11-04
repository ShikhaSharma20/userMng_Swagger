package userMng_SwaggerService;

import java.util.List;

import com.userMng_SwaggerDto.UserDTO;
import com.userMng_SwaggerException.GlobalException;
import com.userMng_SwaggerModel.User;
import com.userMng_SwaggerRepository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	//dependency injection for repository
		@Autowired
		private UserRepo repo;	
		
		//adding the new user which satisfies user validation
		public User addUser(UserDTO u1) {
		
			User u2=User.build(u1.getUserId, u1.getUserName(), u1.getUserContact(), u1.getUserEmail(),u1.getUserPassword);
			
			
			return repo.save(u2);
		}
		
		//retriving all the users 
		public List<User> getUser(){
			return repo.findAll();
		}
		
		
		//retrieving individual user via userid
		public User getUser(long userid) throws GlobalException
		{
			User _u1=repo.findByUserId(userid);
			if(_u1!=null) {
				return _u1;
			}
			else {
				throw new GlobalException("Invalid User..! "+userid);
			}
		}

}
