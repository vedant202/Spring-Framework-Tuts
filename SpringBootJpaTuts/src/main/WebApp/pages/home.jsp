<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addAlien">
	ID:<input id="aId" name="aId" type="text">
	<br>
	Name:<input id="aName" name="aName" type="text">
	<br>
	Language:<input id="lang" name="lang" type="text">
	
	<button type="submit">submit</button>
</form>

<br>

<form action="findAlienLang">
	Language:<input id="lang" name="lang" type="text">
	
	<button type="submit">submit</button>
</form>

<br>
Aliens ${alien}

</body>
</html>