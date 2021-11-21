import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Ingrese una frase aqui: ");
        String fraseUsuario = newScan.nextLine();
        System.out.print("La frase tiene "+ fraseUsuario.length()+" caracteres");
        
        int vocales = 0;
        for (int i=0;i<fraseUsuario.length();i++) {
            if (fraseUsuario.charAt(i)=='a' || fraseUsuario.charAt(i)=='e' || fraseUsuario.charAt(i)=='e' || fraseUsuario.charAt(i)=='i' || fraseUsuario.charAt(i)=='o' || fraseUsuario.charAt(i)=='u')
            {
                vocales++; // va sumar cada vez que encuentre una vocal
            }
        }
        System.out.print(" y de ellos "+vocales+" son vocales");
    }
}
