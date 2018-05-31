<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="conexion.mostrarlibros" %> 
<%@page import ="controlador.control"%> 
<%@page import ="java.util.LinkedList"%> 

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Arriendo de Libros</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" crossorigin="anonymous"></script>
</head>
<body style=" background-image: url(https://get.wallhere.com/photo/white-black-depth-of-field-wooden-surface-shadow-wood-books-green-writing-light-color-hand-material-shape-line-darkness-wing-1366x768-px-close-up-macro-photography-547399.jpg);">
          
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="index.jsp">LibreryMMD</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="login.jsp">Login <span class="sr-only">(current)</span></a>
      </li>   
    </ul>
  </div>
</nav>