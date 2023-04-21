public class Teste {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Lamburguini","Metal",1966);
        System.out.println("RegNO:  " + vehicle.getRegNo());
        System.out.println("Make:  " + vehicle.getMake());
        System.out.println("yearofManufacture: " + vehicle.getYearofManufacture());
        System.out.println("Value:  " + vehicle.getValue());


        SecondHandVehicle secondHandVehicle = new SecondHandVehicle("Toyota", "Camry", 2012, 2);
        System.out.println("RegNO:  " + vehicle.getRegNo());
        System.out.println("Make:  " + vehicle.getMake());
        System.out.println("yearofManufacture: " + vehicle.getYearofManufacture());
        System.out.println("Value:  " + vehicle.getValue());
        System.out.println("NumberOfWheels: " + secondHandVehicle.getNumberOfWheels());
        System.out.println("Has multiple owners?" + secondHandVehicle.hasMultipleOwners());
    }
}

