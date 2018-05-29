<%-- 
    Document   : index
    Created on : 28-05-2018, 23:16:43
    Author     : Dilan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Arriendo de Libros</title>
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
            <div style="position: relative; top: 80px; left: 200px;">
               <div class="form-group" >
    <label for="exampleInputEmail1">Nombre:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su Usuario">
  </div>
                </br>
                          <div class="form-group" >
    <label for="exampleInputEmail1">Rut:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su Usuario">
  </div>
                </br>
                          <div class="form-group" >
    <label for="exampleInputEmail1">Direccion:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su Usuario">
  </div>
             </br>   
     <button type="submit" class="btn btn-primary">Submit</button>
  </div >
      <div style="position: relative;bottom: 200px; left: 500px;">
          <table class=" table-bordered" >
   <thead >
      <tr >
        <th >Seleccionar</th>
        <th >Nombre</th>
        <th>Stock</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
      </tr>
      <tr>
        <td>Mary</td>
        <td>Moe</td>
        <td>mary@example.com</td>
      </tr>
      <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>july@example.com</td>
      </tr>
    </tbody>
  </table>
      </div>
      
      
</form>

    </body>
    <!--  
    <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>????
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">Page 2</a></li>
    </ul> 
    -->
</html>
