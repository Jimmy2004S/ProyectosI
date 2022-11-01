
package config;

public class LoginBD {
    
    private int id;
    private String nombre;
    private String identificacion;

    public LoginBD(){
        
    }
    
    public LoginBD(int id, String nombre, String identificacion) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
