public class SecondHandVehicle extends Vehicle{
    private int numberOfOwners;

    public SecondHandVehicle(String make, String model, int year, int numberOfOwners){
        super(make, model, year);
        this.numberOfOwners = numberOfOwners;
    }

    public int getNumberOfOwners(){
        return numberOfOwners;
    }
    public boolean hasMultipleOwners(){
        if (numberOfOwners > 1){
            return true;
        }else
            return false;
    }

    public String getNumberOfWheels() {
        return "2";
    }
}
