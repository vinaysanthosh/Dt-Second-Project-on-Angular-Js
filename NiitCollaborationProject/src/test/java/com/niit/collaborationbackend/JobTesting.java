package com.niit.collaborationbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaborationbackend.dao.JobDAO;
import com.niit.collaborationbackend.model.Job;

public class JobTesting {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.collaborationbackend");
		context.refresh();
		
	System.out.println("11111111111111111111111111111111111111111111");
		JobDAO jobDAO =(JobDAO) context.getBean("jobDAO");
		Job job =(Job) context.getBean("job");
		System.out.println("2222222222222222222222222222222222222222");
	
		job.setCompanyname("Vinay");
		job.setDescription("Vinay");
		job.setExperience("1");
		job.setId(111);
		job.setLocation("Vijayawada");
		job.setPostdate(null);
		job.setQualification("MCA");
		job.setStatus('Y');
		job.setTitle("Vinay");
		
		
		jobDAO.updatejob(job);
		
	}

}
