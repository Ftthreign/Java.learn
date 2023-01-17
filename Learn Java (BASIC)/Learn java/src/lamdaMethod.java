public class lamdaMethod {
    public static void main(String[] args) {

        // if statement
        var gender = "wanita";

        if (gender == "wanita") {
            System.out.println("Anda adalah seorang wanita tulen");
        }

        // if else statement
        var nilaiUTS = 78;
        var nilaiUAS = 70;

        if (nilaiUTS >= 75 && nilaiUAS >= 75) {
            System.out.println("Anda lulus");
        } else if (nilaiUTS >= 75 && nilaiUAS < 75) {
            System.out.println("Nilai UAS anda belum lulus");
        } else if (nilaiUTS < 75 && nilaiUAS >= 75) {
            System.out.println("Nilai UTS anda belum lulus");
        } else if (nilaiUTS < 75 && nilaiUAS < 75) {
            System.out.println("Nilai UTS dan UAS anda belum lulus");
        }

        // Switch case biasa
        var nilai = 'R';

        switch (nilai) {
            case 'A':
                System.out.println("Anda Lulus");
                break;
            case 'B':
                System.out.println("cukup untuk lulus");
                break;
            case 'C':
            case 'D':
                System.out.println("Anda disarankan untuk mengulang");
                break;
            case 'E':
                System.out.println("Anda tidak lulus, mengulang di tahun depan");
                break;
            default:
                System.out.println("Nilai anda belum terinput dengan benar");
        }

        // Switch lambda
        // can use start from java v14

        var ipk = 1;

        switch (ipk) {
            case 1 -> System.out.println("Maaf ipk anda terlalu kecil untuk melanjutkan kuliah");
            case 2, 3 -> System.out.println("Ipk anda cukup namun disarankan untuk mengulang");
            case 4 -> System.out.println("IPK anda sangat baik sehingga dapat memilih sks sebesar 24");
            default -> {
                System.out.println("Inputan IPK anda belum dikeluarkan");
            }
        }

        String say;
        switch (ipk) {
            case 1 -> say = "Maaf ipk anda terlalu kecil untuk melanjutkan kuliah";
            case 2, 3 -> say = "Ipk anda cukup namun disarankan untuk mengulang";
            case 4 -> say = "IPK anda sangat baik sehingga dapat memilih sks sebesar 24";
            default -> {
                say = "Inputan IPK anda belum dikeluarkan";
            }
        }
        System.out.println(say);

        // yield
        // can use start from java v14

        String ucapkan = switch (ipk) {
            case 1:
                yield "Maaf ipk anda terlalu kecil untuk melanjutkan kuliah";
            case 2, 3:
                yield "Ipk anda cukup namun disarankan untuk mengulang";
            case 4:
                yield "IPK anda sangat baik sehingga dapat memilih sks sebesar 24";
            default: {
                yield "Inputan IPK anda belum dikeluarkan";
            }
        };

        System.out.println(ucapkan);

        // ternary operator

        var tinggiBadan = 150;

        String email = tinggiBadan >= 160 ? "Selamat anda lulus IPDN" : "Silahkan coba lagi tahun depan";

        System.out.println(email);
    }
}
