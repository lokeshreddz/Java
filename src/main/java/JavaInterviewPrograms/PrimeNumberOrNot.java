package JavaInterviewPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot {

    public static void main(String[] args) {


        int number = new Scanner(System.in).nextInt();

        if (number % 2 == 0) {

            System.out.println(number + " is not a primer number");

        } else {
            System.out.println(number + "is a prime number");
        }
    }
}
