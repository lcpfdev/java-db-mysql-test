<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AeroParker Test</title>



</head>
<body class="container-fluid">
	<div class="card" id="div1">
		<h2 class="card-header text-center text-light bg-danger">Aero Parker Registration
			Form</h2>
		<form class="form" action="register" method="get">
			<table class="table table-hover table-striped">
				<tr>
					<td>Title:</td>
					<td><input type="text" name="Title"></td>
				</tr>
				<tr>
				<td>First Name:</td>
					<td><input type="text" name="First Name"></td>
				<tr>
				<td>Last Name:</td>
					<td><input type="text" name="Last Name"></td>
				<tr>
					<td>Address Line 1:</td>
					<td><input type="text" name="Address Line 1"></td>
				<tr>
				<tr>
					<td>Address Line 2:</td>
					<td><input type="text" name="Address Line 2"></td>
				<tr>
				<tr>
					<td>City:</td>
					<td><input type="text" name="City"></td>
				<tr>
				<tr>
					<td>Postcode:</td>
					<td><input type="text" name="Postcode"></td>
				<tr>
								<tr>
					<td>Telephone Number:</td>
					<td><input type="text" name="Telephone Number"></td>
				<tr>
					<td>Email Address:</td>
					<td><input type="text" name="Email Address"></td>
				<tr>
					<td><input type="submit" value="register"
						class="btn btn-outline-success"></td>
					<td><input type="reset" value="reset"
						class="btn btn-outline-danger"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>