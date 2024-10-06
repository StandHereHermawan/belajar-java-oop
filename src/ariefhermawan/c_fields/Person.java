package ariefhermawan.c_fields;

class Person {
    /**
     * Ini adalah Class di Java.
     * Bisa digunakan untuk membuat Object yang nanti disimpan pada variable.
     * */
    String name;
    String address;
    final String country = "Indonesia";

}

class InitiateClass {
    public static void main(String[] args) {
        Person person = new Person();

        /**
         * Memberi Nilai Pada Field pada class yang udah jadi object
         * */
        person.name = "Arief Karditya Hermawan";
        person.address = "Bandung";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
    }
}
