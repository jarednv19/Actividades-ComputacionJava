package Actividad5.java;
/*  Actividad 6     Computación en Java
*   Carlos Jared Nuñez Viera  #2886129
*/
import java.io.IOException;
import java.util.Scanner;

public class Actividad6 {
    static Scanner leer = new Scanner(System.in);
    static int lcalificaciones [] = new int [6];
    static double suma, avrg;
    static String CalificacionLetra, nombre;

     public static void main (String[] args) throws IOException{
        System.out.println("Ingresa el nombre del estudiante:");
        nombre = leer.nextLine();
        PromedioCalificaciones();
        LetraCalificacion();
        ImpresionDatos();
}

    public static void PromedioCalificaciones (){            //Método 1°
        for (int i = 1; i<lcalificaciones.length; i++){
            System.out.println("Calificación " + i + ": ");
            lcalificaciones[i] = leer.nextInt();
            suma += lcalificaciones[i];
        }
        avrg = suma / 5;
    }

    public static void LetraCalificacion (){                //Método 2°
        if (avrg <= 50){
            CalificacionLetra = ("F");
        }
        else if (avrg >= 51 & avrg <= 60){
            CalificacionLetra = ("E");
        }
        else if (avrg >= 61 & avrg <= 70){
            CalificacionLetra = ("D");
        }
        else if (avrg >= 71 & avrg <= 80){
            CalificacionLetra = ("C");
        }
        else if (avrg >= 81 & avrg <= 90){
            CalificacionLetra = ("B");
        }
        else {
            CalificacionLetra = ("A");
        }
    }

    public static void ImpresionDatos (){                 //Método 3°
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 1; i<lcalificaciones.length; i++){
            System.out.println("Calificación " + i + ": " + lcalificaciones[i]);
        }
        System.out.println("Promedio: " + avrg);
        System.out.println("Calificación: " + CalificacionLetra);
    }
}