public class jumlahmatriks {

    static int[][] matriks1 = { { 6, 2 }, { 8, 9 }, { 7, 6 }, { 4, 8 } };
    static int[][] Tmatriks1 = new int[2][4];
    static int[][] matriks2 = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 } };
    static int[][] hasil = new int[2][4];
    static int i, j;

    public static void main(String[] args) {

        // merubah dimensi dari matriks 1
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 2; j++) {
                Tmatriks1[j][i] = matriks1[i][j];
            }
        }

        // menampilkan matriks 1 yang sudah diubah dimensinya
        System.out.println("MATRIKS 1 = ");
        for (i = 0; i < 2; i++) {
            System.out.print("|");
            for (j = 0; j < 4; j++) {
                System.out.print(Tmatriks1[i][j] + " ");
            }
            System.out.print("|");
            System.out.println(" ");
        }

        System.out.println("\n");

        // menampilkan matriks 2
        System.out.println("MATRIKS 2 = ");
        for (i = 0; i < 2; i++) {
            System.out.print("|");
            for (j = 0; j < 4; j++) {
                System.out.print(matriks2[i][j] + " ");
            }
            System.out.print("|");
            System.out.println(" ");
        }

        // Menjumlahkan dua matriks
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++) {
                hasil[i][j] = Tmatriks1[i][j] + matriks2[i][j];
            }
            System.out.println(" ");
        }

        // menampilkan hasil penjumlahan
        System.out.println("HASIL PENJUMLAHAN = ");
        for (i = 0; i < 2; i++) {
            System.out.print("|");
            for (j = 0; j < 4; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.print("|");
            System.out.println(" ");
        }
    }
}
