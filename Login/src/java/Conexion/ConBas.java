package Conexion;

import static java.io.FileDescriptor.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConBas {
    String url = "jdbc:mysql://localhost/UsuariosLab3";
    String usr = "root";
    String pass = "n0m3l0";
    Connection conexion = null;
    Statement sta = null;
    ResultSet rset = null;
    
    String rango;
    
    public Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex00)
        {
            System.out.print("Error por clase inexistente.");
        }
        
        try
        {
            conexion = DriverManager.getConnection(url, usr, pass);
        }
        catch(SQLException e)
        {
            System.out.println("Error de la conexion" + e.getMessage());
        }
            
        return conexion;
    }
    
    public void cerrar() throws SQLException {
        conexion.close();
    }
    
    
    
    public boolean Conecta (String Usuario, String Contraseña)
    {
        boolean valida = false;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usr, pass);
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la conexión: " + e.toString());
        }
        
        try 
        {
            sta = conexion.createStatement();
            rset = sta.executeQuery("select * from Usuarios1 where usuario = '" + Usuario + "' and contraseña = '" + Contraseña + "'");
            
            
            if(rset.next())
            {
                valida = true;
            }
            else
                valida = false;
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.toString());
        }
        
        return valida;
    }
    
    public String ObtenerRango(String Usuario)
    {
        String Rango="";
        //Conexion
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(url, usr, pass);
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la conexión: " + e.toString());
        }
        //Obtener rango
        try 
        {
            DriverManager.getConnection(url, usr, pass).prepareStatement("select * from Usuarios1 where usuario = '" + Usuario + "'");
        } 
        catch (SQLException error) 
        {
            System.out.println("1");
        }
        try
            {
                if(DriverManager.getConnection(url, usr, pass).prepareStatement("select * from Usuarios1 where usuario = '" + Usuario + "'").executeQuery().next())
                {
                     Rango =  DriverManager.getConnection(url, usr, pass).prepareStatement("select * from Usuarios1 where usuario = '" + Usuario + "'").executeQuery().getString("rango");
                     
                     
                     if(rango.equals(""))
                     System.out.println("No se guarda el rango");
                     else
                         System.out.println(Rango);
                }
            }
        catch(SQLException error){
                System.out.println("Error en el llenado del rango");
                }
    return Rango;
    }
}
