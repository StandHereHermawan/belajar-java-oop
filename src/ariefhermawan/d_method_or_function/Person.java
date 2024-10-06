package ariefhermawan.d_method_or_function;

class Person {
    /**
     * Ini adalah Class di Java.
     * Bisa digunakan untuk membuat Object yang nanti disimpan pada variable.
     */
    String name;
    String address;
    final String country = "Indonesia";

    /**
     * <p>Function atau method sama saja.</p>

     * <p>
     * Function yang dideklarasi pada
     * class bisa di panggil dengan cara
     * membuat object classnya terlebih dahulu.
     * <p/>
     */
    void sayHello(String paramName) {
        System.out.println("\t" + "Hello, " + paramName + "! My name is " + name);
    }

    void greetings(String paramName) {
        System.out.println("\t\t" + "Hello, " + paramName + "! My name is " + name + ".");
        System.out.println("\t\t" + "Currently live in " + address + ", My country is " + country + ".");
    }
}

class InitiateClass {
    public static void main(String[] args) {
        Person person = new Person();

        /**
         * Memberi Nilai Pada Field pada class yang udah jadi object
         * */
        person.name = "Arief Karditya Hermawan";
        person.address = "Bandung";

        person.sayHello("Hilmi Akbar");
        person.greetings("Aryo Kusumo");
    }
}
