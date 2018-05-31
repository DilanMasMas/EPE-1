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
      <div style="position: relative;bottom: 200px; left: 800px;">
          <table class=" table-bordered" style="color: white;">
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
</form>
