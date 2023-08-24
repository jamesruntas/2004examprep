public class Mammal extends Animal{

    protected double weight;
    protected int numLegs;

    public Mammal(String name, double weight, int numLegs){
        super(name);
        this.numLegs = numLegs;
        this.weight = weight;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // check if it's the same object reference
        if (o == null || getClass() != o.getClass()) return false; // check if the object is null or not the same class

        Mammal mammal = (Mammal) o; // cast safely after the checks

        return weight == mammal.weight && numLegs == mammal.numLegs;
    }

}
