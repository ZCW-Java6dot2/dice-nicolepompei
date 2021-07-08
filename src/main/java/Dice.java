import java.util.Random;

public class Dice {
    private int numOfDice;

    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
    }

    public int getNumOfDice() {
        return numOfDice;
    }

    public int tossAndSum(){

        int sumOfTosses = 0;

        for(int i = 0; i < numOfDice; i++){

            Random toss = new Random();
            int resultsOfToss = toss.nextInt(6) + 1;
            sumOfTosses += resultsOfToss;
        }
        return sumOfTosses;

    }

    public int tossAndSum(int seed){

        int sumOfTosses = 0;

        for(int i = 0; i < numOfDice; i++){

            Random toss = new Random(seed);
            int resultsOfToss = toss.nextInt(6) + 1;
            sumOfTosses += resultsOfToss;
        }
        return sumOfTosses;

    }
}
