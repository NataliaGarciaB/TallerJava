import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


    //Realizar un algoritmo que permita consulta la fecha y 
    //hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

public class Ejercicio13 {
    public static void main(String[] args) {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:MM:SS");
        System.out.println("Según el formato-->AAAA/MM/DD HH:MM:SS actualmente seria: " + formato.format(LocalDateTime.now()));
        
    }
    
}
