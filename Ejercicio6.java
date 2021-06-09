import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    double numA;
    double numB;
    numA=Math.random()*200;
    System.out.println("El numero aleatorio es "+numA);
    numB=numA+(numA*0.30);
    System.out.println("El numero aleatorio aumentado en un 30% es "+numB);
    
}
}