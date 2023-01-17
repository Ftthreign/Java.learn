public class function {
    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();
        sayHello();
        sayHello();
        bintangKeren();
        penjumlahan(8, 10);
        System.out.println(kondisi(2000, "+", 1000));
        System.out.println(kondisi(2000, "-", 1000));
        System.out.println(kondisi(2000, "*", 1000));
        System.out.println();
        System.out.println("Hasil Penjumlahan adalah  = " + jumlah(100, 2000));

        int A = 200;
        int B = 100;
        int C = jumlah(A, B);

        System.out.println(C);

        float D = A + 0.5f;
        float E = B + 0.5f;
        float F = perkalian(D, E);

        System.out.println(F);

        // Without method variable argument
        mean('F');

        // with method variable argument
        mean("Fadhil ", 10, 50, 100, 80, 75, 85);

        // recursive method
        System.out.println(faktorial(6));
    }

    static void sayHello() {
        System.out.println("HALO DUNIA YANG PENUH DENGAN TIPU TIPU");
    }

    static void bintangKeren() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // sedikit keliru
    static void penjumlahan(int A, int B) {
        System.out.println("A + B = " + (A + B));
    }

    static int jumlah(int A, int B) {
        int hasil = A + B;
        return hasil;
    }

    static float perkalian(float D, float E) {
        float hasilPerkalian = D * E;
        return hasilPerkalian;
    }

    /**
     * method yang digunakan untuk menghitung sebuah operasi aritmatika berupa
     * penjumlahan dan pengurangan
     * sehingga memiliki nilai keluaran 3 yaitu penjumlahan, pengurangan, dan tidak
     * ada operandnya
     * 
     * @param angka1
     * @param operation
     * @param angka2
     * @return
     */

    static Integer kondisi(int angka1, String operation, int angka2) {
        switch (operation) {
            case "+":
                return angka1 + angka2;
            case "-":
                return angka1 - angka2;
            default:
                return null;

        }
    }

    // method overloading (nama method sama namun beda parameter)
    // contoh method yang akan menghasilkan error :

    // static void reel (String nama){
    // // block
    // }

    // static void reel (String nama){
    // // block
    // }

    // without Method Variable Argument

    static void mean(char code) {
        int[] nilai = { 40, 50, 100, 80, 75, 85 };

        float sum = 0;
        for (var sumTotal : nilai) {
            sum += sumTotal;
        }
        float mean = sum / nilai.length;
        System.out.print("Selamat " + code + " Anda lulus ");
        System.out.println("dengan nilai rata-rata = " + mean);
    }

    // with Method variable argument

    static void mean(String nama, int... nilai1) {
        float sum = 0;
        for (var sumTotal : nilai1) {
            sum += sumTotal;
        }
        float mean = sum / nilai1.length;

        if (mean >= 70) {
            System.out.print("Selamat " + nama + ", Anda Lulus ");
        } else {
            System.out.print("Maaf " + nama + ", Anda belum lulus");
        }

        System.out.println(" dengan nilai rata-rata = ");
        System.out.printf("%.2f", mean);
        System.out.println();
    }

    // recursive method

    static int faktorial(int angka) {
        if (angka == 1) {
            return 1;
        } else {
            return angka * faktorial(angka - 1);
        }
    }
}
