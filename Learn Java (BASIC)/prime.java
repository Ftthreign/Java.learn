public class prime {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int a = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    a++;
                }
            }
            if (a == 2) {
                System.out.println(i);
            }
        }
    }
}
