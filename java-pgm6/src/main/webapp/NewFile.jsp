<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ITreturn" method="get">
		<h3>Income Tax Form</h3>
        Name<input type="text" name="name"><br>
        Gender:
        Male <input type="radio" name="gender" value="Male">
        Female <input type="radio" name="gender" value="Female"><br>
        Salary: <input type="number" min="0" name="salary"><br>
        Tax Deductions: <input type="number" name="deduction"><br>
        <input type="submit" value="Submit" />
	</form>
</body>
</html>