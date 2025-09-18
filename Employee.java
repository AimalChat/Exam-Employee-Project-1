/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        int legalAgeToDrive = 16;
        boolean canDrive;
        if(age>= legalAgeToDrive){
            system.out.println("Yes, can drive.");
            canDrive = true;
        }else{
            int yearsOfWaiting = legalAgeToDrive - age;
            system.out.println("No cannot drive and needs to wait : " 
            + yearsOfWaiting + " years");
            canDrive = false;
        }
        return canDrive;
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        int roughSalary;
        int taxRate;
        int taxes;
        int netPay;
        roughSalary = unpaidHours * hourlyWage;
        taxRate = 30/100;
        taxes = roughSalary * taxRate;
        netPay = roughSalary - taxes;
        return netPay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        int paidSalary = calculatePay();
        system.out.println(fullname + " has recieved a wire transfer of " + 
        paidSalary + " $CAD");
        unpaidHours = 0;
    }
}
