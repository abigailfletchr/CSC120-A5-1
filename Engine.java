public class Engine {

    // attributes of this engine class
    private FuelType f;
    private double currentFuelLevel;
    private double fuelCapacity;
    
    /**
     *  Engine constructor
     * @param f
     * @param fuelCapacity
     */
    public Engine(FuelType f, double fuelCapacity) {
        this.f = f;
        this.fuelCapacity = fuelCapacity;
        currentFuelLevel = fuelCapacity;
    }

    /**
     * Refills current fuel level to maximum.
     */
    public void refuel() {
        currentFuelLevel = fuelCapacity;
    }


    public void go() {
        currentFuelLevel--;
        if(currentFuelLevel < 1){
            System.out.println("Your current fuel level is zero or below.");
            throw new RuntimeException();
        }else{
            System.out.println("Remaining fuel level: " + currentFuelLevel);
        }
 
    }

    // accessors (getters):

    /**
     * Gets fuel type.
     * @return f
     */
    public FuelType getFuelType(){
        return f;
    }

    /**
     * 
     * @return
     */
    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }

    /**
     * 
     * @return
     */
    public double getCapacity(){
        return fuelCapacity;
    }

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