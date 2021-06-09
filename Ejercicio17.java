import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int lado1, lado2, lado3;
    System.out.println("Ingrese primer lado del traiangulo");
    lado1=scanner.nextInt();
    System.out.println("Ingrese segundo lado del triangulo");
    lado2=scanner.nextInt();
    System.out.println("Ingrese tercer lado del triangulo");
    lado3=scanner.nextInt();
    if (lado1==lado2 & lado2==lado3){
        System.out.println("Es un triangulo Equilatero");
    }else if (lado1!=lado2 & lado2!=lado3){
        System.out.println("Es un triangulo Escaleno");
    }else{
        System.out.println("Es un triangulo Isosceles");
    }
    
}
}