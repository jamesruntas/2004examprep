package School;

import java.util.Date;

public class Staff extends Employee{
    
    private int level; 

    public Staff(){
        super();
        this.level = 0;
    }

    public Staff(String lastName, String firstName, String address, String department, int IDNumber, Date hireDate, double annualSalary,int level){
        super(lastName, firstName, address, department, IDNumber, hireDate, annualSalary);
        this.level = level;
    }
}
