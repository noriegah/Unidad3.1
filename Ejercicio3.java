import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int num;
    int doble;
    int triple;
    System.out.println("Ingrese un numero");
    num=scanner.nextInt();
    doble=2*num;
    triple=3*num;
    System.out.println("El doble del numero es "+doble);
    System.out.println("El triple del numero es "+triple);
}
}