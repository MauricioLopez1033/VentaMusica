
/**
 * Write a description of class Estructurado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.Scanner;

public class ConsumoDeDrogas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String edad;
        String nombre;
        int afectacion;
        int drogadiccion;
        int cont = 0;
        int cont1 = 0;

        System.out.println("Indique su nombre");
        nombre = scanner.nextLine();
        System.out.println("Consume Drogas S = si o N = no?");
        afectacion = scanner.nextInt();
        System.out.println("Indique consumo diario de drogas en una escala del 1 al 10");
        drogadiccion = scanner.nextInt();

        if (drogadiccion < 6) {
            System.out.println("Su estado de salud podría no estar tan en riesgo");
            if (afectacion == 2) {
                System.out.println("Su estado de salud no es el óptimo pero puede mejorar");
                System.out.println("¿Es mayor de edad?");
                edad = scanner.next();
                if (edad.equals("si")) {
                    cont++;
                } else {
                    cont1++;
                }
            }
        } else {
            System.out.println("El consumo de drogas debería disminuir");
            if (afectacion == 1) {
                System.out.println("Su estado de adicción es altísimo");
                System.out.println("¿Es de Bogotá?");
                edad = scanner.next();
                if (edad.equals("si")) {
                    cont++;
                } else {
                    cont1++;
                }
            }
        }

        if (cont > cont1) {
            System.out.println("La edad adulta es la más adicta");
        } else {
            System.out.println("Alrededor de Bogotá están más afectados");
        }
    }
}

