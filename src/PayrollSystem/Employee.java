package PayrollSystem;

public abstract class Employee {

    // variables area
    private int empId;
    private String name;
    private Vehicle vehicle;

    // methods area
    /**
     * will be defined within FullTime and PartTime classes
     * as these both classes are subclasses of Employee (abstract) class
     */
    public abstract double calculatePay() ;

    public Employee(int id, String name, Vehicle vehicle) {
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