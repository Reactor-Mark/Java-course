import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");

        int numero = scanner.nextInt();

        String result = (numero % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println(result);

        if (numero % 3 == 0 && numero % 4 == 0) {
            System.out.println("El numero es divisible entre 3 y 4");
        } else if (numero % 3 == 0) {
            System.out.println("El numero es divisible entre 3");
        } else if (numero % 4 == 0) {
            System.out.println("El numero es divisible entre 4");
        }
    }
}
