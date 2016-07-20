package fain.unit3.homework;

public class Girls {
    public static void main(String[] args) {
        String gfriend = "Masha";

        if (gfriend == "Masha") {
            System.out.println("gfriend == " + "Masha "+ "is true");
        } else {
            System.out.println("gfriend == " + "Masha "+ "is false");
        }

        // эти строки покажут true, потому что обе ссылки указывают на
        // один и тот же строковый литерал, находящийся в string pool
        /*String gfriend1 = "Natasha";
        String gfriend2 = "Natasha";*/

        // эти строки покажут false, так как каждая из ссылок сылается на
        // различные объекты, ведь оператор new всегда создает новый объект,
        // а строки в т.н. string pool могут переиспользоваться
        String gfriend1 = new String("Natasha");
        String gfriend2 = new String("Natasha");

        if (gfriend1 == gfriend2) {
            System.out.println("gfriend1 == gfriend2 is true");
        } else {
            System.out.println("gfriend1 == gfriend2 is false");
        }
    }
}
