package ariefhermawan.f_constructor_overloading.call_other_constructor_same_class;

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
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    /// Constructor Overloading
    /// Memanggil Constructor lain
    Person(String paramname) {
        this(paramname, null);
    }

    /// Constructor Overloading
    /// Memanggil Constructor lain
    Person() {
        this(null);
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
        System.out.println("\t" + "Nice to meet you.");
    }

    void greetings(String paramName) {
        System.out.println("\t\t" + "Hello, " + paramName + "! My name is " + name + ".");
        System.out.println("\t\t" + "Currently live in " + address + ", My country is " + country + ".");
    }
}

class InitiateClass {
    public static void main(String[] args) {
        /// Menggunakan Constructor
        Person person1 = new Person("Arief", "Bandung");
        /// Menggunakan Constructor Overloading
        Person person2 = new Person("Arief");
        Person person3 = new Person();

        person1.sayHello("Hilmi Akbar");
        person1.greetings("Aryo Kusumo");

        /**
         * <p>
         *    Memberi Nilai Pada Field pada class yang udah jadi object.
         * </p>
         * */
        person1.name = "Arief Karditya Hermawan";
        person1.address = "Bandung";

        person1.sayHello("Hilmi Akbar");
        person1.greetings("Aryo Kusumo");

        person2.sayHello("Hilmi Akbar");
        person2.greetings("Aryo Kusumo");

        person3.sayHello("Hilmi Akbar");
        person3.greetings("Aryo Kusumo");
    }
}
