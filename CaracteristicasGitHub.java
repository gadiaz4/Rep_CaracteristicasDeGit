/*
 Implemente un algoritmo que le permita ingresar por teclado,
1 si desea saber que es Git y 2 si desea saber las caracteristicas de git
caso contrario muestre en pantalla no se reconoce esa opción.
 */
package caracteristicasgithub;
/**
 *
 * @author Gabriel Alexander Díaz Vera
 */
import java.util.Scanner;
public class CaracteristicasGitHub {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner objeto=new Scanner(System.in);
     System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
    System.out.println("\t\t\t\t\tGit\n");
    System.out.println("Que es Git:");
    System.out.println("Es un software de control de versiones (VCS)\n");
    System.out.println("Cuáles son las caracteristicas de Git: ");
    System.out.println("-El interfaz de Git es muy sencilla de usarla.");
    System.out.println("-No requiere de conexión a internet y se puede trabajar en cualquier momento.");
    System.out.println("-La visivilidad del proyecto puede ser publico o limitada a un grupo de trabajo.");
    System.out.println("-Se pueden realizar cambios en el proyecto, sin necesidad de que otro desarrolador del grupo se lo impida realizarlo.");
    System.out.println("-Cada desarrolador del proyecto tendra acceso a la misma informacion que el resto de grupo de trabajo. ");
    System.out.println("-Los desarroladores tienen una copia local del proyecto.");


    }

}
