package ariefhermawan.t_abstract_class.data;

public class City extends Location {

    public City(String name) {
        super(name);
    }

    public void toConsoleView() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + super.name + '\'' +
                '}';
    }
}
