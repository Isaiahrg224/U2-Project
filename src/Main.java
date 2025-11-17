import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Grand Lottery");
        System.out.println("The rules to this lottery are as follows:");
        System.out.println("-The Lottery is 10 digits, so only guess that many");
        System.out.println("-If the you are asked a yes or no question answer with either yes, no, y, or n");
        System.out.println("-For each lottery ticket you purchase you will be asked for what" +
                " numbers you want for it respond with either 10 digits, or if you want it randomized, respond " +
                "with r or random");
        System.out.println();
        System.out.print("How many lottery tickets do you want to buy?");
        int amountOfTickets = scanner.nextInt();


    }
}