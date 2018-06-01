
<%@page import="java.util.LinkedList"%>
<%@page import="controlador.control"%>
<%@page import="conexion.mostraradmin"%>
<div>
    <h1 style="back-ground-color: black; color: white;" align="center" >Ingresar Administrador</h1>  
    <form action="e_admin" method="post">
            <div style="position: relative; top: 80px; left: 200px;">
               <div class="form-group" >
    <label for="exampleInputEmail1">Eliminacion de Administrador</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese id " name="id_u">
  </div>
     <button type="submit" class="btn btn-primary">Eliminar</button>
  </div >
</div>
 <div style="position: relative;bottom: 50px; left: 800px;">
   <table class="table-bordered table-dark" style="color: white;">
   <thead >
      <tr >
        <th>id admin</th>
        <th>Nombre</th>
        <th>cargo</th>
        <th>usuario</th>
        <th>pass</th>
      </tr>
    </thead>
    <tbody>
      <tr>
    <%
LinkedList<mostraradmin> lista = control.getnombre();
for (int i=0;i<lista.size();i++)
{
   out.println("<tr>");
   out.println("<td>"+lista.get(i).getId_u()+"</td>");
   out.println("<td>"+lista.get(i).getnombre()+"</td>");
   out.println("<td>"+lista.get(i).getcargo()+"</td>");
   out.println("<td>"+lista.get(i).getnombre_u()+"</td>");
   out.println("<td>"+lista.get(i).getcontraseña()+"</td>");
   out.println("</tr>");
}
%>
      </tr>
    </tbody>
  </table>
</div>
           