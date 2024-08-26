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


 


<form:form class="row g-3" action="sucesspayment" method="post" modelAttribute="paymentobj" >
   
  <div class="mb-3">
    <label  class="form-label">PAY 200</label>
    <form:input type="text" class="form-control" path="price" />
  </div>
  <div class="mb-3">
    <button type="submit" class="btn btn-primary">Confirm</button>
  </div>
</form:form>
</body>
</html>