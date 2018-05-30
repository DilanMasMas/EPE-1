package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class conexionBD {

    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados = null;
    String nombreBD = "biblioteca";
    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    String usuario = "root";
    String password = "";
    
    public void insertarCliente(){
    
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
        
    }
}