import java.util.Scanner;
/**
* @author Natalia García
*/
public class Ejercicio4 {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        double iva = 0.21;
        System.out.print("Ingrese el precio del producto: ");
        double precio = newScan.nextDouble();
        double precioProduct = precio+ (precio*iva);
        System.out.print("El precio del producto con el IVA es: "+precioProduct);
    }
}
