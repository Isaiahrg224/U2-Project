import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Grand Lottery");
        System.out.println("The rules to this lottery are as follows:");
        System.out.println("-The Lottery is 10 digits, so only guess that many");
        System.out.println("-If the you are asked a yes or no question answer with either yes, no, y, or n");
        System.out.println("-For each lottery ticket you purchase you will be asked for what" +
                " numbers you want for it, respond with either 10 digits, or if you want it randomized, respond " +
                "with r or random");
        System.out.println("-There are not going to be any zeros used in the lottery so only uses ten digit" +
                " numbers containing the numbers 1-9");
        System.out.println("-You will start with $100, each ticket will cost $10, with money being " +
                "carried over through out the lotteries you want to partake in");
        System.out.println("-The way the lottery payout works is as follows:");
        System.out.println("    -For each number that is in the correct corresponding place a point will be given.");
        System.out.println("    -Then the points will be converted into money with the following " +
                "operation, 3 ^ (points - 1 ");
        System.out.println("    -Finally, if every digit is guessed correctly, there will be " +
                "a payout of 1 billion dollars");
        System.out.println();
        System.out.print("So how many lottery tickets do you want to buy?");
        int amountOfTickets = scanner.nextInt();


    }
}