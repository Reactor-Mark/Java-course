public class Methods {
    public static void main(String[] args){
        miMetodo("Jorge", 36);
        miMetodo("Laura", 18);
        miMetodo("Ana", 19);
        System.out.println(suma(45, 19));
        miMetodo("Karla", suma(15, 6));
        System.out.println(suma(5, 10, 15));
        System.out.println(suma2(new int[]{1,2,3,4,5}) );
    }
    static void miMetodo(String nombre, int edad){
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
    static int suma(int a, int b){
        return a + b;
    }
    static int suma(int a, int b, int c){
        return a + b + c;
    }

    static int suma2(int[] numeros){
        int resultado = 0;
        for(int numero : numeros){
            resultado += numero;
        }
        return resultado;
    }
}
