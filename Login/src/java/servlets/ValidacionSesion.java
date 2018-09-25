/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Conexion.ConBas;


public class ValidacionSesion extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
      response.setContentType("text/html");
      HttpSession sesion = request.getSession();
      ConBas Conectar = new ConBas();
      String titulo = null;
      

      //Pedimos los atributos
      //String Usuario = request.getParameter("Correo");
      //String Contraseña = request.getParameter("Contra");
      
      String Usuario = (String)sesion.getAttribute("Correo");
      String Contraseña = (String)sesion.getAttribute("Contraseña");
      

      if(Conectar.Conecta(Usuario, Contraseña)){
          
        out.println("<h1> Sesion de " + Conectar.ObtenerRango(Usuario) + "</h1>");
        
        if(Conectar.ObtenerRango(Usuario).equals("administrador"))
        {
            out.println("Pagina para todos 1");
            out.println("Pagina de administrador 1");
        }
        else
            if(Conectar.ObtenerRango(Usuario).equals("normal"))
            {
                out.println("Pagina para todos 1");
                out.println("Pagina de usuario normal 1");
            }
        else
                out.println("Escribiste mal el rango :c");
        
        
      }
      else
      {
          titulo = "Sesion incorrecta, pruebe de nuevo " ;
          out.println("<h1>" + titulo + "</h1>");
          out.println("<p> Usuario: " + Usuario + " Contraseña: " + Contraseña + "<p>");
      }


      //Mostramos los  valores en el cliente
      
      
      out.println("<br>");
  
    }

}
