package modelo;

public class Pais {
   private String codigo;
   private String nombre;
   private Ciudad[] ciudades; 
   private int indice;

    public Pais(String codigo, String nombre, int numCuidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudades = new Ciudad[numCuidades];
        this.indice = 0;
    }
   
    public Ciudad[] getCiudades(){
        return this.ciudades;
    }
    
    public boolean agregarCiudad( Ciudad ciudad ){
        boolean result = false;
        return false;
    }
    
    public boolean agregarCiudad( String codigo, String nombre ){
        boolean result = false;
        return false;
    }
   
    public boolean buscarCiudad( String nombre ){
        boolean result = false;
        return false;
    }
    
    public boolean eliminarCiudad( Ciudad ciudad ){
        boolean result = false;
        return false;
    }
    
    private boolean ordenarCiudad(  ){
        boolean result = false;
        return false;
    }

    @Override
    public String toString() {
        return "";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String[][] getDatos(){
        String datos [][] =  new String[3][this.ciudades.length] ;
        
        return datos;
    }

    
}
