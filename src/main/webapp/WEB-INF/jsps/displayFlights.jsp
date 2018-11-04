<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flights</title>
</head>
<body>
	<h2>Searched Flights</h2>

	<table>
		<thead>
			<tr>
				<th>Airline</th>
				<th>Departure City</th>
				<th>Arrival City</th>
				<th>Departure Time</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ flights }" var="flight">
				<tr>
					<td>${flight.operatingAirline}</td>
					<td>${flight.departureCity}</td>
					<td>${flight.arrivalCity}</td>
					<td>${flight.estimatedDepartureTime}</td>
					
					<td>
						<a href="showCompleteReservation?flightId=${ flight.id }">Select</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>