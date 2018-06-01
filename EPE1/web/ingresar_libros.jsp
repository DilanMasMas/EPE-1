<%-- 
    Document   : ingresar_libros
    Created on : 31-05-2018, 15:46:21
    Author     : Dilan
--%>
<%@include file="secciones/seccion_administracion.jsp"  %>
<div>
    <h1 style="background-color: black; color: white;" align="center" >Ingresar libro</h1>  
    <form action="i_libro" method="post">
            <div style="position: relative; top: 80px; left: 200px;">
               <div class="form-group" >
    <label for="exampleInputEmail1">Nombre del libro:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese el nombre del libro" name="libro">
  </div>
              
                          <div class="form-group" >
    <label for="exampleInputEmail1">autor:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese el autor" name="autor">
  </div>
               
                          <div class="form-group" >
    <label for="exampleInputEmail1">genero:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese el genero" name="genero">
  </div>
                 <div class="form-group" >
    <label for="exampleInputEmail1">Stock:</label>
    <input style="width: 300px;" type="text" class="form-control" id="exampleInputUser" placeholder="Ingrese la cantidad de libros" name="stock">
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
