import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Ingrese una frase aqui: ");
        String fraseUsuario = newScan.nextLine();
        // Quitaremos los espacios vacios
        String newfrase2 = fraseUsuario.replace(" ","");
        System.out.println(newfrase2);
    }
}
