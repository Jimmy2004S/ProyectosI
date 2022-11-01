
package co.edu.unicolombo.ingsistemas.pb.ejercicio1.proyectodeinvestigacion;


import VentanasProAula.VentanaInicio;
import com.jtattoo.plaf.AbstractLookAndFeel;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class Principal {
    
   public static void main(String[] ar) {
        VentanaInicio b ;
        b = new VentanaInicio();
        b.setLocationRelativeTo(null);
    
          try {
                UIManager.setLookAndFeel( new AcrylLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
     
        b.setVisible(true);
      
   }
    
}
