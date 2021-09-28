import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @org.junit.jupiter.api.Test
    void test1FindAbsolute() {
        int number=0;
        int expected=0;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result,expected);
    }
    @org.junit.jupiter.api.Test
    void test2FindAbsolute() {
        int number=1;
        int expected=1;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result,expected);
    }
    @org.junit.jupiter.api.Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }


}