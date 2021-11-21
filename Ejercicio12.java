import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra aqui: ");
        String palabra1 = newScan.nextLine();
        System.out.println("Ingrese la secunda palabra aqui: ");
        String palabra2 = newScan.nextLine();
        if (palabra1.equals(palabra2)) {
            System.out.println("La palabra "+palabra1+" y "+palabra2+ " son iguales.");
        }
        else {
            System.out.println("La palabra "+palabra1+" y "+palabra2+ " son diferentes.");
        }
    }
}
