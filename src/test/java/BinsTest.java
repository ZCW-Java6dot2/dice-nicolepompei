import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    private Bins binArray;

    @Test
    //empty bin
    public void minBin(){
        Bins emptyBin = new Bins(1, 5);
        Integer actual = emptyBin.getBin(1);

        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    //increment bin by 1

    public void incrementBinBy1(){
        Bins testBin = new Bins(1, 5);
        testBin.incrementBins(1);

        Integer expected = 1;

        Integer actual = testBin.getBin(1);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void incrementBinByMany(){
        Bins testBin = new Bins(1, 5);
        testBin.incrementBins(3);
        testBin.incrementBins(3);
        testBin.incrementBins(3);
        testBin.incrementBins(3);

        Integer expected = 4;

        Integer actual = testBin.getBin(3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binsMax(){
        Bins testBin = new Bins(1, 5);
        Integer expected = 0;

        Integer actual = testBin.getBin(5);

        Assert.assertEquals(expected, actual);
    }

}


