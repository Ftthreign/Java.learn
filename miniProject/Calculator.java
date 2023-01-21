import java.util.Scanner;

public class calculator {

    static Scanner input() {
        Scanner input = new Scanner(System.in);
        return input;
    }

    static int penjumlahan() {
        System.out.println("\nAnda memilih Penjumlahan \n");
        System.out.print("Masukkan nilai A : ");
        int A = input().nextInt();
        System.out.print("Masukkan nilai B : ");
        int B = input().nextInt();

        int hasil = A + B;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }

    static int pengurangan() {
        System.out.println("\nAnda memilih Pengurangan \n");
        System.out.print("Masukkan nilai A : ");
        int A = input().nextInt();
        System.out.println("Masukkan nilai B : ");
        int B = input().nextInt();

        int hasil = A - B;
        System.out.println("Hasil : " + hasil);

        return hasil;
    }

    static long perkalian() {
        System.out.println("\nAnda memilih Perkalian \n");
        System.out.print("Masukkan nilai A : ");
        int A = input().nextInt();
        System.out.print("Masukkan nilai B : ");
        int B = input().nextInt();

        long hasil = A * B;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }

    static float pembagian() {
        System.out.println("\nAnda memilih Pembagian \n");
        System.out.print("Masukkan nilai A : ");
        float A = input().nextFloat();
        System.out.print("Masukkan nilai B : ");
        float B = input().nextFloat();

        float hasil = A / B;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }

    static float modulus() {
        System.out.println("\nAnda memilih Modulus \n");
        System.out.print("Masukkan nilai A : ");
        float A = input().nextFloat();
        System.out.print("Masukkan nilai B : ");
        float B = input().nextFloat();

        float hasil = A % B;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }

    static void menu() {
        System.out.println("Silahkan Pilih menu operasi hitung");
        System.out.println("1. Penjumlahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian ");
        System.out.println("4. Pembagian ");
        System.out.println("5. Modulo ");
        System.out.println("6. Exit ");

    }

    public static void main(String[] args) {
        boolean lanjutkan = true;
        input();

        System.out.println("Kalkulator Sederhana");

        while (lanjutkan) {
            menu();
            System.out.print("Input nomor menu : ");
            int pilih = input().nextInt();

            switch (pilih) {
                case 1:
                    penjumlahan();
                    break;
                case 2:
                    pengurangan();
                    break;
                case 3:
                    perkalian();
                    break;
                case 4:
                    pembagian();
                    break;
                case 5:
                    modulus();
                    break;
                case 6:
                    System.out.println("Anda menekan keluar");
                    return;
                default:
                    System.err.println("Anda belum memasukkan input apapun atau input anda tidak sesuai!!");
                    return;
            }

            System.out.print("\n\nIngin Melakukan perhitungan lain ? y/n ");
            String jika = input().next();

            lanjutkan = jika.equalsIgnoreCase("y");
            System.out.println();
        }
    }
}
