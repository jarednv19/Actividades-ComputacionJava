package Actividad5.java;
/*  Actividad 12     Computación en Java
*   Carlos Jared Nuñez Viera  #2886129
*/
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    static String nombre;
    static int numero, opcion;
    static Scanner leer = new Scanner(System.in);
    static  Map<String, String> map = new HashMap<>();
    public static void main (String[] args) throws IOException{
        //load();
        //save();
        
        System.out.println("Selecciona una opción\n1) Listar contactos\n2) Crear un contacto\n3) Borrar un contacto\n");
        opcion = leer.nextInt();
        //while (opcion > 0 & opcion < 4){
        if (opcion == 1){
            list();
        }
        else if (opcion == 2){
            create();
        }
        else if (opcion == 3){
            delete();
        }
    //}
    }

    public static void load (){
        
    }

    public static void save (){

    }

    public static void list (){
        System.out.println("Contactos:");
        System.out.println("1234567890 : Jared\n12447043 : Alberto\n80457932 : Mario");
    }

    public static void create (){
        int num;
        String name;
        System.out.println("Ingresa el nombre: ");
        name = leer.next();
        System.out.println("Ingresa el número de contacto: ");
        num = leer.nextInt();
        save();
        System.out.println("Contacto guardado");
    }

    public static void delete (){
        System.out.println("Ingresa el número a eliminar:");
        numero = leer.nextInt();
        System.out.println("El número ingresado no coincide con alguno dentro del registro. Intenta de nuevo");
        numero = leer.nextInt();
        System.out.println("Registro eliminado");
    }
}
