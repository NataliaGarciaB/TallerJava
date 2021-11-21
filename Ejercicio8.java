import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.print("Igrese el día de la semana en letras: ");
        String dia = newScan.next();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            System.out.println("Este es un día de la semana laboral: "+dia);
            break;
            case "sabado":
            case "domingo":
            System.out.println("Este es día no laboral: "+dia);
            break;
            default:
            System.out.println("Este no es un día de la semana valido: "+dia);
        }


    }
}
