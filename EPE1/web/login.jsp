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
        <title>Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body style=" background-image: url(https://get.wallhere.com/photo/white-black-depth-of-field-wooden-surface-shadow-wood-books-green-writing-light-color-hand-material-shape-line-darkness-wing-1366x768-px-close-up-macro-photography-547399.jpg);">
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">LibrosQueSeLeen</a>
    </div>
    
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
        
        <form>
            <div align="center">
               <div class="form-group" >
    <label for="exampleInputEmail1">Usuario:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su Usuario">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Contraseña:</label>
    <input style="width: 300px;" type="password" class="form-control" id="exampleInputPassword1" placeholder="Ingrese Contraseña">
  </div>
                <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form>
    </body>
</html>
