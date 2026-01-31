import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Que quieres hacer?\n" +
                    "1. Calculadora\n" +
                    "2. Hackear la NASA\n" +
                    "3. Salir");
            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine();
            if (opcion.equals("1")) {
                System.out.println("Ingresa el primer numero: ");
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Ingresa el segundo numero: ");
                double num2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Elige la operacion (+, -, *, /): ");
                String operacion = scanner.nextLine();
                double resultado = 0;
                switch (operacion) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Error: Division por cero");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Operacion no valida");
                        continue;
                }
                System.out.println("El resultado es: " + resultado);
            } else if (opcion.equals("2")) {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Hackeando la NASA" + ".".repeat(i + 1));
                }
            } else if (opcion.equals("3")) {
                System.out.println("Saliendo del programa. Adios!");
                break;
            } else {
                System.out.println("Opcion no valida. Intenta de nuevo.");
            }


        }
    }
}
