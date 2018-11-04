<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation</title>
</head>
<body>
	<h2>Reservation</h2>
	<pre>
	Airline: 	${ airline.operatingAirline }<br />
	Departure City: ${ airline.departureCity }<br />
	Arrival City: 	${ airline.arrivalCity }<br />
	</pre>
	<form method="post" action="completeReservation">
		<pre>
			<h4>Passanger Details</h4>
			First Name: <input type="text" name="passangerFirstName" />
			Last Name:  <input type="text" name="passangerLastName" />
			Middle Name:<input type="text" name="passangerMiddleName" />
			Email: 	    <input type="text" name="passangerEmail" />
			Phone: 	    <input type="text" name="passangerPhone" />
			
			<h4>Crad Details</h4>
			Name on the Card: <input type="text" name="nameOnTheCard" />
			Card No: 	  <input type="text" name="cardNumber" />
			Expiry Date: 	  <input type="text" name="expiryDate" />
			CVV: 		  <input type="text" name="cvv" />
			<input type="hidden" name="flightId" value="${ airline.id }" />
			<input type="submit" value="confirm" />
		</pre>
	</form>
	
</body>
</html>