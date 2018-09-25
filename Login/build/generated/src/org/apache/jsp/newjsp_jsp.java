package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"http://getbootstrap.com/favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Inicio Sesion</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"signin.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("<!--<form action='SesionesServlet' method=\"POST\"> -->\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("  <center>\n");
      out.write("      <form action='ValidacionSesion' method=\"GET\">\n");
      out.write("          \n");
      out.write("      <img src=\"bootstrap-solid.svg\" alt=\"\" width=\"72\" height=\"72\">\n");
      out.write("      <h1>Porfavor ingrese</h1>\n");
      out.write("      <!--Codigo de Email-->\n");
      out.write("      \n");
      out.write("      <label for=\"inputEmail\">Correo electronico</label>\n");
      out.write("      <input type=\"email\" id=\"inputEmail\" name=\"Correo\" class=\"form-control\" placeholder=\"Email address\" required=\"\" autofocus=\"\">\n");
      out.write("      <!--Codigo de Contraseña-->\n");
      out.write("      \n");
      out.write("      <label for=\"inputPassword\">Contraseña</label>\n");
      out.write("      <input type=\"password\" id=\"inputPassword\" name=\"Contraseña\" class=\"form-control\" placeholder=\"Password\" required=\"\">\n");
      out.write("      \n");
      out.write("      <input class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">\n");
      out.write("      <p>© 2017-Siempre <3</p>\n");
      out.write("    \n");
      out.write("      </form>\n");
      out.write("  </center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
