<%-- 
    Document   : seccion_eliminarC
    Created on : 01-06-2018, 5:50:37
    Author     : Dilan
--%>

<%@page import="conexion.mostrarlibros"%>
<%@page import="conexion.mostrarcliente"%>
<%@page import="java.util.LinkedList"%>
<%@page import="controlador.control"%>
<%@page import="conexion.mostraradmin"%>
<div>
    <h1 style="back-ground-color: black; color: white;" align="center" >Ingresar Administrador</h1>  
    <form action="e_libro" method="post">
            <div style="position: relative; top: 80px; left: 200px;">
               <div class="form-group" >
    <label for="exampleInputEmail1">Eliminacion de libro:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese id " name="id_l">
  </div>
     <button type="submit" class="btn btn-primary">Eliminar</button>
  </div >
</div>
 <div style="position: relative;bottom: 50px; left: 800px;">
   <table class="table-bordered table-dark" style="color: white;">
   <thead >
      <tr >
        <th>id del libro</th>
        <th>Nombre</th>
        <th>Stock</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <%
LinkedList<mostrarlibros> lista = control.getLibros();
for (int i=0;i<lista.size();i++)
{
   out.println("<tr>");
   out.println("<td>"+lista.get(i).getId_l()+"</td>");
   out.println("<td>"+lista.get(i).getLibro()+"</td>");
   out.println("<td>"+lista.get(i).getStock()+"</td>");
   out.println("</tr>");
}
%>
      </tr>
    </tbody>
  </table>
</div>