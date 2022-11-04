package com.userMng_SwaggerController;

import java.util.List;

import javax.validation.Valid;

import com.userMng_SwaggerDto.UserDTO;
import com.userMng_SwaggerException.GlobalException;
import com.userMng_SwaggerModel.User;
import com.userMng_SwaggerService.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
	
	//dependency injection for service layer
		@Autowired
		private UserService service;
		
		
		@GetMapping("/hello")
		public String helloUser(){
			return "Hello welcome ";
			}
		
		//Method1 -> To add the user in the database
		@PostMapping("/add")
		public ResponseEntity<User> addUser(@RequestBody @Valid UserDTO u1){
		
			return new ResponseEntity<>(service.addUser(u1),HttpStatus.OK);
			
		}
		
		//Method 2-> retriving all users from DB
		@GetMapping("/retrive")
		public ResponseEntity<List<User>> getUser(){
			
			
			return new ResponseEntity<>(service.getUser(),HttpStatus.ACCEPTED);
			
		}
		
		//Method 3-> retriving specific user details
		@GetMapping("/{id}")
		public ResponseEntity<User> getUser(@PathVariable long id) throws GlobalException{
			return new ResponseEntity<>(service.getUser(id),HttpStatus.OK);
		}

}