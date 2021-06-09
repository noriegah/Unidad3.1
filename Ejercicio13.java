import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    double altura;
    double radio;
    double volumen;
    double pi=3.1416;
    System.out.println("Ingrese el Valor del la altura del Cilindro");
    altura=scanner.nextDouble();
    System.out.println("Ingrese el Valor del radio del Cilindro");
    radio=scanner.nextDouble();
    volumen=pi*radio*radio*altura;
    System.out.println("El volumen del cilindro es "+volumen);
}
}