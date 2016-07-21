package fain.chapter6.interfaces;

public class Employee extends Person implements Payable {
    public Employee(String name) {
        super(name);
    }

    public boolean incPay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. "
                + getName());
        return true;
    }
}
