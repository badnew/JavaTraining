package fain.chapter6.InventApp;

public class Hippo extends Animal implements Eatable {

    public Hippo(String name) {
        super(name);
    }

    public void eat(String name) {
        System.out.println("I'm eating grass. Truly yours, " + name);
    }
}
