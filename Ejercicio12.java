import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    double gradosC;
    double gradosF;
    System.out.println("Ingrese el numero de grados Celcius");
    gradosC=scanner.nextDouble();
    gradosF=(gradosC*(9/5))+32;
    System.out.println("El numero de grados Farenheit es "+gradosF);
}
}