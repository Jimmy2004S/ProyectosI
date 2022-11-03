
package proyectodeinvestigacion.clases;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProfesorDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    
    public boolean RegistrarCliente(Profesor pro){
        String sql = "INSERT INTO profesores (Nombre,identificacion,Cargo) VALUES (?,?,?)";
             try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombres());
            ps.setString(2, pro.getIdentificacion());
            ps.setString(3, pro.getCargo());
            ps.execute();
            return true;
        } catch (SQLException e) {
                 System.out.println("Registrar: " + e);
                 return false;
        }finally{
                 try {
                     con.close();
                 } catch (Exception e) {
                     System.out.println("Registrar: " + e);
                 }
             }
    }
  
  
}
