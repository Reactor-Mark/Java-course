public class math {
    public static void main(String[] args){
        //Math class
        int a = 2 + 2;
        int b = 5 - 3;
        int c = 4 * 3;
        float d = 10f / 3; //float division
        int e = 10 % 3; //modulo
        System.out.println(e);
        System.out.println(d);

        int x = 5;
        x++; //incremento
        System.out.println(x);
        x--; //decremento
        System.out.println(x);
        System.out.println(++x); //pre-incremento
        System.out.println(--x); //pre-decremento
        x += 5; //x = x + 5

        //conversion de tipos

        byte aa = 1;
        int bb =15;
        int cc= aa + bb; //automatic conversion
        System.out.println(cc);

        //Conversion explicita
        int xx = 15;
        double yy = 15.015;
       // int zz = (int) (xx + yy); //Your force tha data type that you what in the output.
        int zz = xx + (int) yy;
        System.out.println(zz);

        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j + k);
        /**
         * In this case, the string "1.1" is concatenated with the integer 5, resulting in the string "1.15".
         * You can do the same with other data types, like Integer.parseInt() for integers or Float.parseFloat() for floats.
         */
        System.out.println(l);

    }
}
