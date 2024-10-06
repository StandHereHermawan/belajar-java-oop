package ariefhermawan.i_inheritance;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    Employee() {
        this(null);
    }

    void sayHello() {
        this.sayHello("Bos");
    }

    void sayHello(String name) {
        System.out.println("\t\t" + "Hello " + name + "! My name is " + this.name);
    }
}

class Manager extends Employee {

}

class VicePresident extends Employee {

}

class InstantiateObject {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Arief";
        employee.sayHello("Hilmi");
        employee.sayHello();

        Manager manager = new Manager();
        manager.name = "Arief";
        manager.sayHello("Hilmi");
        manager.sayHello();

        VicePresident vicePresident = new VicePresident();
        vicePresident.name = "Arief";
        vicePresident.sayHello("Hilmi");
        vicePresident.sayHello();
    }
}