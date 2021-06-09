import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int num;
    int cuadrado;
    int cubo;
    System.out.println("Ingrese un numero");
    num=scanner.nextInt();
    cuadrado=num*num;
    cubo=num*num*num;
    System.out.println("El cuadrado del numero es "+cuadrado);
    System.out.println("El cubo del numero es "+cubo);
}
}
