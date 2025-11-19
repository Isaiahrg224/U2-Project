public class Lottery {
    private int lotteryNumber;
    private int lotteryNumber1;
    private int lotteryNumber2;
    private int lotteryNumber3;
    private int lotteryNumber4;
    private int lotteryNumber5;
    private int lotteryNumber6;
    private int lotteryNumber7;
    private int lotteryNumber8;
    private int lotteryNumber9;
    private int lotteryNumber10;
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
        lotteryNumber10 = (int) (Math.random() * 10 + 1) * 1000000000;
        lotteryNumber = lotteryNumber1 + lotteryNumber2 + lotteryNumber3 + lotteryNumber4 +
                lotteryNumber5 + lotteryNumber6 + lotteryNumber7 + lotteryNumber8 +
                lotteryNumber9 + lotteryNumber10;
    }
    public static boolean zeroChecker(int checkedNumber){
        if (digitExtractor(checkedNumber, 1) == 0 || digitExtractor(checkedNumber, 2) == 0 ||
                digitExtractor(checkedNumber, 3) == 0 ||
                digitExtractor(checkedNumber, 4) == 0 ||
                digitExtractor(checkedNumber, 5) == 0 ||
                digitExtractor(checkedNumber, 6) == 0 ||
                digitExtractor(checkedNumber, 7) == 0 ||
                digitExtractor(checkedNumber, 8) == 0 ||
                digitExtractor(checkedNumber, 9) == 0 ||
                digitExtractor(checkedNumber, 10) == 0) {
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

    public void scoreCalculator (int userNumber) {
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
        if (digitExtractor(userNumber, 10) == lotteryNumber10){
            scoreModifier += 1;
        }
        payout = (int )Math.pow(3, scoreModifier - 1);
        if (userNumber == lotteryNumber) {
            scoreModifier = 100000000;
        }
    }

}
