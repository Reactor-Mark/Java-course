public class Operadores {
    public static void main(String[] args){
        //condicionales
        int edad = 18;
        String movieClass = "R18";

        boolean isRestricted = movieClass.contains("R");

        if (isRestricted && edad < 18) {
            System.out.println("No puedes ver la pelicula");
        } else {
            System.out.println("Puedes ver la pelicula");
        }

    }
}
