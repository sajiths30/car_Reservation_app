<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Cars</title>
</head>
<body>
<h2>Display Car Details</h2>
<table border="1">
<tr>
<th>CAR SERVICE</th>
<th>DEPARTURE CITY</th>
<th>ARRIVAL CITY</th>
<th>ESTIMATED TIME</th>
<th>SELECT</th>
</tr>
<c:forEach var="cars" items="${cars}">
<tr>
<td>${cars.carService}</td>
<td>${cars.departureCity}</td>
<td>${cars.arrivalCity}</td>
<td>${cars.estimatedDepartureTime}</td>
<td><a href="showReservation?carId=${cars.id}">Select</a>
</td>
</c:forEach>
</table>
</body>
</html>