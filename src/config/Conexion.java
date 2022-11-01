
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/proyectosi";
    String user = "root";
    String password = "";
    
    
    public Connection Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("No se pudo conectar: "+e);
        }
        return con;
    }
   
}
