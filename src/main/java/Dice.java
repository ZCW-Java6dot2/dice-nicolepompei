import java.util.Random;

public class Dice {
    private Integer numOfDice;

    public Dice(Integer numOfDice){
        this.numOfDice = numOfDice;
    }

    public Integer getNumOfDice() {
        return numOfDice;
    }

    public Integer tossAndSum(){

        Integer sumOfTosses = 0;

        for(int i = 0; i < numOfDice; i++){

            Random toss = new Random();
            Integer resultsOfToss = toss.nextInt(6) + 1;
            sumOfTosses += resultsOfToss;
        }
        return sumOfTosses;

    }
}
