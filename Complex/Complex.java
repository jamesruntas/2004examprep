package Complex;

public interface Complex {


public double abs(); 
// Returns the conjugate of this complex number; e.g., if this complex number 
// is a + bi, returns a new complex number equal to a - bi. 
// (Note that the conjugate of complex number z is written as z*.) 
public Complex conjugate(); 
// Returns true if this complex number equals its argument, obj; otherwise 
// returns false. 
public boolean equals(Object obj); 
// Returns the difference between this complex number and otherComplex; e.g., 
// if this complex number is a + bi and otherComplex is c + di, returns a 
// new complex number equal to (a-c) + (b-d)i. 
public Complex minus(Complex otherComplex); 
// Returns the negation of this complex number; e.g., if this complex number 
// is a + bi, returns a new complex number equal to -(a + bi) == -a - bi. 
// (Note that the negation of complex number z is written as –z.) 
public Complex negate(); 
// Returns the sum of this complex number and otherComplex; e.g., if this 
// complex number is a + bi and otherComplex is c + di, returns a new complex 
// number equal to (a+c) + (b+d)i. 
public Complex plus(Complex otherComplex);
    
}
