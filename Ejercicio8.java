import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int numA;
    int numB;
    int numC;
    int promedio;
    System.out.println("Ingrese primer numero");
    numA=scanner.nextInt();
    System.out.println("Ingrese segundo numero");
    numB=scanner.nextInt();
    System.out.println("Ingrese tercer numero");
    numC=scanner.nextInt();
    promedio=(numA+numB+numC)/3;
    System.out.println("El promedio de los 3 numero es: "+promedio);
}
}