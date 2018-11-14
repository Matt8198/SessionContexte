<%-- 
    Document   : JSP
    Created on : 14 nov. 2018, 13:23:03
    Author     : Matthias
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenue dans notre jeu !</h1>
		<hr>
		<h2>${mess}</h2>
                
		<hr>
                <p>${nom}</p>
                
        <form method="POST">
		<label>Ton prénom : <input name="playerName"></label>
		<input name="action" value="Connexion" type="SUBMIT">
	</form>

    </body>
</html>
