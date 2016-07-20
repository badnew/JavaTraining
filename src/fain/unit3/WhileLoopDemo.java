package fain.unit3;

public class WhileLoopDemo {
    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Maria";
        friends[1] = "Olga";
        friends[2] = "Matilda";
        friends[18] = new String("Oksana");  // another way to initiate the string
        friends[19] = "Vera";

        int totalElements = friends.length;
        int i = 0;
        while (i < totalElements) {
            if (friends[i] == null) {
                i++;
                continue;
            }
            System.out.println("I love " + friends[i]);
            i++;
        }

        System.out.println("The iteration is over");
    }
}
