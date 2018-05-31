


<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<% try
    
      {
          
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
         Statement st = conexion.createStatement();
         out.print("comendjsj");
      }
      catch (Exception e)
      {
         out.print("dfhasjkf no sertbe");
      }
     
   }
%>