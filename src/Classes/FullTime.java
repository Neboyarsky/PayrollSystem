package Classes;

public class FullTime extends Employee{

    private double salary;
    private double overtime;

    double calculatePay() {
        //
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
