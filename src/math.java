import java.text.NumberFormat;
import java.util.Locale;

public class math {
    public static void main(String[] args){
        //Math class
        int a = 2 + 2;
        int b = 5 - 3;
        int c = 4 * 3;
        float d = 10f / 3; //float division
        int e = 10 % 3; //modulo
        //System.out.println(e);
        //System.out.println(d);

        int x = 5;
        x++; //incremento
        //System.out.println(x);
        x--; //decremento
        //System.out.println(x);
        //System.out.println(++x); //pre-incremento
        //System.out.println(--x); //pre-decremento
        x += 5; //x = x + 5

        //conversion de tipos

        byte aa = 1;
        int bb =15;
        int cc= aa + bb; //automatic conversion
        //System.out.println(cc);

        //Conversion explicita
        int xx = 15;
        double yy = 15.015;
       // int zz = (int) (xx + yy); //Your force tha data type that you what in the output.
        int zz = xx + (int) yy;
        //System.out.println(zz);

        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j + k);
        /*
         * In this case, the string "1.1" is concatenated with the integer 5, resulting in the string "1.15".
         * You can do the same with other data types, like Integer.parseInt() for integers or Float.parseFloat() for floats.
         */
        //System.out.println(l);

        //Class math
        /*
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(1.01));// The next integer greater than or equal to the argument
        System.out.println(Math.floor(1.99));// The largest integer less than or equal to the argument
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.pow(2, 3)); //2^3
        System.out.println(Math.sqrt(16)); //square root
        System.out.println(Math.round(15.5)); //round to nearest integer
        System.out.println((int)(Math.random() * 100)); //random number between 0.0 and 1.0
        */

        //Formatting numbers
        Locale locale = Locale.forLanguageTag("es-MX");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(1099.90);
        System.out.println(result);

        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.1) );


    }
}
