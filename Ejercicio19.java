import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    double num;
    num=Math.random()*1000+1;
    System.out.println("El numero aleatorio es "+num);
    if (num%5==0 & 0<=num & num<=25){
        System.out.println("Correcto");
    }else{
        System.out.println("No cumple");
    }
}
}