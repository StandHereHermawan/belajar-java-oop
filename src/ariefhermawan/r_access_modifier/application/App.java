package ariefhermawan.r_access_modifier.application;

import ariefhermawan.r_access_modifier.data.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 3100);
        product.toConsole();
    }
}
