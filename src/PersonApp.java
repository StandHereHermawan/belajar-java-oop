public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Arief", "Rancaekek");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Hilmi");

        Person person2 = new Person("Aryo", "Rancaekek");

        Person person3;
        person3 = new Person();
        person3.name = "Andhika";
        person3.sayHello("Hilmi");

    }
}
