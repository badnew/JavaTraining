package fain.unit5;

import javax.swing.*;

public class HelloWorld extends JFrame {

    public HelloWorld() {
        setSize(400, 100);
        setTitle("Hello World");
        setVisible(true);

        // Adding a button
        JButton myButton = new JButton("Fuck you, please");
        add(myButton);
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}
