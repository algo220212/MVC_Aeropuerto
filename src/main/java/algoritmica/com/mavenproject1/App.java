
package algoritmica.com.mavenproject1;

import java.util.Date;
import modelo.Aeropuerto;
import modelo.Ciudad;
import vista.frmCiudad;

public class App {
    public static void main(String[] args) {
       
/*        
        Sistema.paises.agegarPais("PE", "PERÚ");
        Sistema.paises.agegarPais("AR", "ARGENTINA");
        Sistema.paises.buscarPais("PE").agregarCiudad("L001","Lima");
        Sistema.paises.buscarPais("AR").agregarCiudad("A001","BUENOS AIRES");
        //Ciudad ciudad =  Sistema.paises.buscarPais("PE").buscarCiudad("L001");
        //Sistema.aeropuertos.agrgarAeropuerto("JORGE CHAVEZ", "Av. Elmer Foucett S/N", ciudad);

        //ciudad =  Sistema.paises.buscarPais("AR").buscarCiudad("A001");
        //Sistema.aeropuertos.agrgarAeropuerto("RIO DE LA PLATA", "Av. Buenos Aires S/N", ciudad);
        
        Aeropuerto salida = Sistema.aeropuertos.buscarAeropuerto("JORGE CHAVEZ");
        Aeropuerto llegada = Sistema.aeropuertos.buscarAeropuerto("RIO DE LA PLATA");
        //Sistema.vuelos.agregarVuelo("V0001", new Date(), salida, llegada, 200 );
        */
        Ciudad modelo;
        frmCiudad vista =  new frmCiudad();
        vista.setVisible(true);
         
    }
    
}
