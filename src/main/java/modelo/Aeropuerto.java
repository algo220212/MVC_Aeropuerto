
package modelo;

public class Aeropuerto {
   private String nombre;
   private String direccion;
   private Ciudad ciudad;

    public Aeropuerto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Aeropuerto(String nombre, String direccion, Ciudad ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
   
    public boolean asignarCiudad(Ciudad ciudad){
        boolean result = false;
        this.ciudad = ciudad;
        return  result;
    }
    
    public Ciudad getCiudad(){
        return this.ciudad;
    }

    @Override
    public String toString() {
        return  nombre + " \t " + direccion + " \t " + ciudad.getNombre();
    }
   
    
}
