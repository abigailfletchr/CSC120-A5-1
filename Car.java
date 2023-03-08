import java.util.ArrayList;

public class Car {

    // attributes
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * Car constructor
     * @param passengers
     * @param maxCapacity
     */
    public Car(ArrayList<Passenger> passengers, int maxCapacity) {
        this.passengers = passengers;
        this.maxCapacity = maxCapacity;
    }

    public int getCapacity() {
        return maxCapacity;
    }

    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    public void addPassenger(Passenger p) {
        if(seatsRemaining() > 0){
            passengers.add(p);
        }
    }

    /**
     * 
     * @param p
     */
    public void removePassenger(Passenger p) {
        if(passengers.contains(p)){
            passengers.remove(p);
        }else{
            throw new RuntimeException();
        }
    }

    /**
     * 
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