package ariefhermawan.u_abstract_method.data;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.setName(name);
    }

    public abstract void run();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\tAnimal{" +
                "name='" + this.getName() + '\'' +
                "}(abstract-class)";
    }
}
