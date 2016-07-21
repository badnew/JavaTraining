package fain.chapter6.InventApp;

public class EatTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger("Killer T.");
        animals[1] = new Hippo("Fat H.");
        animals[2] = new Man("Ivan");
        animals[3] = new Varg("Varg Ivanovich");

        for (Animal a : animals) {
            ((Eatable) a).eat(a.getName());
        }
    }
}