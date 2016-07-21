package fain.chapter6.interfaces;

public class TestPayIncrease {
    public static void main(String[] args) {
        Payable[] workers = new Payable[3];
        workers[0] = new Employee("Ivan");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Fatima");

        for (Payable p : workers) {
            p.incPay(30);
        }
    }
}
