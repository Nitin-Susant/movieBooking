<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="./component/Bootstrap.jsp"%>
</head>
<body>

	<form:form action="processBooking" modelAttribute="bookobj" method="post">
	 <form:hidden path="moviefkey"/>
		<div class="mb-3">
			<label class="form-label">Seet No </label> <form:input type="text"
				class="form-control" aria-describedby="emailHelp" path="noSeets"/>
		</div>
		<div class="mb-3">
			<label class="form-label">booking Date</label> <form:input type="date"
				class="form-control" path="date"/>
		</div>
		 
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>

</body>
</html>