import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int num1;
    int num2;
    int suma;
    System.out.println("Ingrese primer numero");
    num1=scanner.nextInt();
    System.out.println("Ingrese segundo numero");
    num2=scanner.nextInt();
    suma=num1+num2;
    System.out.println("La suma de los numeros es "+ suma);
    
}
}