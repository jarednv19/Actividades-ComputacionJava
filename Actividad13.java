package Actividad5.java;
/*  Actividad 13     Computación en Java
*   Carlos Jared Nuñez Viera  #2886129
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

interface AnonClass{
    public void anonMethod();
}

public class Actividad13 {
    public static void main (String[] args) throws IOException{
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Argentina");
        cadenas.add("Brasil");
        cadenas.add("Francia");
        cadenas.add("Uruguay");
        cadenas.add("Inglaterra");
        cadenas.add("Alemania");
        cadenas.add("Holanda");
        cadenas.add("Mexico");
        cadenas.add("Serbia");
        cadenas.add("España");
        
        //Clase anónima Longitud
        System.out.println("\n\tCadena de texto ordenada por LONGITUD utilizando una CLASE ANÓNIMA");
        cadenas.sort(Comparator.comparingInt(String::length));
        System.out.println(cadenas);
        System.out.println("---------------------------------------------------------------------------------------------");

        //Expresión Lambda Longitud
        System.out.println("\n\tCadena de texto ordenada por LONGITUD utilizando una EXPRESIÓN LAMBDA");
        cadenas.sort((p1, p2) -> p1.length() - p2.length());
        System.out.println(cadenas);
        System.out.println("\n---------------------------------------------------------------------------------------------");

        //Método de referencia Longitud
        System.out.println("\n\tCadena de texto ordenada por LONGITUD utilizando un MÉTODO DE REFERENCIA");
        cadenas.sort(Comparator.comparingInt(String::length));
        System.out.println(cadenas);
        System.out.println("\n---------------------------------------------------------------------------------------------");

        //Clase anónima Alfabético
        System.out.println("\n\tCadena de texto ordenada ALFABÉTICAMENTE utilizando una CLASE ANÓNIMA");
        Collections.sort(cadenas);
        System.out.println(cadenas);
        System.out.println("\n---------------------------------------------------------------------------------------------");

        //Expresión Lambda Alfabético
        System.out.println("\n\tCadena de texto ordenada ALFABÉTICAMENTE utilizando una EXPRESIÓN LAMBDA");
        cadenas.sort((p1, p2) -> p1.compareTo(p2));
        System.out.println(cadenas);
        System.out.println("\n---------------------------------------------------------------------------------------------");

        //Método de referencia Alfabético
        System.out.println("\n\tCadena de texto ordenada ALFABÉTICAMENTE utilizando un MÉTODO DE REFERENCIA");
        Collections.sort(cadenas);
        System.out.println(cadenas);
        System.out.println("\n---------------------------------------------------------------------------------------------");
    }
}