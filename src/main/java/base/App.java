package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Brianne Juntunen
 *
 Exercise 5 - Simple Math
 * You’ll often write programs that deal with numbers.
 * And depending on the programming language you use,
 * you’ll have to convert the inputs you get to numerical
 * data types.

 * Write a program that prompts for two numbers. Print the
 * sum, difference, product, and quotient of those numbers
 * as shown in the example output:
 */


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        String input1 = myApp.getInput("first");
        String input2 = myApp.getInput("second");

        String generatedOutput = myApp.simpleMath(input1, input2);
        myApp.printOutput(generatedOutput);
    }

    public void printOutput(String generatedOutput){
        System.out.print(generatedOutput);
    }

    public String simpleMath(String sInput1, String sInput2){
        int input1 = Integer.parseInt(sInput1);
        int input2 = Integer.parseInt(sInput2);

        String output = input1 + " + " + input2 + " = " + (input1 + input2) + "\n" +
                input1 + " - " + input2 + " = " + (input1 - input2) + "\n" +
                input1 + " * " + input2 + " = " + (input1 * input2) + "\n" +
                input1 + " / " + input2 + " = " + (input1 / input2) + "\n";
        return output;
    }

    public String getInput(String placement){
        System.out.print("What is the " + placement + " number? ");
        return in.nextLine();
    }

}
