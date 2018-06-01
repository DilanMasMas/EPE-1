<%-- 
    Document   : ingresar_admin
    Created on : 31-05-2018, 15:19:31
    Author     : Dilan
--%>

<%@include file="secciones/seccion_administracion.jsp"  %>
<div align="center" >
    <h1>Ingresar Administrador</h1>
    <form action="i_admin" method="post">
            <div >
               <div class="form-group" >
    <label for="exampleInputEmail1">Nombre:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su Nombre Completo" name="nombre">
  </div>
              
                          <div class="form-group" >
    <label for="exampleInputEmail1">Cargo:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su cargo" name="cargo">
  </div>
               
                          <div class="form-group" >
    <label for="exampleInputEmail1">Nombre de usuario:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su nombre de usuario" name="nombre_u">
  </div>
                 <div class="form-group" >
    <label for="exampleInputEmail1">Contraseña:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su contraseña" name="contraseña">
  </div>
     <button type="submit" class="btn btn-primary">Insertar</button>
  </div >
</div>
