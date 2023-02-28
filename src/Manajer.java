class Manajer extends Employee{
    String company;

    Manajer(String name) {
        super(name);
    }

    Manajer(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }

}
