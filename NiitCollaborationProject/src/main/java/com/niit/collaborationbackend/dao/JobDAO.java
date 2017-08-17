package com.niit.collaborationbackend.dao;

import java.util.List;

import com.niit.collaborationbackend.model.Job;
import com.niit.collaborationbackend.model.JobApplication;

public interface JobDAO {

	public boolean postjob(Job job);
	
	public boolean updatejob(Job job);
	
	public List<Job> getAllVacancies();
	
	public boolean applyforjob(JobApplication jobapplication);
	
	public boolean updatejobapplication(JobApplication jobapplication);
	
	public JobApplication getJobApplication(String useremail, int jobid);

	public List<JobApplication> listAllAppliedJobs(String useremail);
}
