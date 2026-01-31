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
        int edad2 = 17;
        String resultado = (edad2 >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(resultado);

        //switch case
        String action = "agregar";
        switch (action) {
            case "agregar":
                System.out.println("Elemento agregado");
                break;
            case "eliminar":
                System.out.println("Elemento eliminado");
                break;
            case "actualizar":
                System.out.println("Elemento actualizado");
                break;
            default:
                System.out.println("Accion no reconocida");
                break;
        }

    }
}
