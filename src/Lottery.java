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
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int number5;
    private int number6;
    private int number7;
    private int number8;
    private int number9;
    private int number10;






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
    public boolean zeroChecker(int checkedNumber){
        userNumberBreakdown(checkedNumber);
        if (number1 == 0 || number2 == 0 || number3 == 0 || number4 == 0 || number5 == 0 || number6 == 0 ||
                number7 == 0 || number1 == 0 || number1 == 0 || )
    }
    public void userNumberBreakdown (int userNumber) {
        number1 = userNumber % 10;
        number2 = userNumber % 100 - number1;
        number3 = userNumber % 1000 - number1 - number2;
        number4 = userNumber % 10000 - number1 - number2 - number3;
        number5 = userNumber % 100000 - number1 - number2 - number3 - number4;
        number6 = userNumber % 1000000 - number1 - number2 - number3 - number4
                - number5;
        number7 = userNumber % 10000000 - number1 - number2 - number3 - number4
                - number5 - number6;
        number8 = userNumber % 100000000 - number1 - number2 - number3 - number4
                - number5 - number6 - number7;
        number9 = userNumber % 1000000000 - number1 - number2 - number3 - number4
                - number5 - number6 - number7 - number8;
        number10 = userNumber - number1 - number2 - number3 - number4
                - number5 - number6 - number7 - number8 - number9;
    }

}
