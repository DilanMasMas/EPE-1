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
}