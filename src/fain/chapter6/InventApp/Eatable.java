package fain.chapter6.InventApp;

public interface Eatable {
    default void eat(String name) {
        System.out.println("I'm just eating... Don't disturb. " + name
                + ".");
    }
}
