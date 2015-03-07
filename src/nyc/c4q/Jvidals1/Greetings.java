package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/7/15.
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a greeting: ");
        String greeting = input.nextLine();

        if (greeting .equals("Hey")) {
            System.out.println("Hey, how are you doing?");
        }

        else if (greeting.equals("Hi")) {
            System.out.println("Hi, how are you?");
        }

        else if (greeting.equals("What's up?")) {
            System.out.println("What's up!");
        }

        else  {
            System.out.println("Invalid greeting");
        }

    }
}
