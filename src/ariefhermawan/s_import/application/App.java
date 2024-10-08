package ariefhermawan.s_import.application;

import ariefhermawan.s_import.data.*;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 3100);
        product.toConsole();

        FastMoving instantNoodle = new FastMoving("Indomie Cakalang", 3100, "2025-01-25");
        instantNoodle.toConsole();
    }
}
