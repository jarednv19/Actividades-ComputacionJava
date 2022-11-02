package Actividad5.java;
/*  Actividad 11     Computación en Java
*   Carlos Jared Nuñez Viera  #2886129
*/
import java.io.IOException;
import java.util.Scanner;

public class Actividad11 implements Shape{
    
    public static void main (String[] args) throws IOException{
        int calculo, fgra;
        double base, alt, resultado;
        Scanner leer = new Scanner(System.in);

        System.out.println("\tBIENVENIDO\nSelecciona una opción:");
        System.out.println("Propiedad a calcular\n1) Área\t2) Perímetro");
        calculo = leer.nextInt();
        System.out.println("Figura\n1) Círculo\t2) Triángulo\t3) Cuadrado");
        fgra = leer.nextInt();
        System.out.println("Ingresa el valor de la base/radio:");
        base = leer.nextDouble();
        System.out.println("Ingresa el valor de la altura:");
        alt = leer.nextDouble();

        if (calculo == 1){
            if (fgra == 1){
                resultado = (3.1416 * (base*base));
                System.out.println("El área de un círculo con radio de " + base + " es de " + resultado);
            }
            else if (fgra == 2){
                resultado = (base*alt)/2;
                System.out.println("El área de un triángulo con base de " + base + " y altura de " + alt + " es de " + resultado);
            }
            else if (fgra == 3){
                resultado = base*alt;
                System.out.println("El área de un cuadrado con base de " + base + " y altura de " + alt + " es de " + resultado);
            }
        }
        else if (calculo == 2){
            if (fgra == 1){
                resultado = (3.1416 * (base*2));
                System.out.println("El perímetro de un círculo con radio de " + base + " es de " + resultado);
            }
            else if (fgra == 2){
                resultado = (base*3);
                System.out.println("El perímetro de un triángulo con base de " + base + " y altura de " + alt + " es de " + resultado);
            }
            else if (fgra == 3){
                resultado = (base*4);
                System.out.println("El perímetro de un cuadrado con base de " + base + " y altura de " + alt + " es de " + resultado);
            }
        }
     }    
}