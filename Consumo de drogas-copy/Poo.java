
/**
 * Write a description of class Poo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int afectacion;
        int drogadiccion;

        System.out.println("Indique su nombre");
        nombre = scanner.nextLine();
        System.out.println("Consume Drogas S = si o N = no?");
        afectacion = scanner.nextInt();
        System.out.println("Indique consumo diario de drogas en una escala del 1 al 10");
        drogadiccion = scanner.nextInt();

        Persona persona = new Persona(nombre, afectacion, drogadiccion);
        evaluarConsumo(persona);
    }

    public static void evaluarConsumo(Persona persona) {
        if (persona.getDrogadiccion() < 6) {
            System.out.println("Su estado de salud podría no estar tan en riesgo");
            if (persona.getAfectacion() == 2) {
                System.out.println("Su estado de salud no es el óptimo pero puede mejorar");
                System.out.println("¿Es mayor de edad?");
                Scanner scanner = new Scanner(System.in);
                String edad = scanner.next();
                if (edad.equals("si")) {
                    System.out.println("La edad adulta es la más adicta");
                } else {
                    System.out.println("Alrededor de Bogotá están más afectados");
                }
            }
        } else {
            System.out.println("El consumo de drogas debería disminuir");
            if (persona.getAfectacion() == 1) {
                System.out.println("Su estado de adicción es altísimo");
                System.out.println("¿Es de Bogotá?");
                Scanner scanner = new Scanner(System.in);
                String edad = scanner.next();
                if (edad.equals("si")) {
                    System.out.println("La edad adulta es la más adicta");
                } else {
                    System.out.println("Alrededor de Bogotá están más afectados");
                }
            }
        }
    }
}
