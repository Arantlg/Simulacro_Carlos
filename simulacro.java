import java.util.Scanner;

public class simulacro {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    double[] temperaturas =new double[7];
    
    System.out.println("----------Ingrese valores---------");

    for(int i=0;i<temperaturas.length;i++){
        System.out.println("Ingrese temperatura del dia "+(i+1));
        temperaturas[i]=sc.nextDouble();
    }

    System.out.println("----------La temperaturas---------");

    for(int i=0;i<temperaturas.length;i++){
        System.out.println("Dia "+(i+1)+": La temperatura fue de "+temperaturas[i]+"°C");
    }

    sc.close();

    }
}
