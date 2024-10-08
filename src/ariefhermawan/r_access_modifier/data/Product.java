/**
 * <p>
 * Baris kode ke 6 adalah package.
 * </p>
 */
package ariefhermawan.r_access_modifier.data;

public class Product {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return this.name;
    }

    public int price() {
        return this.price;
    }

    public void toConsole() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode()) +
                "{" +
                " name=" + this.name() + '\'' +
                ", price=" + this.price() +
                " }";
    }
}

class InstantiateClass {
    public static void main(String[] args) {
        Product product = new Product("", 0);
        product.name = "Indomie";
        product.price = 3100;
        product.toConsole();
    }
}
