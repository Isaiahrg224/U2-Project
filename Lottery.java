import java.util.Scanner;
public class Lottery {

    public int lotteryNumber;
    public int lotteryNumber1;
    public int lotteryNumber2;
    public int lotteryNumber3;
    public int lotteryNumber4;
    public int lotteryNumber5;
    public int lotteryNumber6;
    public int lotteryNumber7;
    public int lotteryNumber8;
    public int lotteryNumber9;


    public Lottery() {

        lotteryNumber1 = (int) (Math.random() * 10 + 1);
        lotteryNumber2 = (int) (Math.random() * 10 + 1) * 10;
        lotteryNumber3 = (int) (Math.random() * 10 + 1) * 100;
        lotteryNumber4 = (int) (Math.random() * 10 + 1) * 1000;
        lotteryNumber5 = (int) (Math.random() * 10 + 1) * 10000;
        lotteryNumber6 = (int) (Math.random() * 10 + 1) * 100000;
        lotteryNumber7 = (int) (Math.random() * 10 + 1) * 1000000;
        lotteryNumber8 = (int) (Math.random() * 10 + 1) * 10000000;
        lotteryNumber9 = (int) (Math.random() * 10 + 1) * 100000000;
        lotteryNumber = lotteryNumber1 + lotteryNumber2 + lotteryNumber3 + lotteryNumber4 +
                lotteryNumber5 + lotteryNumber6 + lotteryNumber7 + lotteryNumber8 + lotteryNumber9;
//        lotteryNumber = 999999999;
//        lotteryNumber1 = 9;
//        lotteryNumber3 = 90;
//        lotteryNumber4 = 900;
//        lotteryNumber5 = 9000;
//        lotteryNumber6 = 90000;
//        lotteryNumber7 = 900000;
//        lotteryNumber8 = 9000000;
//        lotteryNumber9 = 90000000;
//        this.lotteryNumber = lotteryNumber;
//        this.lotteryNumber1 = lotteryNumber1;
//        this.lotteryNumber2 = lotteryNumber2;
//        this.lotteryNumber3 = lotteryNumber3;
//        this.lotteryNumber4 = lotteryNumber4;
//        this.lotteryNumber5 = lotteryNumber5;
//        this.lotteryNumber6 = lotteryNumber6;
//        this.lotteryNumber7 = lotteryNumber7;
//        this.lotteryNumber8 = lotteryNumber8;
//        this.lotteryNumber9 = lotteryNumber9;
    }

    public boolean zeroChecker(int checkedNumber) {
        if (digitExtractor(checkedNumber, 1) == 0 || digitExtractor(checkedNumber, 2) == 0 ||
                digitExtractor(checkedNumber, 3) == 0 ||
                digitExtractor(checkedNumber, 4) == 0 ||
                digitExtractor(checkedNumber, 5) == 0 ||
                digitExtractor(checkedNumber, 6) == 0 ||
                digitExtractor(checkedNumber, 7) == 0 ||
                digitExtractor(checkedNumber, 8) == 0 ||
                digitExtractor(checkedNumber, 9) == 0) {
            return true;
        }
        return false;
    }

    public int digitExtractor(int userNumber, int digitPlacement) {
        //Digit placement refers to the digits placement in the number, for instance 3 in the number 65432165 would be 1
        return (userNumber % ((int) (Math.pow(10, digitPlacement)))
                / ((int) (Math.pow(10, digitPlacement - 1))) * ((int) (Math.pow(10, digitPlacement - 1))));
//        String userNumberString = userNumber + "";
//        int extractedDigit = Integer.parseInt(userNumberString.substring(digitPlacement - 1, digitPlacement));
    }

    public int scoreCalculator(int userNumber) {
        int scoreModifier = 0;
        int payout;

        if (digitExtractor(userNumber, 1) == lotteryNumber1) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 2) == lotteryNumber2) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 3) == lotteryNumber3) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 4) == lotteryNumber4) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 5) == lotteryNumber5) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 6) == lotteryNumber6) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 6) == lotteryNumber6) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 6) == lotteryNumber6) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 7) == lotteryNumber7) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 8) == lotteryNumber8) {
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 9) == lotteryNumber9) {
            scoreModifier += 1;
        }
        payout = (int) Math.pow(3, scoreModifier - 1);
        if (userNumber == lotteryNumber) {
            payout = 10000000;
        }
        return payout;
    }

    public int lotteryRunner(int amountOfTickets, int money) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for (int i = 1; i <= amountOfTickets; i++) {
            System.out.println("For this ticket what lottery number do you want purchase?");
            String inputTicket = scanner.nextLine();
            int ticketNumber;
            if (inputTicket.equals("r")) {
                ticketNumber = (int) (Math.random() * 10 + 1) + (int) (Math.random() * 10 + 1) * 10
                        + (int) (Math.random() * 10 + 1) * 100 + (int) (Math.random() * 10 + 1) * 1000
                        + (int) (Math.random() * 10 + 1) * 10000 + (int) (Math.random() * 10 + 1) * 100000
                        + (int) (Math.random() * 10 + 1) * 1000000 + (int) (Math.random() * 10 + 1) * 10000000
                        + (int) (Math.random() * 10 + 1) * 100000000;
                score += scoreCalculator(ticketNumber);
                System.out.println("Your random ticket number was: " + ticketNumber);
            } else if (Integer.parseInt(inputTicket) <= 1000000000 && !zeroChecker(Integer.parseInt(inputTicket))) {
                ticketNumber = Integer.parseInt(inputTicket);
                score += scoreCalculator(ticketNumber);

            } else {
                System.out.println("Invalid number response try again");
                i = i - 1;
            }
        }
        int profit = score - (amountOfTickets * 10);
        money += profit;
        System.out.println("From all your tickets you made: $" + score + " giving you a profit of: " + profit +
                " dollars as the lottery number was: " + lotteryNumber);
        System.out.println("This means you currently have " + money + " dollars.");
        return (money);
    }

    public static void lotteryRepeater() {
//        import java.util.Scanner;
        int money = 100;
        Scanner scanner = new Scanner(System.in);
        int wantsToContinue = 1;
        while (wantsToContinue == 1) {
            System.out.print("So how many lottery tickets do you want to buy?");
            int amountOfTickets = scanner.nextInt();
            Lottery Lottery = new Lottery();
            money = Lottery.lotteryRunner(amountOfTickets, money);
            System.out.print("Do you want to continue the lottery?");
            String userWantsToContinue = "";
            wantsToContinue = 3;
            for (int i = 0; wantsToContinue == 3; i++) {
                userWantsToContinue = scanner.nextLine();
                if (userWantsToContinue.equals("y") || userWantsToContinue.equals("yes")) {
                    wantsToContinue = 1;
                } else if (userWantsToContinue.equals("n") || userWantsToContinue.equals("no")) {
                    wantsToContinue = 2;
                } else {
                    System.out.println("Invalid response, make sure to respond with either y or yes if you want to continue"
                            + "\n or, n or no if you don't");
                    i -= 1;
                }
            }

        }
    }
}
