<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	div {
	border: 2px solid black;
	display: inline-block;
	margin: 10px;
	padding: 10px;
	}
</style>
</head>
<body>
	<div> Make a Dog!
		<form action="/Pets/Make" method="get">
			<input type="hidden" name="pet" value="dog" >
			Name: <input type="text" name="name"><br>
			Breed: <input type="text" name="breed"><br>
			Weight: <input type="text" name="weight"><br>
			<input type="submit" value="Submit">  	
		</form>
	</div>
	
	<div> Make a Cat!
		<form action="/Pets/Make" method="get">
			<input type="hidden" name="pet" value="cat" >
			Name: <input type="text" name="name"><br>
			Breed: <input type="text" name="breed"><br>
			Weight: <input type="text" name="weight"><br> 
			<input type="submit" value="Submit"> 	
		</form>
	</div>
	
</body>
</html>