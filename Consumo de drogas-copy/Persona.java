
/**
 * Write a description of class Consumodedrogas2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int afectacion;
    private int drogadiccion;

    public Persona(String nombre, int afectacion, int drogadiccion) {
        this.nombre = nombre;
        this.afectacion = afectacion;
        this.drogadiccion = drogadiccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAfectacion() {
        return afectacion;
    }

    public int getDrogadiccion() {
        return drogadiccion;
    }
}




