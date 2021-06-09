import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    double yardas;
    double mts;
    double pies;
    double pulgadas;
    double cm;
    System.out.println("Ingrese el numero de cm");
    cm=scanner.nextDouble();
    yardas=cm/91.44;
    mts=cm/100;
    pies=cm/30.48;
    pulgadas=cm/2.54;
    System.out.println(cm+" cm en yardas es "+yardas);
    System.out.println(cm+" cm en mts es "+mts);
    System.out.println(cm+" cm en pies es "+pies);
    System.out.println(cm+" cm en pulgas es "+pulgadas);
    
}
}