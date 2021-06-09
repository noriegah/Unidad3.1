import java.util.*;
public class Ejercicio18 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        String numero= "";
        int numEntero;
        String num1,num2,num3,num4;
        int num1Entero=0;
        int num2Entero=0;
        int num3Entero=0;
        int num4Entero=0;
        int suma=0;


        System.out.println("Ingrese un número de 4 cifras:");
        numero=scanner.nextLine();

        numEntero=Integer.parseInt(numero);

        if(numEntero>=-9 && numEntero<=9){
            num4=(numero.substring(3,1));
            num4Entero=Integer.parseInt(num4);
            suma=num1Entero+num2Entero+num3Entero+num4Entero;
            System.out.println("d1="+num1Entero+",d2="+num2Entero+",d3="+num3Entero+",d4="+num4Entero+ "suma="+suma);
            
        }else if(numEntero>=-99 && numEntero<=99){
            num3=(numero.substring(2,1));
            num4=(numero.substring(3,1));
            num3Entero=Integer.parseInt(num3);
            num4Entero=Integer.parseInt(num4);
            suma=num1Entero+num2Entero+num3Entero+num4Entero;
            System.out.println("d1="+num1Entero+",d2="+num2Entero+",d3="+num3Entero+",d4="+num4Entero+ "suma="+suma);
        }else if(numEntero>=-999 && numEntero<=999){
            num2=(numero.substring(1,1));
            num3=(numero.substring(2,1));
            num4=(numero.substring(3,1));
            num2Entero=Integer.parseInt(num2);
            num3Entero=Integer.parseInt(num3);
            num4Entero=Integer.parseInt(num4);
            suma=num1Entero+num2Entero+num3Entero+num4Entero;
            System.out.println("d1="+num1Entero+",d2="+num2Entero+",d3="+num3Entero+",d4="+num4Entero+ "suma="+suma);
        }else if(numEntero>=-9999 && numEntero<=9999){
            num1=(numero.substring(0,1));
            num2=(numero.substring(1,1));
            num3=(numero.substring(2,1));
            num4=(numero.substring(3,1));
            num1Entero=Integer.parseInt(num1);
            num2Entero=Integer.parseInt(num2);
            num3Entero=Integer.parseInt(num3);
            num4Entero=Integer.parseInt(num4);
            suma=num1Entero+num2Entero+num3Entero+num4Entero;
            System.out.println("d1="+num1Entero+",d2="+num2Entero+",d3="+num3Entero+",d4="+num4Entero+ "suma="+suma);
        }

    }
}