package School;

import java.util.Date;

public class Employee extends Person{

    private String department;
    private Date hireDate;
    private int IDNumber;
    private double annualSalary;


    public Employee(){
        super();
        this.IDNumber = 0;
        this.annualSalary = 0;
        this.department = "";
        this.hireDate = new Date();
    }

    public Employee(String lastName, String firstName, String address, String department, int IDNumber, Date hireDate, double annualSalary){
        super(lastName, firstName, address);
        this.IDNumber = IDNumber;
        this.annualSalary = annualSalary;
        this.department = department;
        this.hireDate = new Date();
    }
}
