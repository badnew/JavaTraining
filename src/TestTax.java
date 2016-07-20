public class TestTax {
    public static void main(String[] args) {
        Tax t = new Tax();

        double gi = Double.parseDouble(args[0]);
        int depen = Integer.parseInt(args[1]);

        t.setGrossIncome(gi);
        t.setDependents(depen);
        t.setState(args[2]);

        System.out.println("Your tax is " + t.calcTax());
    }
}
