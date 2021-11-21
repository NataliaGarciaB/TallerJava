import java.util.Scanner;

/**
* @author Natalia García
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        //Se solicitan el area del circulo por teclado
        System.out.println("Ingrese el radio del círculo: ");
        double radio = newScan.nextDouble();
        //Se calcula el area del circulo
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("El area del círculo es: "+area);
        
        
    }
}