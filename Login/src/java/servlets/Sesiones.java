package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Sesiones extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//Servlet para definir parametros de sesion
    //Pedimos los atributos
    String Correo = request.getParameter("Correo");
    String Contraseña = request.getParameter("Contra");
         //Definir atributos de sesion
        HttpSession sesion = request.getSession();
        sesion.setAttribute("Correo", Correo);
        sesion.setAttribute("Contraseña", Contraseña);
        response.setContentType("text/html");
      //Redireccionar a validacion con Base de datos
      response.sendRedirect("http://localhost:8080/Login/ValidacionSesion");
  
    }
   

}
