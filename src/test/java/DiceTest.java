
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;


public class DiceTest {

    @Test
    public void diceConstructorTest() {
        Integer expectedNumOfDice = 2;

        Dice dice = new Dice(expectedNumOfDice);

        Integer actualNumOfDice = dice.getNumOfDice();

        Assert.assertEquals(expectedNumOfDice, actualNumOfDice);
    }


    @Test
    //toss x # of dice y times and sum the results of the dice tosses
    public void tossAndSumTest() {

        Dice diceInstance = new Dice(1);
        Integer actual = diceInstance.tossAndSum(5);
        Integer expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tossAndSumTest2() {

        Dice diceInstance = new Dice(2);
        Integer toss = diceInstance.tossAndSum();
        boolean actual;
        boolean expected = true;

        if (toss > 12 || toss < 2) {
            actual = false;
        } else {
            actual = true;
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tossAndSumTest3(){
        Dice diceInstance = new Dice(3);
        Integer toss = diceInstance.tossAndSum();
        boolean actual;
        boolean expected = true;

        if(toss > 18 || toss < 3){
            actual = false;
        } else{
            actual = true;
        }

        Assert.assertEquals(expected, actual);
    }
}





