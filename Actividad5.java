package Actividad5.java;
/*  Actividad 5     Computación en Java
*   Carlos Jared Nuñez Viera  #2886129
*/
import java.io.IOException;
import java.util.Scanner;;

public class Actividad5 {
    /**
     * @param args
     * @throws IOException
     */
    public static void main (String[] args) throws IOException{
        double num1, num2, rsuma, rresta, rmulti, rdiv, rmdlo;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el valor de X: ");
        num1 = leer.nextDouble();
        System.out.print("Ingresa el valor de Y: ");
        num2 = leer.nextDouble();

        System.out.print("X = " + num1);
        System.out.print("\nY = " + num2);
        rsuma = Suma(num1, num2);
        System.out.print("\nSuma: " + rsuma);
        rresta = Resta(num1, num2);
        System.out.print("\nResta: " + rresta);
        rmulti = Multiplicacion(num1, num2);
        System.out.print("\nMultiplicación: " + rmulti);
        rdiv = Division(num1, num2);
        System.out.print("\nDivisión: " + rdiv);
        rmdlo = Modulo(num1, num2);
        System.out.print("\nMódulo: " + rmdlo);
    }

    public static double Suma(double num1, double num2)
    {
        double rsuma = 0;
        rsuma = num1 + num2;
        return rsuma;
    }

    public static double Resta(double num1, double num2)
    {
        double rresta = 0;
        rresta = num1 - num2;
        return rresta;
    }

    public static double Multiplicacion(double num1, double num2)
    {
        double rmulti = 0;
        rmulti = num1 * num2;
        return rmulti;
    }

    public static double Division(double num1, double num2)
    {
        double rdiv = 0;
        rdiv = num1 / num2;
        return rdiv;
    }

    public static double Modulo(double num1, double num2)
    {
        double rmdlo = 0;
        rmdlo = num1 % num2;
        return rmdlo;
    }
}