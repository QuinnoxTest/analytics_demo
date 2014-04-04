/**
 * 
 */
package me.imploy.analytics.service;

import java.util.List;

import me.imploy.analytics.dao.JobDao;
import me.imploy.analytics.pojos.JobDetails;

/**
 * @author PallaviD
 *
 */
public class GetJobs implements IGetJobs {

	JobDao jobDao;
	


	public JobDao getJobDao() {
		return jobDao;
	}
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	
	
	@Override
	public List<String> getAllJobs() {
		// TODO Auto-generated method stub
		return jobDao.getAllJobs();
	}
	public JobDetails getJobDetails(String jobTitle) {
		System.out.println("jobTitle11"+jobTitle);
		// TODO Auto-generated method stub
		return jobDao.getJobDetails(jobTitle);
	}
	
	
	


	

}
