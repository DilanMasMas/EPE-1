<%@page import="java.util.LinkedList"%>
<%@page import="controlador.control"%>
<%@page import="conexion.mostraradmin"%>
<div>
    <h1 style="background-color: black; color: white;" align="center" >Ingresar Administrador</h1>  
    <form action="i_admin" method="post">
            <div style="position: relative; top: 80px; left: 200px;">
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
 <div style="position: relative;bottom: 250px; left: 800px;">
   <table class="table-bordered table-dark" style="color: white;">
   <thead >
      <tr >
        <th>id del libro</th>
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
           