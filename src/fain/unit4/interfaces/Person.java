package fain.unit4.interfaces;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name " + name;
    }
}
