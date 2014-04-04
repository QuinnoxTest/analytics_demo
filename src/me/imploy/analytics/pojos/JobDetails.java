/**
 * 
 */
package me.imploy.analytics.pojos;

import java.util.List;
import java.util.Map;

/**
 * @author PallaviD
 *
 */
public class JobDetails {


	private String description;
	private List<String> eligible_streams;
	
	private String experience_from;
	private String experience_to;
	
	private String firm_id;
	private String firm_name;
	private String functional_area;
	
	private String gpa_cut_off_from;
	private String gpa_cut_off_to;
	private String job_id ;
	private String job_type ;
		
	private int response_count  = 0;
	
	private String location ;//
	
	private String job_id_and_firm_id;
	private String job_title;
	private List<String> primary_skills;
	private List<String> secondary_skills;
	private String status;
	private String salary;
	private String industry;
	

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getEligible_streams() {
		return eligible_streams;
	}
	public void setEligible_streams(List<String> eligible_streams) {
		this.eligible_streams = eligible_streams;
	}
	public String getExperience_from() {
		return experience_from;
	}
	public void setExperience_from(String experience_from) {
		this.experience_from = experience_from;
	}
	public String getExperience_to() {
		return experience_to;
	}
	public void setExperience_to(String experience_to) {
		this.experience_to = experience_to;
	}
	public String getFirm_id() {
		return firm_id;
	}
	public void setFirm_id(String firm_id) {
		this.firm_id = firm_id;
	}
	public String getFirm_name() {
		return firm_name;
	}
	public void setFirm_name(String firm_name) {
		this.firm_name = firm_name;
	}
	public String getFunctional_area() {
		return functional_area;
	}
	public void setFunctional_area(String functional_area) {
		this.functional_area = functional_area;
	}
	public String getGpa_cut_off_from() {
		return gpa_cut_off_from;
	}
	public void setGpa_cut_off_from(String gpa_cut_off_from) {
		this.gpa_cut_off_from = gpa_cut_off_from;
	}
	public String getGpa_cut_off_to() {
		return gpa_cut_off_to;
	}
	public void setGpa_cut_off_to(String gpa_cut_off_to) {
		this.gpa_cut_off_to = gpa_cut_off_to;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	
	public int getResponse_count() {
		return response_count;
	}
	public void setResponse_count(int response_count) {
		this.response_count = response_count;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJob_id_and_firm_id() {
		return job_id_and_firm_id;
	}
	public void setJob_id_and_firm_id(String job_id_and_firm_id) {
		this.job_id_and_firm_id = job_id_and_firm_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public List<String> getPrimary_skills() {
		return primary_skills;
	}
	public void setPrimary_skills(List<String> primary_skills) {
		this.primary_skills = primary_skills;
	}
	public List<String> getSecondary_skills() {
		return secondary_skills;
	}
	public void setSecondary_skills(List<String> secondary_skills) {
		this.secondary_skills = secondary_skills;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	

}
