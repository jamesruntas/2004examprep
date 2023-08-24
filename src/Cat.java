public class Cat extends Mammal{

    private String colour;

    public Cat(String name, double weight, int numLegs, String colour){
        super(name,weight,numLegs);
        this.colour = colour;
    }

    @Override
    public String toString(){
        return("this cat is a " + this.colour + " " + super.toString() + "\n It has " + this.numLegs + " legs, and weighs " + this.weight);
    }
}
