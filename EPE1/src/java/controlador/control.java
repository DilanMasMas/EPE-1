/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import conexion.mostrarlibros;
import conexion.conexionBD;
import conexion.mostraradmin;
import conexion.mostrarcliente;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dilan
 */
@WebServlet(name = "control", urlPatterns = {"/control"})


public class control extends HttpServlet {

    public static LinkedList<mostrarlibros> getLibros()
   {
       
      LinkedList<mostrarlibros> listaLibros=new LinkedList<mostrarlibros>();
      
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
         Statement st = conexion.createStatement();
         ResultSet rs = st.executeQuery("select * from libros" );
         while (rs.next())
         {
            
             mostrarlibros mLibros = new mostrarlibros();
            mLibros.setId_l(rs.getInt("id_l"));
            mLibros.setLibro(rs.getString("libro"));
            mLibros.setStock(rs.getInt("stock"));
            listaLibros.add(mLibros);
         }
         rs.close();
         st.close();
         conexion.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaLibros;
   }
    public static LinkedList<mostrarcliente> getNombre()
   {
       
      LinkedList<mostrarcliente> listacliente=new LinkedList<mostrarcliente>();
      
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
         Statement st = conexion.createStatement();
         ResultSet rs = st.executeQuery("select * from clientes" );
         while (rs.next())
         {
            
             mostrarcliente mcliente = new mostrarcliente();
            mcliente.setId_c(rs.getInt("id_c"));
            mcliente.setNombre(rs.getString("nombre"));
            mcliente.setDireccion(rs.getString("direccion"));
            mcliente.setRut(rs.getInt("rut"));
            mcliente.setLibro_p(rs.getInt("libro_p"));
            listacliente.add(mcliente);
         }
         rs.close();
         st.close();
         conexion.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listacliente;
   }
    public static LinkedList<mostraradmin> getnombre()
   {
       
      LinkedList<mostraradmin> listaadmin=new LinkedList<mostraradmin>();
      
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
         Statement st = conexion.createStatement();
         ResultSet rs = st.executeQuery("select * from administradores" );
         while (rs.next())
         {
            
             mostraradmin madmin = new mostraradmin();
            madmin.setId_u(rs.getInt("id_u"));
            madmin.setcargo(rs.getString("cargo"));
            madmin.setnombre_u(rs.getString("nombre_u"));
            madmin.setcontraseña(rs.getString("contraseña"));
            madmin.setnombre(rs.getString("nombre"));
            listaadmin.add(madmin);
         }
         rs.close();
         st.close();
         conexion.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaadmin;
   }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        
        String nombre = request.getParameter("nombre");
        int rut = Integer.parseInt(request.getParameter("rut"));
        String direccion= request.getParameter("direccion");
        int libro = Integer.parseInt(request.getParameter("libro"));
       
        conexionBD con = new conexionBD();
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet control</title>"); 
            out.println("</head>");
            out.println("<body>");
            out.println(con.ingresar(nombre, rut, direccion, libro));
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
