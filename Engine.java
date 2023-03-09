/**
 * Engine class that contains methods and the constructor for the engine.
 */
public class Engine {

    // attributes of Engine class
    private FuelType f;
    private double currentFuelLevel;
    private double fuelCapacity;
    
    /**
     *  The constructor for the Engine class. Creates a blueprint for an engine.
     * @param f the fuel type from class FuelType
     * @param fuelCapacity  the maximum fuel capacity for the engine
     */
    public Engine(FuelType f, double fuelCapacity) {
        this.f = f;
        this.fuelCapacity = fuelCapacity;
        currentFuelLevel = fuelCapacity;
    }

    /**
     * Refills current fuel level to maximum fuel capacity.
     */
    public void refuel() {
        currentFuelLevel = fuelCapacity;
    }

    /**
     * Decreases the fuel level in the engine and prints current fuel level.
     */
    public void go() {
        currentFuelLevel--;
        if(currentFuelLevel < 1){
            System.out.println("Your current fuel level is zero or below.");
            throw new RuntimeException();
        }else{
            System.out.println("Remaining fuel level: " + currentFuelLevel);
        }
 
    }

    // The accessors

    /**
     * Gets fuel type.
     * @return f 
     */
    public FuelType getFuelType(){
        return f;
    }

    /**
     * Gets current fuel level.
     * @return currentFuelLevel 
     */
    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }

    /**
     * Gets maximum fuel capacity.
     * @return fuelCapacity
     */
    public double getCapacity(){
        return fuelCapacity;
    }


    // main for testing

    // public static void main(String[] args) {
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    //     try {
    //         while (true) {
    //             myEngine.go();
    //         }
    //     } catch (Exception e) {
    //         System.err.println(e.getMessage()); // Out of fuel
    //     }
    // }

}