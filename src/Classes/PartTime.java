package Classes;

public class PartTime extends Employee{

    private double rate;
    private double hoursWorked;

    public double calculatePay() {

    }

    //getter area
    public double getRate() {
        return rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    //setter area
    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
