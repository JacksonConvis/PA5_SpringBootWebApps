<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/result" method="post">
<input type="number" name="num_one"/>
+ <input type="radio" name="operation" value="plus"/>
- <input type="radio" name="operation" value="minus"/>
* <input type="radio" name="operation" value="multiply"/>
/ <input type="radio" name="operation" value="divide"/>
<input type="number" name="num_two"/>
<input type="submit" value="submit"/>
</form>

</body>
</html>