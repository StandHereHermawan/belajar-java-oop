public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Arief");
        employee.sayHello("Reimi");

        employee = new Manajer("Aryo");
        employee.sayHello("Reimi");

        employee = new VicePresident("Andhika");
        employee.sayHello("Reimi");

        sayHello(new Employee("Arief"));
        sayHello(new Manajer("Aryo"));
        sayHello(new VicePresident("Andhika"));

    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President " + vicePresident.name);
        }else if (employee instanceof Manajer) {
            Manajer manajer = (Manajer) employee;
            System.out.println("Hello Manager " + manajer.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
    }
}
