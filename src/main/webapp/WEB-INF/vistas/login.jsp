<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Iniciar sesión</title>
</head>
<body>
<section class="contenedor">
	
		<h1>Iniciar sesión</h1>

			<form method="post" action="login">
				
				<label for="userName"> Nombre de Usario: </label><br>
				<input type="text" name="username" placeholder="Nombre de Usario"/><br><br>
				<label for="password"> Contraseña: </label><br>
				<input type="password" name="password" placeholder="Contraseña"/><br><br>
		
				<button>Iniciar sesión</button>
				
			</form>
					
			<p class="errorMessage"> ${message} </p>
		
	
	</section>

</body>
</html>