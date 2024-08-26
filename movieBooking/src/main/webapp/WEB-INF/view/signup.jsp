<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">

</head>
<body>

	<form:form action="signup_process" method="post" modelAttribute="userobj" >
	
	<div class="mb-3">
			<label for="Name" class="form-label">Name
				address</label> <form:input   class="form-control"
				   path="name"/>
			 
		</div>
	
		<div class="mb-3">
			<label for="Email1" class="form-label">Email
				address</label> <form:input type="email" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp" path="email"/>
			<div id="emailHelp" class="form-text">We'll never share your
				email with anyone else.</div>
		</div>
		<div class="mb-3">
			<label for="Password1" class="form-label">Password</label>
			<form:input type="password" class="form-control"
				id="exampleInputPassword1" path="password"/>
		</div>
		 
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>

</html>