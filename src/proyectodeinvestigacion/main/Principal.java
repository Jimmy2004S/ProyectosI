
package proyectodeinvestigacion.main;


import VentanasProAula.VentanaInicio;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class Principal {
    
   public static void main(String[] ar) {
        
       try {

           UIManager.setLookAndFeel(new AeroLookAndFeel());
           VentanaInicio b;
           b = new VentanaInicio();
           b.setLocationRelativeTo(null);
           b.setVisible(true);
       } catch (UnsupportedLookAndFeelException ex) {
           Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
       }

        
      
   }
    
}
