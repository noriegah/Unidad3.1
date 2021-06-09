import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    String palabra1;
    String palabra2;
    String palabraAux;
    int promedio;
    System.out.println("Ingrese primer palabra");
    palabra1=scanner.nextLine();
    System.out.println("Ingrese segunda palabra");
    palabra2=scanner.nextLine();
    palabraAux=palabra1;
    palabra1=palabra2;
    palabra2=palabraAux;
    System.out.println("Prmera palabra es "+palabra1);
    System.out.println("Segunda palabra es "+palabra2);
}
}