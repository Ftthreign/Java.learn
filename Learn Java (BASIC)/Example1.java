import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Example1 {

    static Scanner Input() {
        Scanner input = new Scanner(System.in);
        return input;
    }

    public static void main(String[] args) {

        List<String> items = List.of("1", "a", "2", "a", "3", "a");

        items.forEach(item -> {
            if (item.equals("a")) {
                System.out.println("A");
            } else {
                System.out.println("NOT A");
            }
        });

        System.out.print("y/n? : ");
        String makeDecision = Input().next();

        List<Integer> angka = List.of(1, 4, 5, 6, 7, 8, 9, 100, 70);

        String[] makanan = { "Nasi Goreng", "Ayam Geprek", "Bakso", "Mie ayam" };

        angka.forEach(item -> {
            if (item.equals(item)) {
                for (int i = 0; i < makanan.length; i++) {
                    if (item.equals(100)) {
                        if (makeDecision.equalsIgnoreCase("y")) {
                            System.out.print(makanan[i]);
                            if (makanan[i].equalsIgnoreCase("Mie ayam")) {
                                System.out.print(".");
                            } else {
                                System.out.print(", ");
                            }
                        } else {
                            try {
                                System.out.println(makanan[10]);
                            } catch (Exception error) {
                                System.out.println("Array tidak dapat diambil");
                                break;
                            }

                        }
                    }
                }
            }
        });

        Calendar kalender = Calendar.getInstance();
        System.out.print("\nWanna Show ur Birthday : ");
        String makeAChoice = Input().nextLine();

        if (makeAChoice.equalsIgnoreCase("y")) {
            System.out.print("Ur Birthday is : ");
            kalender.set(Calendar.YEAR, 2023);
            kalender.set(Calendar.MONTH, Calendar.MARCH);
            kalender.set(Calendar.DAY_OF_MONTH, 27);
            kalender.set(Calendar.HOUR_OF_DAY, 0);
            kalender.set(Calendar.MINUTE, 0);
            kalender.set(Calendar.SECOND, 0);
            kalender.set(Calendar.MILLISECOND, 0);

            Date date = kalender.getTime();
            System.out.println(date);

            for (int i = 0; i < 40; i++) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Happy Birthday to me :)");
            }
        } else {
            System.out.println("OK that's All right");
        }

    }
}
