import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        String[] texto = {"hola", "mundo", "java"};
        for(int i = 0; i < texto.length; i++){
            System.out.println(texto[i]);
        }

        int i = 0;
        while(i < texto.length){
            System.out.println(texto[i]);
            i++;
        }

        //aplicacion de terminal
        /*
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("salir")){
            System.out.println("Escribe algo (escribe 'salir' para terminar): ");
            input = scanner.nextLine();
            System.out.println("Escribiste: " + input);
        }*/

        //do while
        int j = 2;
        do{
            System.out.println(j);
            j++;
        } while(j < 5);        //for each
        String[] personajes = {"Mario", "Luigi", "Peach", "Toad"};

        for (String personaje: personajes){
            System.out.println(personaje);
        }
        for(int p = 1; p<=5; p++){
            System.out.println("*".repeat(p));
        }
    }

}
