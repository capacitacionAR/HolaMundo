import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("personas.txt"));
        int c = 0;
        int cp = 0;
        int sumatoria = 0;
        int menor = 0, mayor = 0;

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            c++;
            if(c==1 || n < menor)
                menor = n;
            if(c==1 || n > mayor)
                mayor = n;

            sumatoria += n;

            if(n % 2 == 0)
                cp++;
        }
        float promedio = (float)sumatoria/c;
        System.out.println("sumatoria "+sumatoria);
        System.out.println("cantidad de casos "+c);
        System.out.println("cantidad de pares "+cp);
        System.out.println("el mayor es "+mayor);
        System.out.println("el menor es "+menor);
        System.out.println("el promedio "+promedio);
    }
}
