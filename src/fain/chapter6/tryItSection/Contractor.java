package fain.chapter6.tryItSection;

public class Contractor implements Payable {
    private String name;

    public Contractor(String name) {
        this.name = name;
    }

    public boolean incPay(int percent) {
        if (percent < Payable.INCREASE_CAP) {
            System.out.println("Increasing hourly rate by " + percent + "%.");
            return true;
        } else {
            System.out.println("Can't increase hourly rate by more than "
                    + Payable.INCREASE_CAP + "%: " + name);
            return false;
        }
    }
}
