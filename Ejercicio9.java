import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("La frase original es: La sonrisa sera la mejor arma contra la tristeza ");
        System.out.println("Complemente a continuación por teclado la frase original:");
        String fraseUsuario = newScan.nextLine();
        System.out.println("Reemplazando las letras 'a' por 'e' quedaria así: ");
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String newfrase1 = fraseUsuario.replace("a","e");
        String newfrase2 = frase.replace("a","e");
        System.out.println(newfrase2+" "+newfrase1);
    }
}
