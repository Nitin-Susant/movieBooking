<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="../component/Bootstrap.jsp"%>
</head>
<body>
	<!-- movie form -->
	<div>
		<form:form method="post"  action="addmovies" modelAttribute="movieobj">
			<div class="mb-3">
				<label   class="form-label">Movie
					Name</label> <form:input type="text" class="form-control"
					  path="Name" />

			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Movie
					relese date</label> <form:input type="date" class="form-control"
				  aria-describedby="emailHelp" path="date"/>

			</div>
			<div class="mb-3">
				<label for="exampleFormControlTextarea1" class="form-label">Example
					textarea</label>
				<form:textarea class="form-control" 
					rows="3" path="description"></form:textarea>
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Movie
					Duration</label> <form:input type="time" class="form-control"
					  aria-describedby="emailHelp" path="duration"/>

			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>

	</div>
	<!-- movie form end -->
</body>
</html>