/** 
 * @author Natalia García
 * 
Ejercicio #1:
    Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
    Si son iguales indicarlo también.
    Ve cambiando los valores para comprobar que funciona.
*/
public class Eje1 {
    public static void main(String[] args) {
        //Declarar varibles
        int numA = 2;
        int numB = 5;
        //Se enuncian las variables
        System.out.println("El valor númerico A es: " + numA);
        System.out.println("El valor númerico B es: "+ numB);
        //Comprueba
        if (numA==numB){
            System.out.println("A y B son iguales");
        }
        else if (numA<numB){
            System.out.println("B es mayor que A");
        }
        else {
            System.out.println("A es mayor que B");
        }
        
    }
}