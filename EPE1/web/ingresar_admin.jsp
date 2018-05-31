<%-- 
    Document   : ingresar_admin
    Created on : 31-05-2018, 15:19:31
    Author     : Dilan
--%>

<%@include file="secciones/seccion_administracion.jsp"  %>
<h1>Ingresar Administrador</h1>
<form action="control">
            <div style="position: relative; top: 80px; left: 200px;">
               <div class="form-group" >
    <label for="exampleInputEmail1">Nombre:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su Nombre Completo" name="nombre">
  </div>
              
                          <div class="form-group" >
    <label for="exampleInputEmail1">Rut:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su rut" name="rut">
  </div>
               
                          <div class="form-group" >
    <label for="exampleInputEmail1">Direccion:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese su direccion" name="direccion">
  </div>
                 <div class="form-group" >
    <label for="exampleInputEmail1">Libro: </label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese id del libro" name="libro">
  </div>
     <button type="submit" class="btn btn-primary">Encargar :v</button>
  </div >