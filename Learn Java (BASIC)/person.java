import java.util.Scanner;

class person {
    String nama;
    String alamat;
    final String nationality = "Indonesia";

    void greeting(String paramname) {
        System.out.println("Hello " + paramname + ", My name is " + nama);
    }

    // person(String paramname, String paramalamat) {
    // nama = paramname;
    // alamat = paramalamat;
    // }

    int penjumlahan(int a, int b) {
        System.out.println("hasil penjumlahan : " + (a + b));
        return a + b;
    }

    Scanner input() {
        Scanner input = new Scanner(System.in);
        return input;
    }

    float perkalian() {
        System.out.print("Masukkan nilai A : ");
        var A = input().nextFloat();
        System.out.print("Masukkan nilai B : ");
        var B = input().nextFloat();

        var hasil = A * B;

        if (hasil >= 1000) {
            System.out.println("Hasil            : " + hasil + "\n\n\n");
        } else {
            System.out.println("MINIMAL HASILNYA DIATAS 1000 LAH!!!");
        }

        return hasil;
    }

}
