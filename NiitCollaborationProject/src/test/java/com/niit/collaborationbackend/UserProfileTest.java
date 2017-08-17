package com.niit.collaborationbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaborationbackend.dao.UserProfileDAO;
import com.niit.collaborationbackend.model.UserProfile;

public class UserProfileTest {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext();
		
		con.scan("com.niit.collaborationbackend");
		con.refresh();
		
		UserProfileDAO userprofiledao =(UserProfileDAO) con.getBean("userprofiledao");
	    UserProfile userprofile =new UserProfile();
	    
	      
	       
	       
		
		
		
	}

}
