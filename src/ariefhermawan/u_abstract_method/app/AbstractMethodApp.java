package ariefhermawan.u_abstract_method.app;

import ariefhermawan.u_abstract_method.data.Animal;
import ariefhermawan.u_abstract_method.data.Cat;

public class AbstractMethodApp {
    public static void main(String[] args) {
        Animal animal = new Cat("Joko");
        animal.run();
    }
}
