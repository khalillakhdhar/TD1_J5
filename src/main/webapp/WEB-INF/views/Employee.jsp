<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="evaluation">
Nom:<input type="text" name="nom" ><br>
Salaire: <input type="number" name="salaire">
<input type="submit" value="envoyer">

</form>
<br>
${employee} <br>
</body>
</html>