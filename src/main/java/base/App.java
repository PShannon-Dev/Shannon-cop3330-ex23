package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //instances
        App myApp = new App();
        Troubleshooting help = new Troubleshooting();

        //fix issue
        String response = help.askQuestion();

        //output
        System.out.println(response);
    }
}
