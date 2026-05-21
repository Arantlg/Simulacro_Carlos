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

        System.out.println("----------Promedio---------");
        double promedio=promedio(temperaturas);
        System.out.println("El promedio es de temperaturas de esta semana es "+promedio);
        
        System.out.println("----------Mayor y menor---------");
        double mayor=tempMayor(temperaturas);
        System.out.println("La mayor temperatura registrada fue de "+ mayor);

        double menor=tempMenor(temperaturas);
        System.out.println("La menor temperatura registrada fue de "+ menor);

        System.out.println("----------Dias calurosos y frios---------");
        int calor=diaCaluroso(temperaturas);
        System.out.println("En la semana hubieron "+ calor+" dias calurosos");
        int frio=diasFrios(temperaturas);
        System.out.println("En la semana hubieron "+ frio+" dias frios");

        sc.close();

    }

    // Punto 1- Mostrar todas las temperaturas registradas
    public static void MostrarTemperaturas(double[] temperaturas){
        System.out.println("----------La temperaturas---------");
        for(int i=0;i<temperaturas.length;i++){
        System.out.println("Dia "+(i+1)+": La temperatura fue de "+temperaturas[i]+"°C");
        }
    }

    // Punto 2- Calcular el promedio de temperatura
    public static double promedio(double[] temperaturas){
        double prom=0;
        for (int i = 0; i < temperaturas.length; i++) {
            prom += temperaturas[i];
        }
        prom /= temperaturas.length;
        return prom;
    }

    // Punto 3- Mostrar la temperatura más alta
    public static double tempMayor(double[] temperaturas){
        double mayor=0;
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]>mayor){
                mayor=temperaturas[i];
            }
        }
        return mayor;
    }

    // Punto 4- Mostrar la temperatura más baja
    public static double tempMenor(double[] temperaturas){
        double menor=50;
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]<menor){
                menor=temperaturas[i];
            }
        }
        return menor;
    }

    // Punto 5- Contar cuántos días tuvieron temperatura mayor o igual a 30 grados 
    public static int diaCaluroso(double[] temperaturas){
        int diascaluosos=0;
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]>=30){
               diascaluosos++;
            }
        }
        return diascaluosos;
    }

    // Punto 6- Contar cuántos días tuvieron temperatura menor a 27 grados
    public static int diasFrios(double[] temperaturas){
        int diasfrios=0;
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]<=27){
               diasfrios++;
            }
        }
        return diasfrios;
    }


}

