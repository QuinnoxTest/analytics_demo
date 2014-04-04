/**
 * 
 */
package me.imploy.analytics.dao;

import java.util.List;

import me.imploy.analytics.pojos.JobDetails;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author PallaviD
 *
 */
public class JobDao extends JdbcDaoSupport implements IJobDao {

	/**
	 * Returns List of Job Titles
	 * @author PallaviD
	 * 
	 */
	@Override
	public List<String> getAllJobs() {
		String getJobs="Select job_title from job_dtls";
		List<String> jobTitleList=getJdbcTemplate().queryForList(getJobs,String.class);
		
		return jobTitleList;
	}

	public JobDetails getJobDetails(String jobTitle) {
		System.out.println("jobTitle1111"+jobTitle);
		String getJobDetails="Select description, eligible_streams, experience_from, experience_to, status, salary, response_count, location, industry, firm_id, job_id_and_firm_id, job_title, primary_skills, secondary_skills, firm_name, functional_area, gpa_cut_off_from, gpa_cut_off_to, job_id , job_type from job_dtls where job_title=?";
		JobDetails jobDetails=getJdbcTemplate().queryForObject(getJobDetails,new Object[]{jobTitle},
				new BeanPropertyRowMapper(JobDetails.class));
		
		return jobDetails;
		
	}

}
