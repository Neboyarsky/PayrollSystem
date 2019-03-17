package PayrollSystem;

public class PartTime extends Employee{

    // variables area
    private double rate;
    private double hoursWorked;


    // class constructors
    public PartTime(int id, String name, double rate,
                    double hoursWorked2, Vehicle v1) {
        super(id, name, v1);
        this.rate = rate;
        this.hoursWorked = hoursWorked2;
    }

    // methods area
    public double calculatePay() {

        System.out.println("Part Time Employee.");
        return (this.getRate() * this.getHoursWorked());
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
