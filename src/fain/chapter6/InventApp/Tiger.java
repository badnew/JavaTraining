package fain.chapter6.InventApp;

public class Tiger extends Animal implements Eatable {

    public Tiger(String name) {
        super(name);
    }

    public void eat(String name) {
        System.out.println("I'm eating meat. Truly yours, " + name);
    }
}
