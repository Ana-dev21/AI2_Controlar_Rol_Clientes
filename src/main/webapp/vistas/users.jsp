<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.edix.controlclientes.model.beans.Event"%>
<%@page import="com.edix.controlclientes.model.beans.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Eventos Destacados</title>
</head>
<body>

<!-- Logo -->

<table border="1">
	<tr>
		<td>Eventos</td>
	</tr>
</table>

<table border="1">
	<tr>
		<th>Destacados / Activos</th>
		<th>Tipo de Evento</th>
		<th>Mis Reservas</th>
		<th>Login</th>
		<th>Registro</th>
		<th>Salir</th>
	<tr/>
</table>

<p>Bienvenido ${user.name}!</p>

<h1>Listado de Eventos Destacados</h1>
<table border="1">
	<tr>
		<th>Nombre</th>
		<th>Aforo</th>
		<th>Fecha Inicio</th>
		<th>Opciones</th>
	<tr/>
	
</table>

</body>
</html>