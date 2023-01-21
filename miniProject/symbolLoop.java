import java.util.Scanner;

public class symbolLoop {

    static Scanner input() {
        Scanner input = new Scanner(System.in);

        return input;
    }

    static void message() {
        System.out.print("Masukkan Jumlah looping : ");
    }

    static void menu() {
        System.out.println("Silahkan pilih pilihan looping : ");
        System.out.println("1 - 11");
        System.out.println("Ketik 12 untuk Keluar : ");
        System.out.print("Masukkan pilihan : ");

    }

    static void loop1() {
        message();
        input();
        int input = input().nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= input; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void loop2() {
        message();
        input();
        int input = input().nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void loop3() {
        message();
        input();
        int input = input().nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = input; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void loop4() {
        message();
        input();
        int input = input().nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = input - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void loop5() {
        message();
        input();
        int input = input().nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = input - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void loop6() {
        message();
        input();
        int input = input().nextInt();

        for (int i = input; i >= 1; i--) {
            for (int j = input; j >= 1; j--) {
                if (i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void loop7() {
        message();
        input();
        int input = input().nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void loop8() {
        message();
        input();
        int input = input().nextInt();
        int k = 1;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print((k++) + " ");
            }
            System.out.println();

        }
    }

    static void loop9() {
        message();
        input();
        int input = input().nextInt();
        int k = 1;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print((k) + " ");
                k += 2;
            }
            System.out.println();
        }
    }

    static void loop10() {
        message();
        input();
        int input = input().nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }
    }

    static void pascalTriangle() {
        message();
        input();
        int input = input().nextInt();
        int check = 1;

        for (int i = 1; i <= input; i++) {
            for (int j = input - 1; j >= i; j--) {
                System.out.print(" ");
            }
            int p = 1;
            System.out.print(p);
            while (check < i) {
                System.out.print(p *= 2);
                check++;
            }
            while (check > 1) {
                System.out.print(p /= 2);
                check--;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        menu();

        int pilih = input().nextInt();

        switch (pilih) {
            case 1:
                loop1();
                break;
            case 2:
                loop2();
                break;
            case 3:
                loop3();
                break;
            case 4:
                loop4();
                break;
            case 5:
                loop5();
                break;
            case 6:
                loop6();
                break;
            case 7:
                loop7();
                break;
            case 8:
                loop8();
                break;
            case 9:
                loop9();
                break;
            case 10:
                loop10();
                break;
            case 11:
                pascalTriangle();
                break;
        }

        if (pilih == 12) {
            System.out.println("Program Selesai..");
            return;
        }
    }
}
