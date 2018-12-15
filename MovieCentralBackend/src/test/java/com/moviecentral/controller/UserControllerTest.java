/**
 * 
 */
package com.moviecentral.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.context.request.WebRequest;

import com.moviecentral.controllers.UserController;
import com.moviecentral.pojos.User;

/**
 * @author ravitejakommalapati
 *
 */
public class UserControllerTest {

	@Test
	public void testuserVerification() {
		
		UserController usercontroller =new UserController();
		User user =new User();
		user.setUsername("User1@gmail.com");
		user.setPassword("user");
		
		User res=usercontroller.userSignin(user,null);
		
		assertEquals(res.isEnable(), true);
	}

}
