public class ManagerApp {
    public static void main(String[] args) {


        var manager = new Manajer("Arief");
        manager.sayHello("Hilmi");

        var vp = new VicePresident("Hilmi");
        vp.sayHello("Aryo");

        System.out.println(manager.toString());
        System.out.println(vp.toString());
    }
}
