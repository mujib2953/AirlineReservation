<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Find Flights</title>
	</head>
	<body>
		<h2>Find Flights</h2>
		<form method="post" action="searchFlight">
			<pre>
			From: 			<input type="text" name="from" />
			To: 			<input type="text" name="to" />
			Departure Date: <input type="text" name="departureDate" />
			<input type="submit" value="search flight" />
			</pre>
		</form>
	</body>
</html>