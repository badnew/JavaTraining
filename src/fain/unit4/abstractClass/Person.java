package fain.unit4.abstractClass;

abstract public class Person {
    private String name;
    int INCREASE_CAP = 20;    // final by default

    // constructor
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is " + name;
    }

    public void changeAddress(String address) {
        System.out.println("New address is " + address);
    }

    private void giveDayOff() {
        System.out.println("Giving a day off to " + name);
    }

    public void promote(int percent) {
        System.out.println("Promoting a worker...");
        giveDayOff();
        increasePay(percent);
    }

    // an abstract method to be implemented in subclasses
    public abstract boolean increasePay(int percent);
}
