public class Vehicle {

    private String regNO;
    private String make;
    private int yearofManufacture;
    private double value;

    public Vehicle(String regNO, String make, Integer yearofManufacture) {
        this.regNO = regNO;
        this.make = make;
        this.yearofManufacture = yearofManufacture;
        this.value = value;
    }

    public String getRegNO() {
        return regNO;
    }

    public String getMake() {
        return make;
    }

    public Integer getYearofManufacture() {
        return yearofManufacture;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int calculateAge(int currentYear){
        return currentYear - yearofManufacture;

    }

    public String getRegNo() {
        return regNO;
    }

    public int getId() {
        int id = 0;
        return id;
    }
}

