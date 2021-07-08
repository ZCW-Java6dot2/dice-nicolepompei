import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Simulation simulation = new Simulation(2, 1000000);

        simulation.runSimulation();

       // simulation.printResults();

        simulation.saveToFile();


    }
}
