public class pool {
    public static void main(String[] args) {
        int value = 5;

        for (int i = 0; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for each
        String[] nama = { "fadhil", "abdul", "fattah", "esdeath" };

        for (String i : nama) {
            System.out.println(i);
        }

        // program looping berhenti sampai dengan 99

        int count = 1;

        while (true) {
            System.out.println("perulangan ke - " + count);

            count++;

            if (count >= 100) {
                break;
            }
        }

        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 1) {
                continue;
            }

            System.out.println("Angka genap " + counter);
        }

        // program membut nilai factorial
        int hasil = 1;
        for (var factorial = 1; factorial < 7; factorial++) {
            hasil *= factorial;

            System.out.println(factorial + "! = " + hasil);
        }

    }
}