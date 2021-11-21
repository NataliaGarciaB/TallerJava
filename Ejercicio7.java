import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingrese el número: ");
            num = newScan.nextInt();
        }
        while(num<0);
        System.out.print("El número "+ num +" es mayor que 0, gracias por participar");
    }
}
