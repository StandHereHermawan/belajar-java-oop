package ariefhermawan.o_type_check_and_casts;

class Util {
    public static String toString(Employee object) {
        return
                "\t\t" + object.getClass().getName() +
                        "@" + Integer.toHexString(object.hashCode()) +
                        "\n\t" +
                        "\t\t" + "\"name\"\t\t: " +
                        object.name + "\n\t" +
                        "\t\t" + "\"salary\"\t: " +
                        object.salary + "\n\t" +
                        "\t\t" + "\"roles\"\t\t: " +
                        object.roles + "\n\t"
                ;
    }
}

class Employee {
    String name;
    int salary;
    String roles;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.roles = "Employee";
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
                        " with roles " + this.roles +
                        "."
        );
    }

    void toConsole() {
        System.out.println(this);
    }

    /**
     * <pre>{@code
     *      @Override
     *      public String toString() {
     *          return
     *                  "\t\t" + object.getClass().getName() +
     *                         "@" + object.hashCode() +
     *                         "\n\t" +
     *                         "\t\t" + "\"name\"\t\t: " +
     *                         object.name + "\n\t" +
     *                         "\t\t" + "\"salary\"\t: " +
     *                         object.salary + "\n\t" +
     *                         "\t\t" + "\"roles\"\t\t: " +
     *                         object.roles + "\n\t"
     *                 ;
     *      }
     * }
     * </pre>
     */
    @Override
    public String toString() {
        return Util.toString(this);
    }
}

class Manager extends Employee {

    Manager(String name, int salary) {
        super(name, salary);
        super.roles = "Manager";
    }

    Manager(String name) {
        super(name);
    }

    Manager() {
        super();
    }
}

class VicePresident extends Employee {

    VicePresident(String name, int salary) {
        super(name, salary);
        super.roles = "Vice President";
    }

    VicePresident(String name) {
        super(name);
    }

    VicePresident() {
        super();
    }
}

class InstantiateClasses {
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President " + vicePresident.name + ".");
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name + ".");
        } else {
            System.out.println("Hello Manager " + employee.name + ".");
        }
    }

    public static void main(String[] args) {
        Employee arief = new Employee("Arief", 4_000_000);
        sayHello(arief);
        arief.sayHello("Hilmi");
        arief.toConsole();

        arief = new Manager(arief.name, 14_000_000);
        sayHello(arief);
        arief.sayHello("Hilmi");
        arief.toConsole();

        arief = new VicePresident(arief.name, 40_000_000);
        sayHello(arief);
        arief.sayHello("Hilmi");
        arief.toConsole();
    }
}