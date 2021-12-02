
package modelo;

public class Asiento {
    private int numero;
    private char fila;
    private String estado; 

    public Asiento(int numero, char fila) {
        this.numero = numero;
        this.fila = fila;
        this.estado = "Disponible";
    }

    public int getNumero() {
        return numero;
    }

    public char getFila() {
        return fila;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return   numero + "\t" + fila + "\t" + estado ;
    }
    
    public boolean resevar(){
        boolean result = false;
        this.estado = "Reservado";
        return result;
    }
    
    public boolean cancelar(){
        boolean result = false;
        this.estado = "Disponible";
        return result;
    }    
    
    public boolean vender(){
        boolean result = false;
        this.estado = "Vendido";
        return result;
    }
   
}
