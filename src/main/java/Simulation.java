import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Simulation {

    private int numOfDice;
    private int tosses;
    private Dice diceInstance;
    private Bins binInstance;



    public Simulation(int numOfDice, int numOfTosses){
        this.numOfDice = numOfDice;
        this.tosses = numOfTosses;
        this.diceInstance = new Dice(numOfDice);
        this.binInstance = new Bins(numOfDice, numOfDice*6);

    }


    public void runSimulation(){

        for(int i = 0; i <= tosses; i++){
          int bin =  this.diceInstance.tossAndSum();
          binInstance.incrementBins(bin);
        }


    }

   public void printResults(){

       System.out.println("Simulation of " + numOfDice + " dice tossed for " + tosses +" times.");
       for (int i=numOfDice; i<=numOfDice*6; i++)
       {
           System.out.println(String.format("%2s %1s %8s %1s %.2f %s", i , ":" , binInstance.getBin(i), ":" ,
                   (double)binInstance.getBin(i)/tosses, starCount((int)binInstance.getBin(i)*100/tosses)));
       }


    }

    //print in console
    public String starCount(int numberInBin)
    {
        String stars = "";
        for (int j=1; j<=numberInBin; j++){
            stars += "*";
        }
        return stars;
    }

    public void saveToFile() throws FileNotFoundException {
        PrintStream file = new PrintStream(new File("pompyResults.md"));
        System.setOut(file);
        StringBuilder results = new StringBuilder();

        results.append("--- Simulation of " + this.numOfDice + " dice tossed for " + tosses + " ---\n");

        for (int bin : binInstance.results.keySet()) {
            int value = binInstance.results.get(bin);
            results.append(String.format("%3d : %8d : %4.2f ", bin, value, ((double) value / (double) this.tosses)));
            int stars = (int) Math.floor((double) (value / (this.tosses / 100)));
            results.append(numberOfStars("*", stars) + "\n");
        }
        System.out.println(results);
    }


    public String numberOfStars(String stringToRepeat, int numberOfTimes) {
        String returnString = "";
        for (int i = 0; i < numberOfTimes; i++) {
            returnString += stringToRepeat;
        }
        return returnString;
    }


}
