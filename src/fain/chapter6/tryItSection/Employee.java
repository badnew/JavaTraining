package fain.chapter6.tryItSection;

public class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public boolean incPay(int percent) {
        System.out.println("Increasing salary by " + percent + "%: "
                + name);
        return true;
    }
}
