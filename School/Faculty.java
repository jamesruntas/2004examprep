package School;

import java.util.Date;

public class Faculty extends Employee{
    
    private boolean hasTenure; 
    private String rank; 

    public Faculty(){
        super();
        this.hasTenure = false;
        this.rank = "";
    }

    public Faculty(String lastName, String firstName, String address, String department, int IDNumber, Date hireDate, double annualSalary,boolean hasTenure, String rank){
        super(lastName, firstName, address, department, IDNumber, hireDate, annualSalary);
        this.hasTenure = hasTenure;
        this.rank = rank;
    }
}
