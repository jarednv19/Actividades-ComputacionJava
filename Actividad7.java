package Actividad5.java;
/*  Actividad 7     Computación en Java
*   Carlos Jared Nuñez Viera  #2886129
*/
import java.io.IOException;
import java.util.Scanner;

public class Actividad7 {
    static Scanner leer = new Scanner(System.in);
    static int numeros [] = new int [30];
    static int num1 = 0, num2 = 1, suma;

    public static void main (String[] args) throws IOException{
       NPrimos();
       Fibonacci(); 
    }

    public static void NPrimos (){
        System.out.println("Números primos:");
        for(int i = 1; i < 115; i++){
			int contador = 0;
			for(int j = 1; j <= i; j++){
				if(i%j == 0){
					contador++;
				}
			}
			if(contador == 2){
				System.out.print(i + ", ");
			}
		}
    }

    public static void Fibonacci (){
        System.out.println("\n\nSucesión de Fibonacci:");
        for (int i = 1; i <= numeros.length; i++) {             
            System.out.print(suma + ", ");
            suma = num1 + num2;
            num1 = num2;
            num2 = suma; 
        }
    }
}