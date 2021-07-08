import java.util.HashMap;

public class Bins {
    private int startingBin = 0;
    private int endingBin = 0;
    private int binNum = 0;

    public HashMap<Integer, Integer> results;



    public Bins(int startingBin, int endingBin){

        this.startingBin = startingBin;
        this.endingBin = endingBin;

        this.results = new HashMap<Integer, Integer>();

        for(int i = startingBin; i <= endingBin; i++){
            this.results.put(i,0);
        }

    }

    public void incrementBins(int binNum){
        this.binNum = binNum;
        this.results.put(binNum, this.results.get(binNum) + 1);

    }

    public int getBin(int bin){
        return this.results.get(bin);
    }

}
