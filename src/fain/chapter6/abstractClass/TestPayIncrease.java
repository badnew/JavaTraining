package fain.chapter6.abstractClass;

public class TestPayIncrease {
    public static void main(String[] args) {
        Person[] workers = new Person[3];
        workers[0] = new Employee("Ivan");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Fatima");

        for (Person p : workers) {
            p.promote(30);
        }
    }
}
