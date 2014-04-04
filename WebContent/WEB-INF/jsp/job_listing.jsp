<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"  charset=ISO-8859-1">
<title>Available Jobs</title>
</head>
<body>



<ul>
<li>Job Titles</li>
<%-- <c:out value="${jobList}"></c:out> --%>

 <c:forEach items="${jobList}" var="jobList">

<li>
<a href="jobDetails.htm?jobTitle=<c:out value="${jobList}"></c:out>"><c:out value="${jobList}"></c:out></a>

</li>

</c:forEach> 
</ul>
</body>
</html>