package Complex;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ComplexNumbersTest {
    @Test
    void testAbs() {

    }

    @Test
    void testComplexNumberStringExtraction() {

    }

    @Test
    void testConjugate() {

    }

    @Test
    void testMinus() {

    }

    @Test
    void testNegate() {

    }

    @Test
    void testPlusTwoZeros() {
        Numbers zeroComplex1 = new Numbers();
        Numbers zeroComplex2 = new Numbers();
        assertEquals("0 + 0i", zeroComplex1.plus(zeroComplex2));

    }
}
