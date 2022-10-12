package Actividad5.java.Actividad8;
/*  Actividad 9    Computación en Java
*   Carlos Jared Nuñez Viera  #2886129
*/
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    static Scanner leer = new Scanner(System.in);
    Random rand = new Random();
    static int opcion;

    public static void main (String[] args) throws IOException{
        showMenu();
    }

    public static void showMenu (){
        System.out.println("Bienvenido a Poker!\nSelecciona una opción:");
        System.out.println("1 Mezclar deck\n2 Sacar una carta\n3 Carta al azar\n4 Generar una mano de 5 cartas\n0 Salir\n");
        opcion = leer.nextInt();
        switch (opcion){
            case 1:{
                shuffle();
                break;
            }
            case 2:{
                head();
                break;
            }
            case 3:{
                pick();
                break;
            }
            case 4:{
                hand();
                break;
            }
            case 0:{
                break;
            }
            default:
                System.out.println("Opción no valida. Intenta de nuevo");
                opcion = leer.nextInt();
                switch (opcion){
                    case 1:{
                        shuffle();
                        break;
                    }
                    case 2:{
                        head();
                        break;
                    }
                    case 3:{
                        pick();
                        break;
                    }
                    case 4:{
                        hand();
                        break;
                    }
                    case 0:{
                        break;
                    }
                }
        } 
    }
    
    public static void shuffle (){
        System.out.println("Se mezcló el Deck");
    }

    public static void head (){
        System.out.println("Corazones, Rojo, 7");
        System.out.println("Quedan 51 cartas en el deck");
    }

    public static void pick (){
        System.out.println("Picas, Negro, Q");
        System.out.println("Quedan 50 cartas en el deck");
    }

    public static void hand (){
        System.out.println("Tréboles, Negro, 3");
        System.out.println("Corazones, Rojo, 6");
        System.out.println("Tréboles, Negro, K");
        System.out.println("Picas, Negro, 4");
        System.out.println("Diamantes, Rojo, 2");
        System.out.println("Quedan 45 cartas en el deck");
    }
}
