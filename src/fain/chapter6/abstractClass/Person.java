package fain.chapter6.abstractClass;

public abstract class Person {
    private String name;
    private String address;

    int INCREASE_CAP = 20;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is " + name;
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    private void giveDayOff() {
        System.out.println("Giving a day off to " + name);
    }

    public void promote(int percent) {
        System.out.println(" Promoting a worker...");
        giveDayOff();
        // calling an abstract method
        incPay(percent);
    }

    public abstract boolean incPay(int percent);
}
