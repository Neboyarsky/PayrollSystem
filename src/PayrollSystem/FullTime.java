package PayrollSystem;

public class FullTime extends Employee{

    // variables area
    private double salary;
    private double overtime;

    // class constructor
    public FullTime(int id, String name, double sal,
                    double hourAndHalf, Vehicle vehicle){
        super(id, name, vehicle);
        this.overtime = hourAndHalf;
        this.salary = sal;
    }

    // methods area
    public double calculatePay() {

        System.out.println ("Full Time Employee.");
        return (this.getSalary() + this.getOvertime());
    }

    //getter area
    public double getSalary() {
        return salary;
    }

    public double getOvertime() {
        return overtime;
    }

    //setter area
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
