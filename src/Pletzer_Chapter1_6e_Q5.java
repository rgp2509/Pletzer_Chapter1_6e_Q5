import java.util.Scanner;
public class Pletzer_Chapter1_6e_Q5 {
    public static void main(String[] args) {
        /* Code Created by Ryan Pletzer, All rights reserved.
        This code was generated to show a solution to the problem found in "Java: an introduction to computer
        programing and solving" By Walter Savitch

        This code used a simple for loop with a +1 incrementer to make an otherwise tedious problem simple.
        While using proper print syntax to ensure a nice final print.
        This code was also only written in the main, as it was short enough to complete in only a few lines.

         code was modified to encorporate Junit which required the method to be created.
         */
        System.out.println("Welcome to the integer display tool, I will output all integers between two values");
        System.out.println("Example Inputs -1, 5; -1, 0, 1, 2, 3, 4, and 5.");
        System.out.println("Please enter an initial integer now");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        System.out.println("Please enter a final integer now");
        int last = input.nextInt();
        System.out.println(printBetween(first,last));



    }
    public static String printBetween(int first, int last){
        System.out.print("your integers are: ");
        String finalOut=new String();

        for (int i = first; i < last; i++){
            finalOut= finalOut + i + ", ";
        }
        finalOut = finalOut + "and " + last + ".";
        return finalOut;
    }

}
