import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @org.junit.jupiter.api.Test
    void testFindAbsolute() {
        int number=0;
        int expected=0;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result,expected);
    }
}