/**
 * 
 */
package me.imploy.analytics.controllers;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import me.imploy.analytics.pojos.JobDetails;
import me.imploy.analytics.pojos.LoginCommand;
import me.imploy.analytics.service.GetJobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

/**
 * @author PallaviD
 *
 */
@Controller

public class WelcomeController
{
	@Autowired 
	GetJobs getJobs;
	
	
	@RequestMapping(value="/job_listing.htm",method=RequestMethod.POST)
	private String getJobsOnHomePage(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse,
			@ModelAttribute LoginCommand loginCommand,Model model)
	{
		
		HttpSession session= httpServletRequest.getSession();
		session.setAttribute("userName", loginCommand.getUsername());
	
		List<String> jobsList = getJobs.getAllJobs();
		
		model.addAttribute("jobList",jobsList);
		
		return "job_listing";
		
	}
	
	@RequestMapping(value="/jobDetails.htm")
	private String getJobsOnHomePage(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Model model,@RequestParam("jobTitle") String jobTitle){
		
		JobDetails jobDetails = getJobs.getJobDetails(jobTitle);
		
			System.out.println("Job Title:"+jobDetails.getJob_id_and_firm_id());
			System.out.println("ExpFrom"+jobDetails.getExperience_from().toString());
			System.out.println("Description"+jobDetails.getDescription().toString());
			System.out.println("eligibleStreams"+jobDetails.getEligible_streams().toString());
			System.out.println("Experirnce"+jobDetails.getExperience_from().toString());
			System.out.println("Exp to "+jobDetails.getExperience_to().toString());
			System.out.println("FirmID"+jobDetails.getFirm_id().toString());
			System.out.println("FirmName"+jobDetails.getFirm_name().toString());
			System.out.println("FunctionalArea"+jobDetails.getFunctional_area().toString());
			System.out.println("GPA"+jobDetails.getGpa_cut_off_from().toString());
			System.out.println("GPATO"+jobDetails.getGpa_cut_off_to().toString());
			System.out.println("JobType"+jobDetails.getJob_type().toString());
			System.out.println("SALARY"+jobDetails.getSalary().toString());
			System.out.println("PrimarySkills"+jobDetails.getPrimary_skills().toString());
			System.out.println("SecondarySkills"+jobDetails.getSecondary_skills().toString());
			
		
		
		
		
		model.addAttribute("jobDetails", jobDetails);
		
		return "job_details";
		
		
		
	}
	
	
	
			/*@RequestMapping(value="/applyJob.htm")
			private String applyJob(HttpServletRequest httpServletRequest,
				HttpServletResponse httpServletResponse, Model model,@RequestParam("jobIdAndFirmId") String jobTitle)
			{
		
				model.addAttribute("message","You Have Applied the Job Successfully");
				
				return "job_details";
		
			}
	*/
	
	

}
