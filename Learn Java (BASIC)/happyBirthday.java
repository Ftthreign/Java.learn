import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class happyBirthday {
    static Calendar kalender = Calendar.getInstance();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wanna Show ur Birthday? : ");
        String makeAchoice = input.nextLine();

        if (makeAchoice.equalsIgnoreCase("y")) {
            System.out.println("Ur birthday is :");
            kalender.set(Calendar.YEAR, 2023);
            kalender.set(Calendar.MONTH, Calendar.MARCH);
            kalender.set(Calendar.DAY_OF_MONTH, 27);
            kalender.set(Calendar.HOUR_OF_DAY, 0);
            kalender.set(Calendar.MINUTE, 0);
            kalender.set(Calendar.SECOND, 0);
            kalender.set(Calendar.MILLISECOND, 0);

            Date date = kalender.getTime();
            System.out.println(date);

            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\n\nHappy Birthday to me :)");
            }
        } else {
            System.out.println("OK that's All right");
        }

        input.close();
    }
}
