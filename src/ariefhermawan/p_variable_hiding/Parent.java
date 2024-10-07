package ariefhermawan.p_variable_hiding;

class Util {
    static String tab() {
        return "\t";
    }

    static String doubleTab() {
        return "\t\t";
    }
}

class Parent {
    String name;

    void doIt() {
        System.out.println(Util.tab() + "Do it from parent.");
    }
}

class Child extends Parent {
    String name;

    @Override
    void doIt() {
        System.out.println(Util.tab() + "Do it from child.");
    }
}

class Instantiate {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Child";
        child.doIt();
        System.out.println(Util.doubleTab() + child.name);

        Parent parent = child;
        parent.doIt();
        System.out.println(Util.doubleTab() + parent.name);
    }
}