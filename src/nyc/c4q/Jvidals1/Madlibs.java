package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/7/15.
 */

import java.util.Scanner;

//fill in the blanks game

public class Madlibs {

    public static void main(String[] args) {

     Scanner input= new Scanner(System.in);

     // We are going to create variables

        String verb;
        String pronoun;
        String adjective;
        String holiday;
        String anotherAdjective;
        int number;

       // creating an input option for the user

        System.out.println("Enter a pronoun: ");
        pronoun= input.next();
        // User enters a pronoun


        System.out.println("Enter a verb: ");
        verb= input.next();


        System.out.println("Enter an adjective: ");
        adjective= input.next();


        System.out.println("Enter another adjective: ");
        anotherAdjective =input.next();


        System.out.println("Enter a holiday: ");
        holiday=input.next();


        System.out.println("Enter the number of times that you would like to repeat this line? ");
        number=input.nextInt();

      System.out.println( pronoun +" " + verb + " a " + adjective + " " +  anotherAdjective + " "  + holiday + ". Repeat the line " + number+  " times!" );

    }

}

