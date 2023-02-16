<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<h1>employee details</h1>
<body>
  
	<div>
		<form action="EmployeeDetailsController"method ="post">
			<div>
				employee id : <input type="text" name="employee id" id="employee id">
			</div>
			<br /> <br />
			<div>
				employee name : <input type="text" name="employee name"
					id="employee name">
			</div>
			<br /> <br />
			<div>
				father name : <input type="text" name="father name" id="father name">
			</div>
			<br /> <br />
			<div>
				mother name : <input type="text" name="mother name" id="mother name">
			</div>
			<br /> <br />
			<div>
				dob : <input type="text" name="dob" id="dob">
			</div>
			<br /> <br />
			<div>
				email id : <input type="text" name="email id" id="email id">
			</div>
			<br /> <br />
			<div>
				city : <input type="text" name="city" id="city">
			</div>
			<br /> <br />
			<div>
				phone no : <input type="text" name="phone no" id="phone no">
			</div>
			<br /> <br />
			<div>
				<button type="submit">OK</button>
			</div>
		</form>
	</div>
</body>
</html>