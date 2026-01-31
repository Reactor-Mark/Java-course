public class Operadores {
    public static void main(String[] args){
        //condicionales
        int edad = 18;
        String movieClass = "R18";
        boolean isRestricted = movieClass.contains("R");

        if (isRestricted && edad < 18) {
            System.out.println("No puedes ver la pelicula");
        } else if (!isRestricted || edad >= 18) {
            System.out.println("Puedes ver la pelicula");
        }

        //Operador ternario
        int edad 17;
        String resultado = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(resultado);
    }
}
