package fain.chapter6.tryItSection;

public class Gastarbeiter implements Payable {
    private String name;

    public Gastarbeiter(String name) {
        this.name = name;
    }

    public boolean incPay(int percent) {
        System.out.println("Can't increase rate for gastarbeiters. "
                + name);
        return false;
    }
}
