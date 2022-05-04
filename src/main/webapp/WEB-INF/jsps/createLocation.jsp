<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create location</title>
</head>
<body>

	<form action="saveLoc" method="post">
		<pre>
		id: <input type="text" name="id">
		code: <input type="text"name="code">
		name: <input type="text" name="name">
		type: Urbun<input type="radio" name="type" value="URBUN">
		      Rural <input type="radio" name="type" value="RURAL">
		<input type="submit" value="save">
</pre>
	</form>
	${msg}
	<a href="displayLocations">View All</a>
</body>
</html>