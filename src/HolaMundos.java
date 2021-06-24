import java.util.Scanner;

public class HolaMundos {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       int c = 0, sumatoria = 0;

        System.out.println("Ingrese un numero");
        int nro1 = teclado.nextInt();
        System.out.println("Ingrese un 2do numero");
        int nro2 = teclado.nextInt();
        System.out.println("Ingrese un 3er numero");
        int nro3 = teclado.nextInt();
        System.out.println("Ingrese un 4to numero");
        int nro4 = teclado.nextInt();
        System.out.println("Ingrese un 5to numero");
        int nro5 = teclado.nextInt();

        sumatoria = nro1 + nro2 + nro3 + nro4 + nro5;
        System.out.println("La sumatoria es "+ sumatoria);

    }
}
