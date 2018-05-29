<%-- 
    Document   : login
    Created on : 29-05-2018, 0:52:37
    Author     : Dilan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form id="form_911240" class="appnitro"  method="post" action="ValidateUser.jsp">
					<div class="form_description">
			<h2>Inicio de Sesion</h2>
			<p></p>
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="element_1">Usuario  </label>
		<div>
			<input id="element_1" name="uname" class="element text small" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_2" >
		<label class="description" for="element_2">Contraseña </label>
		<div>
			<input id="password" name="pass" class="element text small" type="password" maxlength="255" value=""/> 
		</div> 
		</li>
               
					<li class="buttons">
			    <input type="hidden" name="form_id" value="911240" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Ingresar" />
		</li>
			</ul>
		</form>	
    </body>
</html>
