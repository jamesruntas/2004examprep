package Complex;


public class Numbers implements Complex {

    public String complexNumber;
    public int a;
    public int b;
    public Numbers(){
        this.complexNumber = "0 + 0i";
        a = 0;
        b = 0;

    }

    // Constructs a complex number equal to a + bi. 
    // a and b can be negative or positive. 
    public Numbers(double a, double b){
        this.complexNumber = a + " + " + b + "i"; 


    }

    // Returns the absolute value of this complex number, which is defined as: 
    // sqrt(a*a + b*b) 
    @Override
    public double abs() {
        complexNumberStringExtraction();

        return (Math.sqrt((a*a) + (b*b)));

    }


    @Override
    public Complex conjugate() {
        if(complexNumber.contains("+")){
            complexNumber.replace('+', '-');
        }
        else{
        complexNumber.replace('-', '+');
        }
    
        complexNumberStringExtraction();
        return this;
    }
    
    @Override
    public Complex minus(Complex otherComplex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minus'");
    }
    @Override
    public Complex negate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'negate'");
    }
    @Override
    public Complex plus(Complex otherComplex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plus'");
    }


    public void complexNumberStringExtraction(){
        int a1 = 0;
        int b1 = 0;
        char[] complexCharArray = this.complexNumber.toCharArray();
        for (int i = 0; i<complexCharArray.length ; i++){
            if (complexCharArray[i] == ' '){
                for (int j = i+2; j<complexCharArray.length; j++){
                    b1+=(int)complexCharArray[j];
                    if(complexCharArray[j] =='i'){
                        this.a = a1;
                        this.b = b1;
                        break;
                    }
                }
            }
            a1+=(int)complexCharArray[i];
        }
    
    }
     
}
