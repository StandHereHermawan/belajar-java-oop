package ariefhermawan.b_object;

import ariefhermawan.a_class.Person;

public class ObjectInstantiate {
    public static void main(String[] args) {
        /**
         * Pembuatan object dari class Person
         * yang disimpan pada variabel person1 dan person2.
         * */
        var person1 = new Person();
        Person person2 = new Person();

        System.out.println(person1);
        System.out.println(person2);
    }
}
