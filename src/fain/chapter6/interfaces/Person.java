package fain.chapter6.interfaces;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is " + name;
    }
}