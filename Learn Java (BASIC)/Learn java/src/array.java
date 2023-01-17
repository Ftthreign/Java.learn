public class array {
    public static void main(String[] args) {
        String[] nama = { "fadhil", "abdul", "fattah" };

        System.out.print(nama[0]);
        System.out.print(" " + nama[1]);
        System.out.print(" " + nama[2]);

        int[] number = { 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };

        System.out.println("\n" + "Panjang array = " + number.length);

        // mengeluarkan semua nilai pada indeks array
        for (int i = 0; i < 10; i++) {
            System.out.println("index ke-" + i + " = " + number[i]);
        }

        System.out.println("Menggunakan for each");

        for (int i : number) {
            System.out.println(i);
        }

        String[] npm = new String[5];
        npm[0] = " rorr";
        npm[1] = " fadhil abdul fattah";
        npm[2] = " eula lawrence";
        npm[3] = " goto hitori";
        npm[4] = " Esdeath";

        System.out.println(npm[0]);
        System.out.println(npm[1]);
        System.out.println(npm[2]);
        System.out.println(npm[3]);
        System.out.println(npm[4]);
    }
}
