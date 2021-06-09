import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int num1;
    System.out.println("Ingrese un numero");
    num1=scanner.nextInt();
    if (num1==0) {
        System.out.println("Es un numero nulo");
    }else if (num1>0){
        System.out.println("Es un numero positivo");
    }else{
        System.out.println("Es un numero negativo");
    }
}
}