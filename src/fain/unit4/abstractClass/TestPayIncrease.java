package fain.unit4.abstractClass;

public class TestPayIncrease {
    public static void main(String[] args) {
        Person[] workers = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Elise");
        workers[2] = new Employee("Ivan");

        Employee currentEmployee;
        Contractor currentContractor;
        for (Person p : workers) {
            if (p instanceof Employee) {
                currentEmployee = (Employee) p;
                currentEmployee.increasePay(30);
            } else {
                currentContractor = (Contractor) p;
                currentContractor.increasePay(30);
            }
        }
    }
}
