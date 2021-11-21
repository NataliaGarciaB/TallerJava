import java.util.Scanner;

/**
* @author Natalia García
*/

//Ejercicio #2:
//Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        //Se solicitan los dos números
        System.out.println("Ingrese el número A");
        int numA = newScan.nextInt();
        System.out.println("Ingrese el número B");
        int numB = newScan.nextInt();
        //Comprobación:
        if (numA==numB){
            System.out.println("A y B son iguales");
        }
        else if (numA<numB){
            System.out.println("A es menor que B");
        }
        else {
            System.out.println("A es mayor que B");
        }
        
    }
}
