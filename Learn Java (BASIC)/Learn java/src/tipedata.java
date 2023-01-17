public class tipedata {
    public static void main(String[] args) {
        // tipe data di java:

        // integer number
        /*
         * byte
         * short
         * long
         * int
         */

        // floating number
        /*
         * float
         * double
         */

        // literal number
        /*
         * decimal
         * hexa int = 0x + hexadecimal number
         * binary int = 0b + binary number
         */

        // tipe data conversion
        /*
         * 1. Widening Casting (otomatis0)
         * byte - short - int - long - float - double
         * 2. Narrowing Casting (manual)
         * double - float - long - int - char - short - byte
         */

        // integer (satuan)
        int i = 10;
        System.out.println("=======================================");
        System.out.println("INTEGER");
        System.out.println("nilai integer i = " + (i + 1));
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");
        System.out.println("=======================================");

        // byte (satuan)

        byte b = 10;
        System.out.println("BYTE");
        System.out.println("nilai byte b = " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " bit");
        System.out.println("=======================================");

        // short (satuan)

        short s = 10;
        System.out.println("SHORT");
        System.out.println("nilai short s = " + s);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        System.out.println("Besar short = " + Short.SIZE + " bit");
        System.out.println("=======================================");

        // long (satuan)

        long L = 100000L;
        System.out.println("LONG");
        System.out.println("nilai long l = " + L);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        System.out.println("Besar long = " + Long.SIZE + " bit");
        System.out.println("=======================================");

        // double (koma, bilangan real)

        double d = -10.5d;
        System.out.println("DOUBLE");
        System.out.println("nilai double d = " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        System.out.println("Besar double = " + Double.SIZE + " bit");
        System.out.println("=======================================");

        // float (koma, bilangan real)

        float f = -8.5f;
        System.out.println("FLOAT");
        System.out.println("nilai float f = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float = " + Float.SIZE + " bit");
        System.out.println("=======================================");

        // char (karakter) berdasarkan ASCII

        char c = 'c';
        System.out.println("CHAR");
        System.out.println("nilai char c = " + c);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar char = " + Character.BYTES + " bytes");
        System.out.println("Besar char = " + Character.SIZE + " bit");
        System.out.println("=======================================");

        // boolean (nilai true atau false)

        boolean val = false;
        System.out.println("BOOLEAN");
        System.out.println("nilai boolean val = " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);
        System.out.println("=======================================");

        final String nama = "fadhil abdul fattah";
        System.out.println(nama);

        // nama = "far cry"; error karena variabel var sudah final atau
        // bisa disebut dengan const dalam bahasa pemrograman yang lain

        // konversi tipe data

        // widening casting
        byte dataByte = 100;
        int dataInt = dataByte;
        System.out.print("Widening Casting : ");
        System.out.println(dataInt);

        // narrowing casting

        // int dataToByte = 1000;
        // byte Byte1 = (byte) dataToByte;

        // System.out.println(Byte1);
        // menghasilkan -24 karena terjadi number overflow, karena
        // tipe data byte hanya dapat menampung nilai sampai 127.
        // jika melebihi 127 maka akan menghitung ulang dari nilia minimum tipe data
        // byte yaitu -128

        int dataToByte = 127;
        byte byte1 = (byte) dataToByte;
        System.out.print("Narrowing Casting : ");
        System.out.println(byte1);

        char g = 'G';
        char o = 'O';
        char n = 'N';
        char t = 'T';
        char l = 'L';

        System.out.print(g);
        System.out.print(o);
        System.out.print(n);
        System.out.print(t);
        System.out.print(o);
        System.out.println(l);

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);
    }
}
