import java.util.Scanner;
public class Lottery {
    Scanner scanner = new Scanner(System.in);
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
//    private int number1;
//    private int number2;
//    private int number3;
//    private int number4;
//    private int number5;
//    private int number6;
//    private int number7;
//    private int number8;
//    private int number9;
//    private int number10;






    public void runLottery() {
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
                lotteryNumber5 + lotteryNumber6 + lotteryNumber7 + lotteryNumber8 +
                lotteryNumber9;
    }
    public static boolean zeroChecker(int checkedNumber){
        if (digitExtractor(checkedNumber, 1) == 0 || digitExtractor(checkedNumber, 2) == 0 ||
                digitExtractor(checkedNumber, 3) == 0 ||
                digitExtractor(checkedNumber, 4) == 0 ||
                digitExtractor(checkedNumber, 5) == 0 ||
                digitExtractor(checkedNumber, 6) == 0 ||
                digitExtractor(checkedNumber, 7) == 0 ||
                digitExtractor(checkedNumber, 8) == 0 ||
                digitExtractor(checkedNumber, 9) == 0)
        {
            return true;
        }
        return false;
    }

    public static int digitExtractor (int userNumber, int digitPlacement) {
        //Digit placement refers to the digits placement in the number, for instance 3 in the number 65432165 would be 1
        int returnNumber = (userNumber % ((int)(Math.pow(10, digitPlacement)))
                / ((int)(Math.pow(10, digitPlacement - 1))) * ((int) (Math.pow(10, digitPlacement - 1))));
         return (returnNumber);
    }

    public int scoreCalculator (int userNumber) {
        int scoreModifier = 0;
        int payout;

       if (digitExtractor(userNumber, 1) == lotteryNumber1) {
           scoreModifier += 1;
       }
       if (digitExtractor(userNumber, 2) == lotteryNumber2){
           scoreModifier += 1;
       }
        if (digitExtractor(userNumber, 3) == lotteryNumber3){
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 4) == lotteryNumber4){
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 5) == lotteryNumber5){
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 6) == lotteryNumber6){
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 6) == lotteryNumber6){
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 6) == lotteryNumber6){
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 7) == lotteryNumber7){
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 8) == lotteryNumber8){
            scoreModifier += 1;
        }
        if (digitExtractor(userNumber, 9) == lotteryNumber9){
            scoreModifier += 1;
        }
        payout = (int )Math.pow(3, scoreModifier - 1);
        if (userNumber == lotteryNumber) {
            payout = 10000000;
        }
        return payout;
    }
    public void lottertyRepetitons (int amountOfTickets) {
        runLottery();
        for (int i = 1; i <= amountOfTickets; i++) {
            int score = 0;
            System.out.println("For this ticket what lottery number do you want purchase?");
            String inputTicket = scanner.nextLine();
            int ticketNumber;
            if (inputTicket == "r")
            {
               ticketNumber = (int) (Math.random() * 10 + 1) + (int) (Math.random() * 10 + 1) * 10
                       + (int) (Math.random() * 10 + 1) * 100 + (int) (Math.random() * 10 + 1) * 1000
                       + (int) (Math.random() * 10 + 1) * 10000 + (int) (Math.random() * 10 + 1) * 100000
                       + (int) (Math.random() * 10 + 1) * 1000000 + (int) (Math.random() * 10 + 1) * 10000000
                       + (int) (Math.random() * 10 + 1) * 100000000;
                score += scoreCalculator(ticketNumber);
        }
        else if (Integer.parseInt(inputTicket) <= 999999999 && zeroChecker(Integer.parseInt(inputTicket))){
            ticketNumber = Integer.parseInt(inputTicket);
                score += scoreCalculator(ticketNumber);
            }
        else {
                System.out.println("Invalid number response try again");
                i = i -1;
            }

    }

}
}
