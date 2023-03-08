import java.util.ArrayList;

public class Train {

    private final Engine engine;
    private ArrayList<Car> trainCars;

    /**
     * 
     * @param f
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType f, double fuelCapacity, int nCars, int passengerCapacity){
        engine = new Engine(f, fuelCapacity);
        trainCars = new ArrayList<Car>();

        for(int i = 0; i < nCars; i++){
            Car c = new Car(new ArrayList<Passenger>(), passengerCapacity);
            trainCars.add(c);
        }
    }

    public Engine getEngine(){
        return engine;
    }

    public Car getCar(int c){
        return trainCars.get(c);
    }

    public int getMaxCapacity(){
        int maxCapacity = 0;
        for(int i = 0; i < trainCars.size(); i++){
            maxCapacity += trainCars.get(i).getCapacity();
        }
        return maxCapacity;
    }

    public int seatsRemaining(){
        int seatsRem = 0;
        for(int i = 0; i < trainCars.size(); i++){
            seatsRem += trainCars.get(i).seatsRemaining();
        }
        return seatsRem;
    }

    public void printManifest(){
        for(int i = 0; i < trainCars.size(); i++){
            trainCars.get(i).printManifest();
        }
    }

}
