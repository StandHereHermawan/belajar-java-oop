package ariefhermawan.l_super_constructor;

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
}

class InstantiateClasses {
    public static void main(String[] args) {
        Employee arief = new Employee("Arief", 4_000_000);
        arief.sayHello("Hilmi");

        VicePresident hilmi = new VicePresident("Hilmi", 40_000_000);
        hilmi.sayHello(arief.name);
    }
}