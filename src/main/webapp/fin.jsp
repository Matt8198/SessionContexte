<%-- 
    Document   : fin
    Created on : 18 nov. 2018, 14:03:27
    Author     : Matthias
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <hr>
		<h2>${numberConnected} joueurs connectés</h2>
		<hr>

		<h3>Bravo, tu as gagné !</h3>
		<form method="POST">
			<input type="SUBMIT" name="action" value="Déconnexion"/>
			<input type="SUBMIT" name="action" value="Rejouer"/>
		</form>

    </body>
</html>
