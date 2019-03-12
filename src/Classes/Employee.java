package Classes;

public abstract class Employee {
    // class variables
    private int empId;
    private String name;
    private Vehicle vehicle;

    public calculatePay() {
        //added at weeek 2
    }

    //getter area
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //setter area
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}