import java.util.ArrayList;

/**
 * The Car class that contains methods and constructor for a train car.
 */
public class Car {

    // attributes of Car class
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * The constructor for the Car class. Creates the blueprint for the train cars.
     * @param passengers Array List that contains the names of the passengers on board.
     * @param maxCapacity the maximum capacity of passengers
     */
    public Car(ArrayList<Passenger> passengers, int maxCapacity) {
        this.passengers = passengers;
        this.maxCapacity = maxCapacity;
    }

    // accessors

    /**
     * Gets the maximum capacity of passengers.
     * @return maxCapacity
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * Gets the remaining seats.
     * @return maxCapacity - passengers.size()
     */
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    /**
     * Adds the passenger to the train car if there are seats remaining.
     * @param p the specific passenger
     */
    public void addPassenger(Passenger p) {
        if(seatsRemaining() > 0){
            passengers.add(p);
        }
    }

    /**
     * Removes the passenger from the train car if the passenger is on board.
     * @param p the specific passenger
     */
    public void removePassenger(Passenger p) {
        if(passengers.contains(p)){
            passengers.remove(p);
        }else{
            throw new RuntimeException();
        }
    }

    /**
     * Prints the manifest of passengers on the train cars.
     */
    public void printManifest() {
        if(passengers.size() < 1){
            System.out.println("This car is EMPTY.");
        }else{
            for(Passenger p : passengers){
                System.out.println(p);
            }
        }
    }



}