/**
 * The Passenger class that contains methods and the constructor for the passenger.
 */
public class Passenger {
    
    // attributes of Passenger class.
    
    private String name;

    /**
     * The Passenger constructor.
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Adds the passenger to the specific train car. The program will catch the error if the train car is full.
     * @param c the specific train car
     */
    public void boardCar(Car c) {
        try{
            c.addPassenger(this);
        }catch(Exception e){
            System.out.println("Could not board car. It's full.");
            System.out.println(e.getStackTrace());
        }
    }

    /**
     * Removes the passenger to the specific train car. The program will catch if the passenger was never on the car.
     * @param c the specific train car
     */
    public void getOffCar(Car c) {
        try{
            c.removePassenger(this);
        }catch(Exception e){
            System.out.println("Passenger was never on board. Oops.");
            System.out.println(e.getStackTrace());
        }
    }
}
