package fain.chapter5;

public class Girlfriends1 {
    public static void main(String[] args) {
        /*//String[] friends = new String[20];
        String[] friends = {"Masha", "Dasha", "Klara"};
        int totalElements = friends.length;

        *//*friends[0] = "Masha";
        friends[1] = "Dasha";
        friends[2] = "Matilda";
        friends[18] = "Sharon";
        friends[19] = "Olga";*//*

        System.out.println("The third girl's name is " + friends[2]);
        //System.out.println("The twentieth girl's name is " + friends[19]);*/

        String[][] friends = new String[3][2];
        int totalElements = friends.length;

        friends[0][0] = "Dasha";
        friends[0][1] = "123-45-23";

        friends[1][0] = "Masha";
        friends[1][1] = "345-89-90";

        friends[2][0] = "Gida";
        friends[2][1] = "119-23-88";

        for (int i = 0; i < totalElements; i++) {
            for (int j = 0; j < 2; j++) {
                if (j % 2 == 0){
                    System.out.println("Name: " + friends[i][j]);
                } else {
                    System.out.println("Number: " + friends[i][j]);
                }
            }
            System.out.println("");
        }

        StringBuffer sbf = new StringBuffer();
        sbf.append("Marry ");
        sbf.insert(6, "Abigale ");
        sbf.append("Smith");

        String fullName = sbf.toString();
        System.out.println(fullName);

        StringBuilder sbld = new StringBuilder(50);
        sbld.append("Marry");
        sbld.append(" Smith ");
        sbld.append("Superkozlinskaya");

        String fullName1 = sbld.toString();
        System.out.println(fullName1);

        String friend3 = new String("Mary");
        String friend4 = new String("Mary");

        System.out.println("friend3 == friend4 is "
                + (friend3 == friend4));

        System.out.println("friend3.equals(friend4) is "
                + friend3.equals(friend4));

        String[] girls = new String[4];

        for (String girl : girls) {
            System.out.println("I love " + girl);
        }
    }
}
