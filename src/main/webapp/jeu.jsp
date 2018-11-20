<%-- 
    Document   : jeu
    Created on : 14 nov. 2018, 14:39:18
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
    <body onload="document.guessForm.guess.focus()">
		<hr>
		<h2>${numberConnected} joueurs connectés</h2>
		<hr>

		<h3>Hello ${nom}, Devine mon nombre</h3>
                
			${essais}
                        ${message}
                        
		<h2>je pense à un nombre compris entre 0 et 100</h2>
		<form name="guessForm" method="POST" accept-charset="UTF-8" >
			<label>Ta proposition : <input type="number" min="0" max="100" required name="guess"></label> 
			<input type="SUBMIT" name="action" value="Deviner"><br/>
		</form>
		<form method="POST">
			<input type="SUBMIT" name="action" value="Deconnexion">
		</form>

		<hr>
		
			<h2>Score à battre : ${""} essais par ${""}</h2>
				
	</body>

    </body>
</html>
