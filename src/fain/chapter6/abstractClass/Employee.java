package fain.chapter6.abstractClass;

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    public boolean incPay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. "
                + getName());
        return true;
    }
}
