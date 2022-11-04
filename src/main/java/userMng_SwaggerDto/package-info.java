package com.userMng_SwaggerDto;
//importing required classes and packages
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Adding required annotation from lombok to reduce boilerplate code

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	//using Regex validation annotations to validate the user's entered data.
	@NotNull(message="id cannot be null ,thus contain atleast 3 numbers")
	private long userId;
	@NotEmpty(message="Username cannot be empty")
	private String userName;
	@Pattern(regexp="[0-9]{10}",message ="Contact number should be valid")
	private String userContact;
	@Email(message = "Email should be valid")
	private String userEmail;
	@Pattern(regexp = "^((?=.*[A-Z])(?=.*[!@#$&*])([a-z0-9])){4,12}$",
            message = "Your password is not that much strong..!\n Use atleast one uppercase letter and spcl character to make it strong..!")
	private String userPassword;
	
	}