import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int num1, num2, num3;
    System.out.println("Ingrese primer numero");
    num1=scanner.nextInt();
    System.out.println("Ingrese segundo numero");
    num2=scanner.nextInt();
    System.out.println("Ingrese tercer numero");
    num3=scanner.nextInt();
    if (num1>num2){
        if (num1>num3){
            System.out.println("El mayor es "+num1);
        }else{
        System.out.println("El mayor es "+num3);
        }
    }else if (num2>num3){
        System.out.println("El mayor es "+num2);
    }else{
        System.out.println("El numero mayor es "+num3);
    }
}
}