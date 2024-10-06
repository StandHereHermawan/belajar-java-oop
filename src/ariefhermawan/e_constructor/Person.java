package ariefhermawan.e_constructor;

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
     *      Saat kita membuat Object, maka kita seperti memanggil sebuah method,
     *      karena kita menggunakan kurung ().
     *      Di dalam class Java, kita bisa membuat constructor,
     *      constructor adalah method  yang akan dipanggil saat pertama kali Object dibuat.
     *      Mirip seperti di method,
     *      kita bisa memberi parameter pada constructor.
     *      Nama constructor harus sama dengan nama class,
     *      dan tidak membutuhkan kata kunci void atau return value.
     * </p>
     * */
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    /**
     * <p>
     * Function atau method sama saja.
     * Function yang dideklarasi pada
     * class bisa di panggil dengan cara
     * membuat object classnya terlebih dahulu.
     * </p>
     */
    void sayHello(String paramName) {
        System.out.println("\t" + "Hello, " + paramName + "! My name is " + name + ".");
        System.out.println("\t"+"Nice to meet you.");
    }

    void greetings(String paramName) {
        System.out.println("\t\t" + "Hello, " + paramName + "! My name is " + name + ".");
        System.out.println("\t\t" + "Currently live in " + address + ", My country is " + country + ".");
    }
}

class InitiateClass {
    public static void main(String[] args) {
        /// Menggunakan Constructor
        Person person = new Person("Arief","Bandung");

        person.sayHello("Hilmi Akbar");
        person.greetings("Aryo Kusumo");

        /**
         * <p>
         *    Memberi Nilai Pada Field pada class yang udah jadi object.
         * </p>
         * */
        person.name = "Arief Karditya Hermawan";
        person.address = "Bandung";

        person.sayHello("Hilmi Akbar");
        person.greetings("Aryo Kusumo");
    }
}
