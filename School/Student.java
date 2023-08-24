package School;

public class Student extends Person {

    private String degreeProgram; 
    private int studentNumber; 

    public Student(){
        super();
        this.studentNumber = 0;
        this.degreeProgram = "";
    }

    public Student(String lastName, String firstName, String address, String degreeProgram, int studentNumber){
        super(lastName, firstName, address);
        this.studentNumber = studentNumber;
        this.degreeProgram = degreeProgram;
    }


}