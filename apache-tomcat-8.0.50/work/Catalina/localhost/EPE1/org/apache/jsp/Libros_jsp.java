/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-06-01 10:06:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import conexion.mostrarlibros;
import controlador.control;
import java.util.LinkedList;

public final class Libros_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/seccionesLibros/Asylum.jsp", Long.valueOf(1527847279395L));
    _jspx_dependants.put("/seccionesLibros/Comienzo.jsp", Long.valueOf(1527844011997L));
    _jspx_dependants.put("/seccionesLibros/Anillos.jsp", Long.valueOf(1527847214834L));
    _jspx_dependants.put("/seccionesLibros/Fin.jsp", Long.valueOf(1527846807986L));
    _jspx_dependants.put("/seccionesLibros/HP.jsp", Long.valueOf(1527847279428L));
    _jspx_dependants.put("/seccionesLibros/IT.jsp", Long.valueOf(1527847279526L));
    _jspx_dependants.put("/seccionesLibros/SHE.jsp", Long.valueOf(1527847279492L));
    _jspx_dependants.put("/seccionesLibros/PM.jsp", Long.valueOf(1527847279461L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("conexion.mostrarlibros");
    _jspx_imports_classes.add("controlador.control");
    _jspx_imports_classes.add("java.util.LinkedList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"icon\" href=\"secciones/img/icon.ico\">\n");
      out.write("        <title>Bibliotica MMD</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\" background-image: url(https://get.wallhere.com/photo/white-black-depth-of-field-wooden-surface-shadow-wood-books-green-writing-light-color-hand-material-shape-line-darkness-wing-1366x768-px-close-up-macro-photography-547399.jpg);\">\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Arriendo de Libros</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"icon\" href=\"secciones/img/icon.ico\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" crossorigin=\"anonymous\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\" background-image: url(http://www.hdfondos.eu/preview/get_photo/165226/1366/768);\">\r\n");
      out.write("    \r\n");
      out.write("<br>\r\n");
      out.write("<h1><p style= \"color: white;\" align=\"center\" >Información de libros</p></h1>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("    \r\n");
      out.write("    <article style=\"position: relative; top: 30px; height: 1000px; \">\r\n");
      out.write("\r\n");
      out.write("                   <h1 style= \"position: relative; left: 113px; color: white;\">El Señor de los Anillos</h1>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                   <img style=\"position: relative; left: 105px;\" src=\"imagenesLibros/anillo.jpg\" height=\"500\" width=\"350\"> \r\n");
      out.write("    </article>\r\n");
      out.write("    <article style=\"position: relative; height: 150px; width: 500px; bottom: 940px; left: 330px; \">\r\n");
      out.write("        \r\n");
      out.write("        <h4><p  style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("            Su historia se desarrolla en la Tercera Edad del Sol de la Tierra Media, un lugar ficticio poblado por hombres y otras razas antropomorfas como los hobbits, los elfos o los enanos, así como por muchas otras criaturas reales y fantásticas. La novela narra el viaje del protagonista principal, Frodo Bolsón, hobbit de la Comarca, para destruir el Anillo Único y la consiguiente guerra que provocará el enemigo para recuperarlo, ya que es la principal fuente de poder de su creador, el Señor oscuro Sauron.\r\n");
      out.write("        </p></h4>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <article style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("        <h4> \r\n");
      out.write("            Este tiene distintos libros\r\n");
      out.write("            <li>- El Silmarillion</li> \r\n");
      out.write("\r\n");
      out.write("            <li>- El Hobbit</li>\r\n");
      out.write("\r\n");
      out.write("            <li>- El Señor de los Anillos I: La Comunidad del Anillo</li>\r\n");
      out.write("\r\n");
      out.write("            <li>- El Señor de los Anillos II: Las dos Torres</li>\r\n");
      out.write("\r\n");
      out.write("            <li>- El señor de los Anillos III: El retorno del Rey</li>\r\n");
      out.write("        </h4>\r\n");
      out.write("         \r\n");
      out.write("    </article>\r\n");
      out.write("    </article>\r\n");
      out.write("        \r\n");
      out.write("    <head></head>\r\n");
      out.write("    \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<br>\r\n");
      out.write("<h1 style=\"background-color: black; color: white;\" align=\"center\" >Información</h1>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("    \r\n");
      out.write("    <article style=\"position: relative; top: 30px; height: 1000px; \">\r\n");
      out.write("\r\n");
      out.write("                   <h1 style=\"position: relative; left: 113px; color: white;\">Asylum</h1>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("        <img style=\"position: relative; left: 105px;\" src=\"imagenesLibros/A.jpg\" height=\"500\" width=\"350\"> \r\n");
      out.write("    </article>\r\n");
      out.write("    <article style=\"position: relative; height: 150px; width: 500px; bottom: 940px; left: 330px; \">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <h2><p style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("            Asylum (2013) publicado en agosto, tiene una secuela Sanctum y un 1.5 The Scarlets (también llamada \"Asylum 1.5\") Libro escrito por Madeleine Roux\r\n");
      out.write("         </p> </h2>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("       <article style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("           <h2>\r\n");
      out.write("          Este libro luego fue adaptado a peliculas las cuales son estas\r\n");
      out.write("          <li>- Asylum (1972), película dirigida por Peter Cushing.</li>\r\n");
      out.write("          <li>- Asylum (2005), película dirigida por David Mackenzie.</li>\r\n");
      out.write("          <li>- Asylum (2008), película dirigida por David R. Ellis.</li>\r\n");
      out.write("        \r\n");
      out.write("        </h2>\r\n");
      out.write("</article>\r\n");
      out.write("        </article>\r\n");
      out.write("       \r\n");
      out.write("    <head></head>\r\n");
      out.write("    \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<br>\r\n");
      out.write("<h1 style=\"background-color: black; color: white;\" align=\"center\" >Información</h1>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("    \r\n");
      out.write("    <article style=\"position: relative; top: 30px; height: 1000px; \">\r\n");
      out.write("\r\n");
      out.write("                   <h1 style=\"position: relative; left: 113px; color: white;\">Harry Potter y La Piedra Filosofal</h1>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("        <img style=\"position: relative; left: 105px;\" src=\"imagenesLibros/HP.jpg\" height=\"500\" width=\"350\"> \r\n");
      out.write("    </article>\r\n");
      out.write("    <article style=\"position: relative; height: 150px; width: 500px; bottom: 940px; left: 330px; \">\r\n");
      out.write("        \r\n");
      out.write("        <h2><p style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("            Harry Potter y la piedra filosofal, llamado también Harry Potter 1 o abreviado HP1, es el primer libro de la serie literaria Harry Potter, escrito por la autora británica J. K. Rowling en 1997, que supuso además el debut de Rowling como escritora profesional.\r\n");
      out.write("            </p></h2>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <article style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("            <h2>\r\n");
      out.write("          La novela fue rechazada por varias editoriales hasta que la editorial Bloomsbury se decidió a publicarla. La edición británica salió a la venta el 26 de junio de 1997, Luego fue adaptada a una pelicula.\r\n");
      out.write("          <li>- Harry Potter y la piedra filosofal (2001).\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            Y en el año 2002 fue adaptado a un videojuego\r\n");
      out.write("        </li></h2>\r\n");
      out.write("    </article>\r\n");
      out.write("        </article>\r\n");
      out.write("    <head></head>\r\n");
      out.write("    \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<br>\r\n");
      out.write("<h1 style=\"background-color: black; color: white;\" align=\"center\" >Información</h1>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("    \r\n");
      out.write("    <article style=\"position: relative; top: 30px; height: 1000px; \">\r\n");
      out.write("\r\n");
      out.write("                   <h1 style=\"position: relative; left: 113px; color: white;\">IT</h1>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("        <img style=\"position: relative; left: 105px;\" src=\"imagenesLibros/IT.jpg\" height=\"500\" width=\"350\"> \r\n");
      out.write("    </article>\r\n");
      out.write("    <article style=\"position: relative; height: 150px; width: 500px; bottom: 940px; left: 330px; \">\r\n");
      out.write("        \r\n");
      out.write("        <h2><p style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("          IT es una novela de terror publicada en 1986 por el escritor estadounidense Stephen King. Cuenta la historia de un grupo de siete niños que son aterrorizados por un malvado monstruo que es capaz de cambiar de forma, alimentándose del terror que produce en sus víctimas. \r\n");
      out.write("        </p>\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           <article style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("            <h2> \r\n");
      out.write("          Este libro luego fue adaptado a peliculas las cuales son estas\r\n");
      out.write("          <li>-> IT:ESO (1986)</li>\r\n");
      out.write("          <li>-> IT:ESO (2017)</li>\r\n");
      out.write("        \r\n");
      out.write("        </h2>\r\n");
      out.write("    </article>\r\n");
      out.write("        </article>\r\n");
      out.write("    <head></head>\r\n");
      out.write("    \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<br>\r\n");
      out.write("<h1 style=\"background-color: black; color: white;\" align=\"center\" >Información</h1>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("    \r\n");
      out.write("    <article style=\"position: relative; top: 30px; height: 1000px; \">\r\n");
      out.write("\r\n");
      out.write("                   <h1 style=\"position: relative; left: 113px; color: white;\">Papelucho y el Marciano</h1>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("        <img style=\"position: relative; left: 105px;\" src=\"imagenesLibros/PM.jpg\" height=\"500\" width=\"350\"> \r\n");
      out.write("    </article>\r\n");
      out.write("    <article style=\"position: relative; height: 150px; width: 500px; bottom: 940px; left: 330px; \">\r\n");
      out.write("        \r\n");
      out.write("       <h2><p style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("            Papelucho es el protagonista de una serie de libros para niños creado por la escritora chilena Marcela Paz que narran las aventuras de un niño chileno.\r\n");
      out.write("        </p></h2>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("       <article style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("            <h4> \r\n");
      out.write("        <li>\r\n");
      out.write("         El protagonista de \"Papelucho\" es un niño de ocho años, que aparentemente no cumple más edad, cuyas aventuras ocurren principalmente dentro de su cabeza. Su ingenio e imaginación para interpretar las cosas cotidianas de la vida lo han transformado en el personaje infantil más querido y leído de la narrativa chilena. Una de sus características más notorias es la intención de querer solucionar los problemas, las cuales, al introducirse en un acto concreto, terminan por dejar las cosas peor que como estaban originalmente.\r\n");
      out.write("        </li>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("        <li>\r\n");
      out.write("          Este libro luego fue adaptado a una pelicula \r\n");
      out.write("          <li>- Papelucho y el Marciano (2007).\r\n");
      out.write("        </li>\r\n");
      out.write("        <h4> \r\n");
      out.write("    </article>\r\n");
      out.write("        </article>\r\n");
      out.write("    <head></head>\r\n");
      out.write("    \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<br>\r\n");
      out.write("<h1 style=\"background-color: black; color: white;\" align=\"center\" >Información</h1>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("    \r\n");
      out.write("    <article style=\"position: relative; top: 30px; height: 1000px; \">\r\n");
      out.write("\r\n");
      out.write("                   <h1 style=\"position: relative; left: 113px; color: white;\">Las Aventuras de Sherlock Homes</h1>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("        <img style=\"position: relative; left: 105px;\" src=\"imagenesLibros/SH.jpg\" height=\"500\" width=\"350\"> \r\n");
      out.write("    </article>\r\n");
      out.write("    <article style=\"position: relative; height: 150px; width: 500px; bottom: 940px; left: 330px; \">\r\n");
      out.write("        \r\n");
      out.write("        <h2><p style=\"position: relative; left: 200px; top: 30px; color: blue;\">\r\n");
      out.write("            Las aventuras de Sherlock Holmes (en inglés: The Adventures of Sherlock Holmes) es una colección de doce cuentos escritos por Arthur Conan Doyle, en los que el personaje principal es el detective de ficción Sherlock Holmes. Se publicaron por primera vez el 14 de octubre de 1892; las historias se habían publicado individualmente en The Strand Magazine entre junio de 1891 y julio de 1892. En el libro no se presentan las historias en orden cronológico y los únicos personajes que se repiten en todos los cuentos son Holmes y el doctor Watson. Son narrados en primera persona desde el punto de vista de Watson.\r\n");
      out.write("        </p></h2>\r\n");
      out.write("    </article>\r\n");
      out.write("    <head></head>\r\n");
      out.write("    \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("     <br>\n");
      out.write("<footer class=\"py-5 bg-dark\" style=\"position: relative;\n");
      out.write("  bottom: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 5px;\n");
      out.write("\" >\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <p class=\"m-0 text-center text-white\">Copyright &copy; LibreryMMD! 2018</p>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    </body> \n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
