package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {


        String first = "Arief";
        first = first + " " + "Karditya";

        System.out.println(first);

        String second = "Arief Karditya";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Arief Karditya";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
