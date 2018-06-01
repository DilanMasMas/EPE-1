<%-- 
    Document   : seccion_eliminarC
    Created on : 01-06-2018, 5:50:37
    Author     : Dilan
--%>

<%@page import="conexion.mostrarcliente"%>
<%@page import="java.util.LinkedList"%>
<%@page import="controlador.control"%>
<%@page import="conexion.mostraradmin"%>
<div>
    <h1 style="back-ground-color: black; color: white;" align="center" >Ingresar Administrador</h1>  
    <form action="e_cliente" method="post">
            <div style="position: relative; top: 80px; left: 200px;">
               <div class="form-group" >
    <label for="exampleInputEmail1">Eliminacion de Cliente</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese id " name="id_c">
  </div>
     <button type="submit" class="btn btn-primary">Eliminar</button>
  </div >
</div>
 <div style="position: relative;bottom: 50px; left: 800px;">
   <table class="table-bordered table-dark" style="color: white;">
   <thead >
      <tr >
        <th>id cliente</th>
        <th>Nombre</th>
        <th>Rut</th>
        <th>Direccion</th>
        <th>Libro</th>
      </tr>
    </thead>
    <tbody>
      <tr>
    <%
LinkedList<mostrarcliente> lista = control.getNombre();
for (int i=0;i<lista.size();i++)
{
   out.println("<tr>");
   out.println("<td>"+lista.get(i).getId_c()+"</td>");
   out.println("<td>"+lista.get(i).getNombre()+"</td>");
   out.println("<td>"+lista.get(i).getRut()+"</td>");
   out.println("<td>"+lista.get(i).getDireccion()+"</td>");
   out.println("<td>"+lista.get(i).getLibro_p()+"</td>");
   out.println("</tr>");
}
%>
      </tr>
    </tbody>
  </table>
</div>
           