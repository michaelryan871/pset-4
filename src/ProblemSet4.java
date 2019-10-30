/**
 * Problem Set 4.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();

        // comment out or uncomment as needed

        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     *
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */

    public void sum() {

      //Initializing Variables
        long lowerBound;
        long upperBound;
        long sum = 0;
        // Required Space
        System.out.print("\n");
        do {
          System.out.print("Lower bound: ");
          lowerBound = in.nextLong();
          System.out.print("Upper bound: ");
          upperBound = in.nextLong();
        } while (lowerBound > upperBound);
        //Execution of Even Summation
      for (long x = lowerBound;  x <= upperBound; x++){
        if (x % 2 == 0)
          sum +=x;
      }
        System.out.println("\n" + String.format("%,d", sum) + ".");
      }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

    public void reverse() {

        //Intializing Variables
        int reverseInteger = 0;
        // Required Space
        System.out.print("\n");
        do {
          System.out.print("Positive integer: ");
          reverseInteger = in.nextInt();
        } while (reverseInteger < 1);
        //Conversion (String)
        String reverseIntegerString = Long.toString(reverseInteger);
        int reverseStringLength = reverseIntegerString.length();
        // Required Space
        System.out.print("\n");
        for (int i = reverseStringLength; i > 0; i--){
            if (i == 1){
            System.out.printf(String.format("%s.\n", reverseIntegerString.substring(i-1, i)));
          } else {
            System.out.printf(String.format("%s, ", reverseIntegerString.substring(i-1, i)));
          }
        }
    }


    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {
        //Intializing Variables
        int reverseInteger = 0;
        long digit = 0;
        long sum = 0;
        // Required Space
        System.out.print("\n");
        do {
          System.out.print("Positive integer: ");
          reverseInteger = in.nextInt();
        } while (reverseInteger < 1);
        //Main "while" statement, is odd? if so... else... even.
        while (reverseInteger > 0) {
          digit = reverseInteger % 10;
           if (digit % 2 != 0) {
           sum += digit;
           reverseInteger /= 10;
        } else {
          reverseInteger /= 10;
        }
      }
      System.out.println("\n" + sum + ".");
  }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    public void average() {
      //Initializing Variables
        long negativeInteger = 0;
        long value = 0;
        double average = 0;
        boolean isNegative = false;
        //Required Space
        System.out.print("\n");
        //Execution --> While user input is false, the value is recorded, as well as how many values.
        //As soon as a negative integer is entered, the while loop ends and the average is then calculated.
        while (isNegative == false) {
          System.out.print("Non-negative integer: ");
          negativeInteger = in.nextLong();
          if (negativeInteger >= 0){
            average = average + negativeInteger;
            value++;
          } else {
            isNegative = true;
             }
           }
           average = average / value;
         System.out.println("\n" + String.format("%,.2f", average) + ".");
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {
      //Intializing Variables
      long nonNegativeInteger = -1;
      boolean isPrime = true;
      //Required Space
      System.out.print("\n");
      while (nonNegativeInteger < 0){
        System.out.print("Non-negative integer: ");
        nonNegativeInteger = in.nextLong();
      }

      if (nonNegativeInteger == 0 || nonNegativeInteger == 1){
        isPrime = false;
      } else {
        for (int x = 2; x < nonNegativeInteger; x++){
          if (nonNegativeInteger % x == 0){
            isPrime = false;
          }
        }
      }
      //Required Space
      System.out.print("\n");
      if (!isPrime){
        System.out.println("Not prime.");
      } else {
        System.out.println("Prime.");
      }

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {
      //Initializing Variables
      int fibonacciNumber = -1;
      int integer1 = 0;
      int integer2 = 1;
      int integer3 = 0;
      //Required Space
      System.out.print("\n");
      while (fibonacciNumber < 1 || fibonacciNumber > 92){
        System.out.print("Positive integer: ");
        fibonacciNumber = in.nextInt();
      }

      for (int x = 1; x < fibonacciNumber; x++){
        integer3 = integer1 + integer2;
        integer1 = integer2;
        integer2 = integer3;
      }
      System.out.println("\n" + integer3 + ".");
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {
      //Initializing Variables
      long positiveInteger = 0;
      //Required Space
      System.out.print("\n");
    while (positiveInteger < 1){
      System.out.print("Positive integer: ");
      positiveInteger = in.nextLong();
    }

    System.out.print("\n1, " + positiveInteger);

    for (int x = 2; x <= positiveInteger / x; x++){
      if (positiveInteger % x == 0){
        System.out.print(", " + x + ", " + positiveInteger / x);
      }
    }
    System.out.print(".\n");
  }
    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {
      //Initializing Variables
      int halfPyramidHeight = 0;
      int halfPyramidLength = 0;
      //Required Space
      System.out.print("\n");
      do {
        System.out.print("Height: ");
        halfPyramidHeight = in.nextInt();
      } while (halfPyramidHeight < 1 || halfPyramidHeight > 24);
      //Required Space
      System.out.print("\n");

      for (int x = 1; x <= halfPyramidHeight; x++){
        for (int j = halfPyramidHeight - x; j > 0; j--){
          System.out.print(" ");
          halfPyramidLength++;
        }
        for (int k = halfPyramidHeight + 1 - halfPyramidLength; k > 0; k--){
          System.out.print("#");
        }
        System.out.print("\n");
        halfPyramidLength = 0;
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {
      //Initializing Variables
      int halfPyramidHeight = 0;
      int halfPyramidLength = 0;
      int pyramidReflection = 0;
      //Required Space
      System.out.print("\n");
      do {
        System.out.print("Height: ");
        halfPyramidHeight = in.nextInt();
      } while (halfPyramidHeight < 1 || halfPyramidHeight > 24);
      //Required Space
      System.out.print("\n");

      for(int x = 1; x <=halfPyramidHeight; x++){
        for(int j = halfPyramidHeight - x; j > 0; j--){
          System.out.print(" ");
          halfPyramidLength++;
        }
        for (int k = halfPyramidHeight + 1 - halfPyramidLength; k > 0; k--){
          System.out.print("#");
          pyramidReflection++;
        }
        System.out.print(" ");

        for (int n = 0; n < pyramidReflection; n++){
          System.out.print("#");
        }
        System.out.print("\n");
        halfPyramidLength = 0;
        pyramidReflection = 0;
      }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {
          //Initializing Variables
            long cardNumber = 0;
            int sumOne = 0;
            int sumTwo = 0;
            String sumString = "";
            String cardType = "Invalid";
            String cardString = "";

            //Required Space
            System.out.print("\n");

            do {
                System.out.print("Number: ");
                cardNumber = in .nextLong();
                cardString = Long.toString(cardNumber);
            } while (cardNumber <= 0);


            cardString = Long.toString(cardNumber);
            for (int i = cardString.length() - 2; i > -1; i -= 2) {
                sumString += Integer.toString(2 * Integer.parseInt(cardString.substring(i, i + 1)));
            }

            for (int i = sumString.length() - 1; i >= 0; i --) {
                sumOne += Integer.parseInt(sumString.substring(i, i + 1));
            }

            for (int i = cardString.length() - 1; i >= 0; i -= 2 ) {
                sumTwo += Integer.parseInt(cardString.substring(i, i + 1));
            }

            if (cardString.length() == 15 && (cardString.substring(0, 2).equals("37") ||
              cardString.substring(0, 2).equals("34")) && ((sumOne + sumTwo) % 10 == 0)) {
                cardType = "Amex";
            } else if ((cardString.length() == 16 || cardString.length() == 13) && ((sumOne + sumTwo) % 10 == 0) &&
              (cardString.substring(0, 1).equals("4"))) {
                cardType = "Visa";
            } else if (cardString.length() == 16 && ((sumOne + sumTwo) % 10 == 0)) {
                switch (cardString.substring(0, 2)) {
                    case "51":
                        cardType = "Mastercard";
                        break;
                    case "52":
                        cardType = "Mastercard";
                        break;
                    case "53":
                        cardType = "Mastercard";
                        break;
                    case "54":
                        cardType = "Mastercard";
                        break;
                    case "55":
                        cardType = "Mastercard";
                        break;
                }
            }
            System.out.print("\n" + String.format("%s.\n", cardType));
        }
    }
