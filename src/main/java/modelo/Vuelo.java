
package modelo;

import java.util.Date;

public class Vuelo {
    private String codigo;
    private Date fecha;
    private Aeropuerto salida;
    private Aeropuerto llegada;
    private Asiento[] asientos;
    private int indice;

    public Vuelo(String codigo, Date fecha, Aeropuerto salida, Aeropuerto llegada, int numAsientos) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.salida = salida;
        this.llegada = llegada;
        this.asientos =  new Asiento[numAsientos];
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public Aeropuerto getSalida() {
        return salida;
    }

    public Aeropuerto getLlegada() {
        return llegada;
    }
    
    public boolean venderAsiento(int numero, char fila ){
        boolean result= false;
        
        return result;
    }
    
    public boolean reservarAsiento(int numero, char fila ){
        boolean result= false;
        
        return result;
    }
    
    public boolean cancelarAsiento(int numero, char fila ){
        boolean result= false;
        
        return result;
    }    
    
    public Asiento[] asientosdisponibles(){
        Asiento result[] = new Asiento[this.asientos.length];
        
        return result;
    }
    
    
    
}
