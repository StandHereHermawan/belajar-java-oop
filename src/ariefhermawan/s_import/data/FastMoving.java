package ariefhermawan.s_import.data;

import ariefhermawan.r_access_modifier.data.Product;

public class FastMoving extends Product {
    private String expiredDate;

    public FastMoving(String name, int price, String expiredDate) {
        super(name, price);
        this.expiredDate = expiredDate;
    }

    public String expiredDate() {
        return this.expiredDate;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode()) +
                "{" +
                " name=\'" + this.name() +
                "\', price=" + this.price() +
                ", expired_date=\'" + this.price() +
                "\' }";
    }
}
