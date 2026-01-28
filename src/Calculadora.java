import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        System.out.println("Calculadora simple\n Ingresa dos numeros para ser sumados");
        System.out.println("Primer numero: ");
        Scanner scanner = new Scanner(System.in);
        double valor1 = scanner.nextDouble();
        System.out.println("Segundo numero: ");
        double valor2 = scanner.nextDouble();
        double result = valor1+ valor2;
        System.out.println("El resultado de la suma es: " + Math.floor(result * 1000) / 1000);
    }
}
