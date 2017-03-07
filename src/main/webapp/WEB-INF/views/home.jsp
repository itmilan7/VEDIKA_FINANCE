<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
	
	<form action="saveUser" method="POST">
	
	<input type="text" name="userName"/><br/>
	<input type="text" name="password"/><br/>
	<input type="text" name="role"/><br/>
	<input type="text" name="firstName"/><br/>
	<input type="text" name="lastName"/><br/>
	<input type="submit"/>
	
	</form>
</h1>

</body>
</html>
