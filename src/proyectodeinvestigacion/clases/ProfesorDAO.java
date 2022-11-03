
package proyectodeinvestigacion.clases;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ProfesorDAO {
    
    Conexion cn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    boolean bandera = false;
    
    public boolean RegistrarCliente(Profesor pro) {
        String sql = "INSERT INTO profesores (Nombre,identificacion,Cargo) VALUES (?,?,?)";
        try {
            conn = cn.Conexion();
            String sql2 = "select * from profesores";
            st = conn.createStatement();
            rs = st.executeQuery(sql2);
                    
            
            String pl = pro.getNombres();
            String clave = pro.getIdentificacion();
            while (rs.next()) {
                        if (pl.equals(rs.getString("Nombre"))  || clave.equals(rs.getString("identificacion"))) {
                            bandera = true;
                            JOptionPane.showMessageDialog(null, "El usuario ya existe");
                            break;
                        }}
                        
            if(bandera == false ){
                 ps = conn.prepareStatement(sql);
                 ps.setString(1, pro.getNombres());
                 ps.setString(2, pro.getIdentificacion());
                 ps.setString(3, pro.getCargo());
                 ps.execute();
              JOptionPane.showMessageDialog(null, "Registrado ");
            }
           
                            return true;
            
        } catch (SQLException e) {
            System.out.println("Registrar: " + e);
            return false;
        }finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Registrar: " + e);
            }}
  
    }


}
