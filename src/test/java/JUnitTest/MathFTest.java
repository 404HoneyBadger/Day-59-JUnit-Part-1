package JUnitTest;
import JUnitMathFunctions.MathFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathFTest {
    MathFunctions maths = new MathFunctions();

    @Test
    void division(){
        assertEquals(3, maths.divideMethod(6,2));
    }
    @Test
    void multiplication(){
        assertEquals(12, maths.multiplication(new int[]{2,2,3}));
    }
    @Test
    void methodReturn(){
        assertEquals("String of text!", maths.string());
        assertEquals(5, maths.num(5));
        assertEquals(false,maths.boo(true));
    }
    @Test
    void countTo11(){
        assertEquals(12,maths.countToEleven());
    }

}
