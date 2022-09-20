/*
 * @author NeuenMartinez
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir 
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y 
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además 
definir los métodos getters y setters correspondientes.
 */
package POOej_Ex01;

import Entidades_Ex01.Cancion;
import Servicios_Ex01.CancionService;

public class POOej_Ex01 {

    public static void main(String[] args) {

        CancionService cs = new CancionService();
        Cancion c1 = cs.crearCancion();
        System.out.println(c1);

    }

}
