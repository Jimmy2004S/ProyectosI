
package config;

public class Login {
    
 
    private String nombre;
    private static String identificacion;

    public Login(){
        
    }
    
    public Login( String nombre, String identificacion) {
   
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
    
}
