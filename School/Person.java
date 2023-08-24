package School;

public class Person {

    private String lastName;
    private String firstName;
    private String address;
    
    public Person(){
        this.lastName = "";
        this.firstName = "";
        this.address = "";
    }

    public Person(String lastName, String firstName, String address){
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

}
