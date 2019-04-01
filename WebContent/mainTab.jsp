<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="map" class="java.util.HashMap" scope="request"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"></head>
<body>
<div class="text-center bg-info"><h2>maximum sequence in row or column is : ${seq}</h2>
</div>
<table class="table table-bordered">

<c:forEach items="${nums}" var="element">

				<tr>
				<c:forEach items="${element}" var="elem">
				<td>
				
				<h3><b> ${elem} </b></h3>
								
				</td>
				</c:forEach>
				</tr>
				
				</c:forEach>
				

</table>
<script src="js.js"></script>
</body>
</html>