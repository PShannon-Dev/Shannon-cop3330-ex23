/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Paul Shannon
 */
package base;

public class App {
    public static void main(String[] args) {
        //instances
        Troubleshooting help = new Troubleshooting();

        //fix issue
        String response = help.askQuestion();

        //output
        System.out.println(response);
    }
}
