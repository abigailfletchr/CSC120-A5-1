import java.util.ArrayList;

/**
 * The Train class. Contains methods and constructor of the Train.
 */
public class Train {

    // attributes of Train class.

    private final Engine engine;
    private ArrayList<Car> trainCars;

    /**
     * The Train constructor.
     * @param f the fuel type from class FuelType
     * @param fuelCapacity the maximum fuel capacity
     * @param nCars the specific number train car
     * @param passengerCapacity the maximum passenger capacity
     */
    public Train(FuelType f, double fuelCapacity, int nCars, int passengerCapacity){
        engine = new Engine(f, fuelCapacity);
        trainCars = new ArrayList<Car>();

        for(int i = 0; i < nCars; i++){
            Car c = new Car(new ArrayList<Passenger>(), passengerCapacity);
            trainCars.add(c);
        }
    }

    // accessors

    /**
     * "Gets", makes an engine from class Engine.
     * @return engine
     */
    public Engine getEngine(){
        return engine;
    }

    /**
     * Gets specific train car
     * @param c specific train car
     * @return trainCars.get(c)
     */
    public Car getCar(int c){
        return trainCars.get(c);
    }

    /**
     * Gets the maxiumum capacity across all train cars.
     * @return maxCapacity
     */
    public int getMaxCapacity(){
        int maxCapacity = 0;
        for(int i = 0; i < trainCars.size(); i++){
            maxCapacity += trainCars.get(i).getCapacity();
        }
        return maxCapacity;
    }

    /**
     * Gets the total remaining seats across all train cars.
     * @return seatsRem
     */
    public int seatsRemaining(){
        int seatsRem = 0;
        for(int i = 0; i < trainCars.size(); i++){
            seatsRem += trainCars.get(i).seatsRemaining();
        }
        return seatsRem;
    }

    /**
     * Prints the total passenger manifest across all train cars.
     */
    public void printManifest(){
        for(int i = 0; i < trainCars.size(); i++){
            trainCars.get(i).printManifest();
        }
    }

}
