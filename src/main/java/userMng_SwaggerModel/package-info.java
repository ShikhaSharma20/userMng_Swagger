package userMng_SwaggerModel;
//import required classes and packages 
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Adding lombok to reduce boilerplate code
@Data
@AllArgsConstructor(staticName="build")
@NoArgsConstructor
@Entity
public class User {

	//Data members
		@Id
		private long userId;
		private String userName;
		private String userContact;
		private String userEmail;
		private String userPassword;
		

	}