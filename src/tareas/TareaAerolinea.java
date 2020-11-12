package tareas;
import java.util.Scanner;

/**
 *
 * @author Kenneth Cedeno
 */
public class TareaAerolinea {

    static int queso;
    static Scanner yuca = new Scanner(System.in);
    //var para el numero del tiquete1
    static int numTiquete1;
    //var para el numero del tiquete2
    static int numTiquete2;
    //var para el nombre del cliente1
    static String nombreCompleto1;
    static String nombre1 = "n";
    static String apellido1 = "n";
    //var para el nombre del cliente2
    static String nombreCompleto2;
    static String nombre2 = "n";
    static String apellido2 = "n";
    //var para vuelos y sus estados
    static int numVuelo1 = 1678;
    static int numVuelo2 = 9289;
    static String atrasoVuelo1 = "A tiempo";
    static String atrasoVuelo2 = "Atrasado";
    
    
    public static void vuelo1() {
        if (numTiquete1 <= 1000) {
            System.out.println("Su numero de vuelo es: "+numVuelo1);
            System.out.println("El estado de su vuelo es: " +atrasoVuelo1);
        } else {
            System.out.println("Su numero de vuelo es: "+numVuelo2);
            System.out.println("El estado de su vuelo es: " +atrasoVuelo2);
            System.out.println("Sentimos los inconvenientes, usted recibira un 25% de descuento en su proxima compra con nosotros.");
        }
        
    }
    
    public static void vuelo2() {
        if (numTiquete2 <= 1000) {
            System.out.println("Su numero de vuelo es: "+numVuelo1);
            System.out.println("El estado de su vuelo es: " +atrasoVuelo1);
        } else {
            System.out.println("Su numero de vuelo es: "+numVuelo2);
            System.out.println("El estado de su vuelo es: " +atrasoVuelo2);
            System.out.println("Sentimos los inconvenientes, usted recibira un 25% de descuento en su proxima compra con nosotros.");
        }
        
    }
    
    
    public static String cliente1() {
       
        // pedir el nombre al cliente
        System.out.println("Favor insertar su primer nombre: ");
        nombre1 = yuca.next();
        System.out.println("Favor insertar su apellido: ");
        apellido1 = yuca.next();
        
        nombreCompleto1 = nombre1+" "+apellido1;
        System.out.println(nombreCompleto1);
        return nombreCompleto1;
    }
    
    public static String cliente2() {
       
        // pedir el nombre al cliente
        System.out.println("Favor insertar su primer nombre: ");
        nombre2 = yuca.next();
        System.out.println("Favor insertar su apellido: ");
        apellido2 = yuca.next();
        
        nombreCompleto2 = nombre2+" "+apellido2;
        System.out.println(nombreCompleto2);
        return nombreCompleto2;
    }
    public static void tiquete1() {
       
        System.out.println("Favor inserte el numero en su tiquete de vuelo: ");
        numTiquete1 = yuca.nextInt();
        
    }
    public static void tiquete2() {
     
        
        System.out.println("Favor inserte el numero en su tiquete de vuelo: ");
        numTiquete2 = yuca.nextInt();

    }
    public static void main(String[] args) {
        
        System.out.println("Favor inserte un 1 en caso de ser una persona y 2 en caso de 2 personas: ");
        queso = yuca.nextInt();
        if (queso ==1) {
            cliente1();
            tiquete1();
        } else if (queso == 2) {
            cliente1();
            tiquete1();
            vuelo1();
            cliente2();
            tiquete2();
            vuelo2();
        }
        
        
        
        
        
    }
    
}
