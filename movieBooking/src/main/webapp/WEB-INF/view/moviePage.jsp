<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${movieById.name }</h1>
	<h1>${movieById.date }</h1>
	<h1>${movieById.duration }</h1>
	<h1>${movieById.description }</h1>

	<h3>
		<a href="/movieBooking/booking/${movieById.name }/${movieById.id }"><button>buck know</button></a>
	</h3>

</body>

</html>