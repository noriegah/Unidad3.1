import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int numA;
    int numB;
    numA=(int) (Math.random()*50 +10);
    System.out.println("El numero aleatorio es "+numA);
    numB=(int) (numA-(numA*0.15));
    System.out.println("El numero aleatorio disminuido en un 15% es "+numB);
    
}
}