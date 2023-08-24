public class Horse extends Mammal{

    private int age;

    public Horse(String name, double weight, int numLegs, int age){
        super(name, weight, numLegs);
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        if (this ==o){
            return true;
        }
        Horse Horse = (Horse) o; // cast safely after the checks

        return weight == Horse.weight && numLegs == Horse.numLegs;

    }
}
