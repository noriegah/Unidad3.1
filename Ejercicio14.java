import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int num1;
    int num2;
    System.out.println("Ingrese primer numero");
    num1=scanner.nextInt();
    System.out.println("Ingrese segundo numero");
    num2=scanner.nextInt();
    if (num1%num2 ==0) {
        System.out.println("Si es divisible");
    }else{
        System.out.println("No es divisible");
    }
}
}