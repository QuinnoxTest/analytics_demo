<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function applyJobFunction()
{

//  	window.location.href='applyJob.htm?jobIdAndFirmId='+ job_id_and_firm_id;
}
</script>
<title>Insert title here</title>
</head>
<body>
<c:set var="jobDetails" value="${jobDetails}"/>
<c:if test="${not empty jobDetails}">
<ul>
<li>Job Details</li>


 <li>Job ID and Firm ID<c:out value="${jobDetails.job_id_and_firm_id}"></c:out></li> 
 <li>Job Title<c:out value="${jobDetails.job_title}"></c:out></li>
 <li>description<c:out value="${jobDetails.description}"></c:out></li>
 <li>eligible_streams<c:out value="${jobDetails.eligible_streams}"></c:out></li> 
 <li>experience_from<c:out value="${jobDetails.experience_from}"></c:out></li> 
 <li>experience_to<c:out value="${jobDetails.experience_to}"></c:out></li> 
 <li>firm_id<c:out value="${jobDetails.firm_id}"></c:out></li> 
 <li>firm_name<c:out value="${jobDetails.firm_name}"></c:out></li> 
 <li>functional_area<c:out value="${jobDetails.functional_area}"></c:out></li> 
 <li>gpa_cut_off_from<c:out value="${jobDetails.gpa_cut_off_from}"></c:out></li> 
 <li>gpa_cut_off_to<c:out value="${jobDetails.gpa_cut_off_to}"></c:out></li>
 <li>job_id<c:out value="${jobDetails.job_id}"></c:out></li>
 <li>job_type<c:out value="${jobDetails.job_type}"></c:out></li> 
 <li>response_count<c:out value="${jobDetails.response_count}"></c:out></li>
 <li>primary_skills<c:out value="${jobDetails.primary_skills}"></c:out></li> 
 <li>secondary_skills<c:out value="${jobDetails.secondary_skills}"></c:out></li>
 <li>salary<c:out value="${jobDetails.salary}"></c:out></li> 
 <li>industry<c:out value="${jobDetails.industry}"></c:out></li> 
 <li>status<c:out value="${jobDetails.status}"></c:out></li>  
  
 

</ul>
</c:if>

 <input name="Apply" type="button" value="ApplyJob" align="bottom" onclick="applyJobFunction()">
 
 <c:set var="message" value="${message}"/>
 <c:if test="${not empty message}">
 <li>message<c:out value="${message}"></c:out></li> 
 </c:if>
</body>
</html>