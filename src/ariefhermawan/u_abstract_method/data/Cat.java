package ariefhermawan.u_abstract_method.data;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this);
        System.out.println(super.toString());
        System.out.println("\t" + "\"Cat " + super.getName() + " is running.\"");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "super.name='" + super.getName() + '\'' +
                '}';
    }
}
