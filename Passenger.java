public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c) {
        try{
            c.addPassenger(this);
        }catch(Exception e){
            System.out.println("Could not board car. It's full.");
            System.out.println(e.getStackTrace());
        }
    }

    public void getOffCar(Car c) {
        try{
            c.removePassenger(this);
        }catch(Exception e){
            System.out.println("Passenger was never on board. Oops.");
            System.out.println(e.getStackTrace());
        }
    }
}
