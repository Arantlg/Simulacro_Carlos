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

        MostrarTemperaturas(temperaturas);

        double promedio=promedio(temperaturas);
        System.out.println("El promedio es de temperaturas de esta semana es "+promedio);
        
        double mayor=tempMayor(temperaturas);
        System.out.println("La mayor temperatura registrada fue de "+ mayor);

        double menor=tempMenor(temperaturas);
        System.out.println("La menor temperatura registrada fue de "+ menor);

        sc.close();

    }

    public static void MostrarTemperaturas(double[] temperaturas){
        System.out.println("----------La temperaturas---------");

        for(int i=0;i<temperaturas.length;i++){
        System.out.println("Dia "+(i+1)+": La temperatura fue de "+temperaturas[i]+"°C");
        }
    }

    public static double promedio(double[] temperaturas){
        double prom=0;
        for (int i = 0; i < temperaturas.length; i++) {
            prom += temperaturas[i];
        }
        prom /= temperaturas.length;
        return prom;
    }

    public static double tempMayor(double[] temperaturas){
        double mayor=0;
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]>mayor){
                mayor=temperaturas[1];
            }
        }
        return mayor;
    }

    public static double tempMenor(double[] temperaturas){
        double menor=0;
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]<menor){
                menor=temperaturas[1];
            }
        }
        return menor;
    }


}

