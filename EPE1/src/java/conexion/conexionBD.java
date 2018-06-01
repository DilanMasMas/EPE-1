package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//Aqui se establece la conexion en la base de datos 

public class conexionBD {
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados = null;
    String nombreBD = "biblioteca";
    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    String usuario = "root";
    String password = "";
  
    
     public String ingresar(String nombre, int rut, String direccion, int libro){

         String mensaje=null;
         
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conexion = DriverManager.getConnection(url,usuario,password);
    sentencia = conexion.createStatement();
    String SQL = "INSERT INTO clientes (id_c, nombre, rut, direccion, libro_p) VALUES (null,'"+nombre+"','"+rut+"','"+direccion+"','"+libro+"');";
    String SQL2 ="UPDATE libros SET stock = IFNULL(stock,0) - 1 WHERE id_l='"+libro+"';";
    sentencia.executeUpdate(SQL);
    sentencia.executeUpdate(SQL2);
          mensaje ="<script>alert('Datos ingresados correctamente');"
                    + "location.href='index.jsp';"
                    + "</script>";; 
    sentencia.close();
    conexion.close();
    
    }catch(ClassNotFoundException | SQLException Error){
     mensaje = "<script>alert('Error en el sistema');</script>";
    }
        return mensaje;
    }
     public String validar(String nombre_u, String contraseña){
         String alerta=null;
         
         try{
    Class.forName("com.mysql.jdbc.Driver");
     conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca",
            "root", "");
    Statement st = conexion.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from administradores where nombre_u='" + nombre_u + "' and contraseña='" + contraseña + "'");
    if (rs.next()) {
        
        alerta="<script>alert('BIENVENIDO');"
                    + "location.href='administracion.jsp';"
                    + "</script>";
        
    } else {
       alerta="<script>alert('Datos incorrectos');"
                    + "location.href='login.jsp';"
                    + "</script>";
       
    }
         }catch(Exception e){
         
         alerta="<script>alert('Error :');</script>";
         } 
         
         return alerta;
     
     }
     public String ingresar_admin(String nombre, String cargo, String nombre_u, String contraseña){

         String mensaje2=null;
         
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conexion = DriverManager.getConnection(url,usuario,password);
    sentencia = conexion.createStatement();
    String SQL = "INSERT INTO administradores (id_u, nombre, cargo, nombre_u, contraseña) VALUES (null,'"+nombre+"','"+cargo+"','"+nombre_u+"','"+contraseña+"');";
    sentencia.executeUpdate(SQL);
          mensaje2 ="<script>alert('Datos ingresados correctamente');"
                    + "location.href='ingresar_admin.jsp';"
                    + "</script>";; 
    sentencia.close();
    conexion.close();
    
    }catch(ClassNotFoundException | SQLException Error){
     mensaje2 = "<script>alert('Error en el sistema');</script>";
    }
        return mensaje2;
    }
     public String ingresar_libro(String libro, String autor, String genero, int stock){

         String mensaje2=null;
         
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conexion = DriverManager.getConnection(url,usuario,password);
    sentencia = conexion.createStatement();
    String SQL = "INSERT INTO libros (id_l, libro, autor, genero, stock) VALUES (null,'"+libro+"','"+autor+"','"+genero+"','"+stock+"');";
    sentencia.executeUpdate(SQL);
          mensaje2 ="<script>alert('Datos ingresados correctamente');"
                    + "location.href='ingresar_libros.jsp';"
                    + "</script>";
    sentencia.close();
    conexion.close();
    
    }catch(ClassNotFoundException | SQLException Error){
     mensaje2 = "<script>alert('Error en el sistema');</script>";
    }
        return mensaje2;
    }
     public String eliminar_admin(String nombre, String cargo, String nombre_u, String contraseña){

         String mensaje2=null;
         
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conexion = DriverManager.getConnection(url,usuario,password);
    sentencia = conexion.createStatement();
    String SQL = "INSERT INTO administradores (id_u, nombre, cargo, nombre_u, contraseña) VALUES (null,'"+nombre+"','"+cargo+"','"+nombre_u+"','"+contraseña+"');";
    sentencia.executeUpdate(SQL);
          mensaje2 ="<script>alert('Datos ingresados correctamente');"
                    + "location.href='ingresar_admin.jsp';"
                    + "</script>";; 
    sentencia.close();
    conexion.close();
    
    }catch(ClassNotFoundException | SQLException Error){
     mensaje2 = "<script>alert('Error en el sistema');</script>";
    }
        return mensaje2;
    }
     public String eliminar_cliente(String nombre, String cargo, String nombre_u, String contraseña){

         String mensaje2=null;
         
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conexion = DriverManager.getConnection(url,usuario,password);
    sentencia = conexion.createStatement();
    String SQL = "INSERT INTO administradores (id_u, nombre, cargo, nombre_u, contraseña) VALUES (null,'"+nombre+"','"+cargo+"','"+nombre_u+"','"+contraseña+"');";
    sentencia.executeUpdate(SQL);
          mensaje2 ="<script>alert('Datos ingresados correctamente');"
                    + "location.href='ingresar_admin.jsp';"
                    + "</script>";; 
    sentencia.close();
    conexion.close();
    
    }catch(ClassNotFoundException | SQLException Error){
     mensaje2 = "<script>alert('Error en el sistema');</script>";
    }
        return mensaje2;
    }
     public String eliminar_libro(String nombre, String cargo, String nombre_u, String contraseña){

         String mensaje2=null;
         
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conexion = DriverManager.getConnection(url,usuario,password);
    sentencia = conexion.createStatement();
    String SQL = "INSERT INTO administradores (id_u, nombre, cargo, nombre_u, contraseña) VALUES (null,'"+nombre+"','"+cargo+"','"+nombre_u+"','"+contraseña+"');";
    sentencia.executeUpdate(SQL);
          mensaje2 ="<script>alert('Datos ingresados correctamente');"
                    + "location.href='ingresar_admin.jsp';"
                    + "</script>";; 
    sentencia.close();
    conexion.close();
    
    }catch(ClassNotFoundException | SQLException Error){
     mensaje2 = "<script>alert('Error en el sistema');</script>";
    }
        return mensaje2;
    }
     public String editar_admin(String nombre, String cargo, String nombre_u, String contraseña){

         String mensaje2=null;
         
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conexion = DriverManager.getConnection(url,usuario,password);
    sentencia = conexion.createStatement();
    String SQL = "INSERT INTO administradores (id_u, nombre, cargo, nombre_u, contraseña) VALUES (null,'"+nombre+"','"+cargo+"','"+nombre_u+"','"+contraseña+"');";
    sentencia.executeUpdate(SQL);
          mensaje2 ="<script>alert('Datos ingresados correctamente');"
                    + "location.href='ingresar_admin.jsp';"
                    + "</script>";; 
    sentencia.close();
    conexion.close();
    
    }catch(ClassNotFoundException | SQLException Error){
     mensaje2 = "<script>alert('Error en el sistema');</script>";
    }
        return mensaje2;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /*



public void Conx(){
    
         try {
           
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    url, usuario, password);
            sentencia = conexion.createStatement();
             System.out.println("<script>alert('conecio !!!');</script>");
                     
        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("<script>alert('conecio !!!')"+e+";</script>");

        }
    }
    
    public String insertarCliente(){
    
        String mensaje=null;
    try {
           
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    url, usuario, password);
            sentencia = conexion.createStatement();
            
            
            String sql = "INSERT INTO clientes (`id_c`, `nombre`, `rut`, `direccion`, `libro_p`) VALUES (NULL, 'Harry Potter y la piedra filosofal', 'J. K. Rowling', 'Literatura fantástica', '3');";
            resultados = sentencia.executeQuery(sql);

            
            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Error" + e);

        }
    }*/

