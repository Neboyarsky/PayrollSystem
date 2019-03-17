package PayrollSystem;

public class Vehicle {

    // variables area
    private String plateNumber;
    private String colour;

    //constructors area
    public Vehicle (String plateNumber, String colour) {
        this.plateNumber = plateNumber;
        this.colour = colour;
    }

    // getter area
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getColour() {
        return colour;
    }

    //setter area
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
