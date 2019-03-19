package PayrollSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        ArrayList<Employee> arrEmp = new ArrayList<Employee>();
        String varCount = "N";
        byte menuOption = 0;
        do {
            menuOption = showMenu();

            switch (menuOption) {
                case 1:
                    FullTime ft = readNewFullTime();
                    addEmployee(arrEmp, ft);
                    break;
                case 2:
                    PartTime pt = readNewPartTime();
                    addEmployee(arrEmp, pt);
                    break;
                case 3:
                    calcPayroll (arrEmp);
                    break;
                default:
                    break;
            }//end of switch
        }while (menuOption != 4);
    }

    public static FullTime readNewFullTime() {
        int id = 0;
        String name = null;
        double sal = 0.0;
        double hourAndHalf = 0.0; //overtime
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter Id: ");
        id = kbd.nextInt();
        System.out.print("\nEnter Name: ");
        name = kbd.next();
        System.out.print("\nEnter Salary: ");
        sal = kbd.nextDouble();
        System.out.print("\nEnter Bonus: ");
        hourAndHalf = kbd.nextDouble();

        FullTime ft1 = null;
        ft1 = new FullTime(id, name, sal, hourAndHalf, getVehicle());

        return ft1;
    } // end of readNewFullTime

    public static PartTime readNewPartTime () {
        int id = 0;
        String name = null;
        double rate = 0.0;
        double hoursWorked = 0.0;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter Id: ");                         id = kbd.nextInt();
        System.out.print("\nEnter Name: ");                     name = kbd.next();
        System.out.print("\nEnter Hourly Rate: ");              rate = kbd.nextDouble();
        System.out.print("\nEnter Number of Hours Worked: ");   hoursWorked = kbd.nextDouble();

        Vehicle v1 = getVehicle();
        PartTime pt1 = null;
        pt1 = new PartTime(id, name, rate, hoursWorked, v1);

        return pt1;
    } // end of ReadNewPartRTime

    public static byte showMenu () {
        byte menuOption = 0;
        Scanner kbd = new Scanner(System.in);

        System.out.println(""
                + "/* *******************************************/"
                + "\n/* 1. Add FullTime Employee                *"
                + "\n/* 2. Add PartTime Employee                *"
                + "\n/* 3. Calculate Payroll                    *"
                + "\n/* 4. Exit                                 *"
                + "\n/* *****************************************");
        System.out.print("Input: ");    menuOption = kbd.nextByte();

        return menuOption;
    } // end of showMenu

    public static Vehicle getVehicle() {
        Scanner kbd = new Scanner(System.in);
        String hasVehicle = "N";

        System.out.print("\nDoes this employee hava a vehicle? Y/N: \nInput: ");
        hasVehicle = kbd.next();

        if (hasVehicle.equalsIgnoreCase("Y")) {
            System.out.print("\nEnter plate number: "); String auxPlate = kbd.next();
            System.out.print("\nEnter vehicle colour: "); String auxColour = kbd.next();
            return (new Vehicle(auxPlate, auxColour));
        }
        else {
            return (null);
        }
    }

    public static void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp) {
        pArrEmp.add(pEmp);
    }

    public static void calcPayroll(ArrayList<Employee> pArrEmp) {
        double totalCompanyPay = 0.0;
        double individualPay;

        //calculating salary - manipulating array only
        for (int i = 0; i<pArrEmp.size(); i++) {
            System.out.println("\n**************************\n");
            individualPay = (pArrEmp.get(i)).calculatePay();
            Vehicle v = (pArrEmp.get(i)).getVehicle();
            String hasVehicle;

            //check if employee has a vehicle or not
            if (v == null)
                hasVehicle = "No";
            else
                hasVehicle = "Yes";

            System.out.println("Employee Name: " + (pArrEmp).get(i).getName());
            System.out.println("Has Vehicle: " + hasVehicle);

            if (v != null) {
                System.out.println("Plate Number: " + v.getPlateNumber());
                System.out.println("Colour: " + v.getColour());
            }

            System.out.println("Take Home Pay: " + individualPay);

            totalCompanyPay = totalCompanyPay + individualPay;
        }
        System.out.print("-------------------------\nTotal payroll of the company: " + totalCompanyPay + "\n-------------------------");
    }
}