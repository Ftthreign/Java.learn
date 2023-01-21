import java.util.Scanner;

public class tokoBaju {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaTotal = 0;
        String beliLagi;

        System.out.println("+========================================+");
        System.out.println("+ Selamat datang di Program Toko Pakaian +");
        System.out.println("+========================================+");

        System.out.print("Silahkan masukkan nama anda : ");

        String nama = input.nextLine();

        System.out.println("Nama anda adalah : " + nama);

        System.out.print("Silahkan Konfirmasi Jenis kelamin anda : ");
        char gender = input.next().charAt(0);

        do {
            sayWelcome();
            if (gender == 'p' || gender == 'P') {
                pakaianPria();
                System.out.print("Silahkan pilih nomor produk : ");
                char pilih = input.next().charAt(0);
                switch (pilih) {
                    case '1':
                        System.out.println(" Crewneck = 100.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        int manyProduct = input.nextInt();

                        int price = 100000 * manyProduct;
                        hargaTotal += price;
                        break;

                    case '2':
                        System.out.println(" Kaos = 75.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        manyProduct = input.nextInt();

                        price = 75000 * manyProduct;
                        hargaTotal += price;
                        break;

                    case '3':
                        System.out.println("Tuxedo = 200.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        manyProduct = input.nextInt();

                        price = 200000 * manyProduct;
                        hargaTotal += price;
                        break;

                    case '4':
                        System.out.println("Jeans = 300.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        manyProduct = input.nextInt();

                        price = 300000 * manyProduct;
                        hargaTotal += price;
                        break;

                    case '5':
                        System.out.println("Kemeja = 150.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        manyProduct = input.nextInt();

                        price = 150000 * manyProduct;
                        hargaTotal += price;
                        break;
                }

            } else if (gender == 'w' || gender == 'W') {
                pakaianWanita();

                System.out.print("Silahkan pilih nomor produk : ");

                char pilih = input.next().charAt(0);

                switch (pilih) {
                    case '1':
                        System.out.println(" Rok = 50.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        int manyProduct = input.nextInt();

                        int price = 50000 * manyProduct;
                        hargaTotal += price;
                        break;

                    case '2':
                        System.out.println(" Sweater = 175.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        manyProduct = input.nextInt();

                        price = 175000 * manyProduct;
                        hargaTotal += price;
                        break;

                    case '3':
                        System.out.println(" Gaun = 200.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        manyProduct = input.nextInt();

                        price = 200000 * manyProduct;
                        hargaTotal += price;
                        break;

                    case '4':
                        System.out.println(" Sepatu = 350.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        manyProduct = input.nextInt();

                        price = 350000 * manyProduct;
                        hargaTotal += price;
                        break;

                    case '5':
                        System.out.println(" Celana = 150.000");
                        System.out.print("Silahkan tentukan jumlah yang ingin anda beli : ");
                        manyProduct = input.nextInt();

                        price = 150000 * manyProduct;
                        hargaTotal += price;
                        break;
                }

            }

            System.out.println("Apakah anda ingin membeli lagi ? Y/N");
            beliLagi = input.nextLine();

        } while (beliLagi == "y" || beliLagi == "Y");

        System.out.println("Harga yang perlu dibayarkan adalah : " + hargaTotal);

        input.close();
    }

    static void sayWelcome() {
        System.out.println("Silahkan pilih produk kami : ");
    }

    static void pakaianPria() {
        System.out.println("+========================================+");
        System.out.println("\t\tPakaian Pria ");
        System.out.println("+========================================+");
        System.out.println("1. Crewneck \t Rp.100.000");
        System.out.println("2. Kaos \t Rp.75.000");
        System.out.println("3. Tuxedo\t Rp.200.000");
        System.out.println("4. Jeans \t Rp.300.000");
        System.out.println("5. Kemeja \t Rp.150.000");
        System.out.println("+========================================+");
    }

    static void pakaianWanita() {
        System.out.println("+========================================+");
        System.out.println("\t\tPakaian Wanita ");
        System.out.println("+========================================+");
        System.out.println("1. Rok \t\t Rp.50.000");
        System.out.println("2. Sweater \t Rp.175.000");
        System.out.println("3. Gaun \t Rp.200.000");
        System.out.println("4. Sepatu \t Rp.350.000");
        System.out.println("5. Celana  \t Rp.150.000");
        System.out.println("+========================================+");
    }

}
