public class swapvalueTwovariables {
    public static void main(String[] args) {

        String firstName = "Fadhil ";
        String middleName = "Abdul";
        String lastName = " Fattah";

        System.out.println("Halo " + firstName + middleName + lastName + "\n");

        firstName = "Eula ";
        lastName = "Lawrence";

        System.out.println("Halo " + firstName + lastName + "\n");

        int age = 19;

        System.out.println("Umur anda adalah : " + age);

        // var x;
        // error karena kata kunci var harus menyertakan value

        var umur = 20;

        System.out.println(umur);

        // Kata kunci final
        // final == const dalam bahasa pemrograman lain

        final float phi = 3.14f;

        System.out.print("Nilai dari phi adalah : ");
        System.out.println(phi);

        // switch value of two variables

        String manager = "really good af";
        String love = "meh!";
        String temp = null; // same to String temp;

        temp = manager;
        manager = love;
        love = temp;

        System.out.println("manager = " + manager);
        System.out.println("love = " + love);

        // tipe data primitif == all lowercase != String
        // default value = 0 || 0.0 || null

        // tipe data non primitif
        // default value = null

        // konversi tipe data primitif - non primitif bertipe data sama
        Integer int1 = 100;
        int int2 = int1;

        System.out.println(int2);

        // konversi tipe data primitif - non primitif tidak bertipe data sama
        short short1 = int1.shortValue();

        System.out.println(short1);
    }

}
