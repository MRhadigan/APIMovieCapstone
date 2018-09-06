<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>

<h2>Please enter a movie title!</h2><br>
<input type="text" name="movie"><br>
<input type="submit" value= "Enter">
<br><br><br>
	

	<c:forEach var="test" items="${movielist.genres }">
		 <h3>Title: <br> ${movielist.title}</h3>
		<h3>Genre: <br> ${test.name}</h3>
		 <h3>Release Date: <br> ${movielist.release_date}</h3>
		 <h3>Overview: <br> ${movielist.overview}</h3>
		 <h3>Movie ID: <br> ${movielist.favoriteid}</h3>
	</c:forEach>
	
</body>
</html>