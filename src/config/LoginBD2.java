
package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginBD2 {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public LoginBD log(String nombre , String identificacion){
        LoginBD l = new LoginBD();
        String sql = "SELECT * FROM profesores WHERE Nombre=? AND identificacion =?";
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, identificacion);
            rs = ps.executeQuery();
            
            if(rs.next()){
                l.setNombre(rs.getString("Nombre"));
                l.setIdentificacion(rs.getString("identificacion"));
            }
        } catch (Exception e) {
            System.out.println("Error de login: " + e);
        }return l;
    }
    
    
    
}
