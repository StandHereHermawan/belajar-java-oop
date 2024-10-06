package ariefhermawan.g_variable_shadowing;

class Person {
    /**
     * <p>
     * Ini adalah Class di Java.
     * Bisa digunakan untuk membuat Object yang nanti disimpan pada variable.
     * </p>
     */
    String name;
    String address;
    final String country = "Indonesia";

    /**
     * <p>
     * Saat kita membuat Object, maka kita seperti memanggil sebuah method,
     * karena kita menggunakan kurung ().
     * Di dalam class Java, kita bisa membuat constructor,
     * constructor adalah method  yang akan dipanggil saat pertama kali Object dibuat.
     * Mirip seperti di method,
     * kita bisa memberi parameter pada constructor.
     * Nama constructor harus sama dengan nama class,
     * dan tidak membutuhkan kata kunci void atau return value.
     * </p>
     */
    Person(String name, String address) {
        name = name;        // field tidak bisa diubah
        address = address;  // field tidak bisa diubah
    }

    /// Constructor Overloading
    Person(String name) {
        name = name;        // field tidak bisa diubah
    }

    /// Constructor Overloading
    Person() {

    }

    /**
     * <p>
     * Function atau method sama saja.
     * Function yang dideklarasi pada
     * class bisa di panggil dengan cara
     * membuat object classnya terlebih dahulu.
     * </p>
     */
    void sayHello(String name) {
        System.out.println("\t" + "Hello, " + name + "! My name is " + name + ".");
        System.out.println("\t" + "Nice to meet you.");
    }

    void greetings(String name) {
        System.out.println("\t\t" + "Hello, " + name + "! My name is " + name + ".");
        System.out.println("\t\t" + "Currently live in " + address + ", My country is " + country + ".");
    }
}

class InitiateClass {
    public static void main(String[] args) {
        /// Menggunakan Constructor
        Person person1 = new Person("Arief", "Bandung");
        person1.name = "Arief Karditya Hermawan";
        person1.address = "Bandung";
        person1.sayHello("Hilmi Akbar");
        person1.greetings("Aryo Kusumo");

        /// Menggunakan Constructor Overloading
        Person person2 = new Person("Arief");
        person2.sayHello("Hilmi Akbar");
        person2.greetings("Aryo Kusumo");

        /// Menggunakan Constructor Overloading
        Person person3 = new Person();
        person3.sayHello("Hilmi Akbar");
        person3.greetings("Aryo Kusumo");
    }
}
