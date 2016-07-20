package fain.unit3.walkthrough;

import fain.unit3.walkthrough.homebox.Tax;

public class TestTax {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Sample usage of the program: " +
            " java TestTax 50000 2 NJ");
            System.exit(0);
        }

        Tax t = new Tax();

        double gi = Double.parseDouble(args[0]);
        int depen = Integer.parseInt(args[1]);

        t.setGrossIncome(gi);
        t.setDependents(depen);
        t.setState(args[2]);

        System.out.println("Your tax is " + t.calcTax());
    }
}
