package Servicios_Ex01;

import Entidades_Ex01.Cancion;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class CancionService {

    Scanner leer = new Scanner(System.in);

    public Cancion crearCancion() {
        System.out.println("Ingresar el nombre de la cancion:");
        String titulo = leer.nextLine();
        System.out.println("Ingresar el nombre del autor:");
        String autor = leer.nextLine();
        return new Cancion(titulo, autor);

    }
    
}
