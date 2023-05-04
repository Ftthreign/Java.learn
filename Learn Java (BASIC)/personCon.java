public class personCon {
    public static void main(String[] args) {

        // cara pendeklarasian objek
        var person1 = new person();
        person person2 = new person();
        person person3;
        person3 = new person();
        person person4 = new person();

        // we can manipulate data in field as long as not final variable
        person1.nama = "Fadhil";
        person2.nama = "Eula";
        person3.nama = "Akali";

        person1.alamat = "Kotaagung";
        person2.alamat = "Mondstadt";
        person3.alamat = "League of Legends";

        person1.penjumlahan(10, 15);
        person1.perkalian();

        // Make unique character because we have no field in object

        // System.out.println(person1);
        // System.out.println(person2);
        // System.out.println(person3);

        System.out.println("\n\nName        : " + person1.nama);
        System.out.println("Address     : " + person1.alamat);
        System.out.println("Nationality : " + person1.nationality);
        System.out.println("Name        : " + person2.nama);
        System.out.println("Name        : " + person3.nama + "\n\n");

        person1.greeting(person2.nama);
        person2.greeting(person3.nama);
        person3.greeting(person1.nama);

        // if the value of object variable not declare, the value will be null
        person3.greeting(person4.nama);

    }
}
