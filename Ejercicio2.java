import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    String pais;
    String capital;
    System.out.println("Ingrese el nombre de su país");
    pais=scanner.nextLine();
    System.out.println("Ingrese el nombre de la capital de su país");
    capital=scanner.nextLine();
    System.out.println("La capital de "+ pais +" es "+ capital);
}
}