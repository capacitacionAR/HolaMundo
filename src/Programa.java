import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        int a;
        int b;

        //Scanner teclado = new Scanner(System.in);
        //System.out.println("Ingrese dos numeros enteros");


        //Scanner teclado = new Scanner(new File( pathname: "numeros1.txt"));
        Scanner teclado = new Scanner(new File( "numeros1.txt"));
        System.out.println("Leyendo datos desde el archivo");
        a = teclado.nextInt();
        b = teclado.nextInt();

        int suma= a + b;

        System.out.println("La suma es: "+suma);
        System.out.println("El programa corrio exitosamente");


    }
}
