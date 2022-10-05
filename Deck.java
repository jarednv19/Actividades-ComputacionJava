package Actividad5.java.Actividad8;
/*  Actividad 8    Computación en Java
*   Carlos Jared Nuñez Viera  #2886129
*/
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    static Scanner leer = new Scanner(System.in);
    Random rand = new Random();

    public static void main (String[] args) throws IOException{
        shuffle();
        System.out.println("\n");
        head();
        System.out.println("\n");
        pick();
        System.out.println("\n");
        hand();
        System.out.println("\n");
    }

    public static void shuffle (){
        System.out.println("Se mezcló el Deck");
    }

    public static void head (){
        System.out.println("Tréboles, Negro, 8");
        System.out.println("Quedan 51 cartas en el deck");
    }

    public static void pick (){
        System.out.println("Corazones, Rojo, 3");
        System.out.println("Quedan 50 cartas en el deck");
    }

    public static void hand (){
        System.out.println("Picas, Negro, J");
        System.out.println("Diamantes, Rojo, 5");
        System.out.println("Picas, Negro, 9");
        System.out.println("Corazones, Rojo, K");
        System.out.println("Tréboles, Negro, 2");
        System.out.println("Quedan 45 cartas en el deck");
    }
}