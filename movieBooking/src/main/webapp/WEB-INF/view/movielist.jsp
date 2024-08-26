<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table>
			<thead>
				<tr>
					<th>Movie name</th>
					<th>Release Date</th>
					<th>Duration</th>
					<th>Description</th>
					<th>click to see</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="movies" items="${getmovie}">
					<tr>
						<td>${movies.name}</td>
						<td>${movies.date}</td>
						<td>${movies.duration}</td>
						<td>${movies.description}</td>
						<td>
						<a href="${movies.name}/${movies.id}">
							<button>chick here</button>
						</a>
						</td>
					</tr>

				</c:forEach>

			</tbody>


		</table>
	</div>

</body>
</html>