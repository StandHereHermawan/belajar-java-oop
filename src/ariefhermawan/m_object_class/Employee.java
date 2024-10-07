package ariefhermawan.m_object_class;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    Employee(String name) {
        this(name, 0);
    }

    Employee() {
        this("Belum Ada", 0);
    }

    void sayHello(String nameGreeted) {
        System.out.println(
                "\t" +
                        "Hello " + nameGreeted +
                        "! My name is " + this.name +
                        "."
        );
    }

    @Override
    public String toString() {
        return
                "\t\t" + getClass().getName() +
                        "@" + Integer.toString(hashCode()) + "\n\t" +
                        "\t\t" + "\"name\"\t\t: " + this.name + "\n\t" +
                        "\t\t" + "\"salary\"\t: " + this.salary + "\n\t" +
                        "\t\t" + "\"roles\"\t\t: " + "Employee" + "\n\t"
                ;
    }
}

class VicePresident extends Employee {
    String roles;

    VicePresident(String name, int salary) {
        super(name, salary);
        this.roles = "Vice President";
    }

    VicePresident(String name) {
        super(name);
    }

    VicePresident() {
        super();
    }

    void sayHello(String nameGreeted) {
        System.out.println(
                "\t" +
                        "Hello " + nameGreeted +
                        "! My name is " + super.name +
                        " with roles " + this.roles +
                        "."
        );
    }

    @Override
    public String toString() {
        return
                "\t\t" + getClass().getName() +
                        "@" + Integer.toString(hashCode()) + "\n\t" +
                        "\t\t" + "\"name\"\t\t: " + super.name + "\n\t" +
                        "\t\t" + "\"salary\"\t: " + super.salary + "\n\t" +
                        "\t\t" + "\"roles\"\t\t: " + this.roles + "\n\t"
                ;
    }
}

class InstantiateClasses {
    public static void main(String[] args) {
        Employee arief = new Employee("Arief", 4_000_000);
        arief.sayHello("Hilmi");
        System.out.println(arief);

        VicePresident hilmi = new VicePresident("Hilmi", 40_000_000);
        hilmi.sayHello(arief.name);
        System.out.println(hilmi.toString());
    }
}