import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void testSumm1() {
        Calc calc = new Calc();
        int actual = calc.summ(15, 10);
        Assertions.assertEquals(25, actual);
    }

    @Test
    public void testSumm2() {
        Calc calc = new Calc();
        double actual = calc.summ(15.5, 10);
        Assertions.assertEquals(25.5, actual);
    }

    @Test
    public void testSumm3() {
        Calc calc = new Calc();
        double actual = calc.summ(15, 10.5);
        Assertions.assertEquals(25.5, actual);
    }

    @Test
    public void testSumm4() {
        Calc calc = new Calc();
        double actual = calc.summ(15.1, 10.1);
        Assertions.assertEquals(25.2, actual);
    }

    @Test
    public void testSumm5() {
        Calc calc = new Calc();
        double actual = calc.summ(-5.5, 10);
        Assertions.assertEquals(4.5, actual);
    }

    @Test
    public void testSumm6() {
        Calc calc = new Calc();
        double actual = calc.summ(-15, -10.5);
        Assertions.assertEquals(-25.5, actual);
    }

    @Test
    public void testSumm7() {
        Calc calc = new Calc();
        double actual = calc.summ(0, 0);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSumm8() {
        Calc calc = new Calc();
        double actual = calc.summ(-1, 1);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSubtract1() {
        Calc calc = new Calc();
        double actual = calc.subtract(15, 10);
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testSubtract2() {
        Calc calc = new Calc();
        double actual = calc.subtract(15.5, 10);
        Assertions.assertEquals(5.5, actual);
    }

    @Test
    public void testSubtract3() {
        Calc calc = new Calc();
        double actual = calc.subtract(15, 9.5);
        Assertions.assertEquals(5.5, actual);
    }

    @Test
    public void testSubtract4() {
        Calc calc = new Calc();
        double actual = calc.subtract(15.5, 10.1);
        Assertions.assertEquals(5.4, actual);
    }

    @Test
    public void testSubtract5() {
        Calc calc = new Calc();
        double actual = calc.subtract(-15.5, 10);
        Assertions.assertEquals(-25.5, actual);
    }

    @Test
    public void testSubtract6() {
        Calc calc = new Calc();
        double actual = calc.subtract(-15.5, -10);
        Assertions.assertEquals(-5.5, actual);
    }

    @Test
    public void testSubtract7() {
        Calc calc = new Calc();
        double actual = calc.subtract(0, 0);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSubtract8() {
        Calc calc = new Calc();
        double actual = calc.subtract(1, 1);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testMultiply1() {
        Calc calc = new Calc();
        double actual = calc.multiply(5, 5);
        Assertions.assertEquals(25, actual);
    }

    @Test
    public void testMultiply2() {
        Calc calc = new Calc();
        double actual = calc.multiply(5, 1.1);
        Assertions.assertEquals(5.5, actual);
    }

    @Test
    public void testMultiply3() {
        Calc calc = new Calc();
        double actual = calc.multiply(1.1, 5);
        Assertions.assertEquals(5.5, actual);
    }

    @Test
    public void testMultiply4() {
        Calc calc = new Calc();
        double actual = calc.multiply(0, 0);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testMultiply5() {
        Calc calc = new Calc();
        double actual = calc.multiply(0, 5);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testMultiply6() {
        Calc calc = new Calc();
        double actual = calc.multiply(-1, 5);
        Assertions.assertEquals(-5, actual);
    }

    @Test
    public void testMultiply7() {
        Calc calc = new Calc();
        double actual = calc.multiply(-5, -5);
        Assertions.assertEquals(25, actual);
    }

    @Test
    public void testDivide1() {
        Calc calc = new Calc();
        double actual = calc.divide(5, 5);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testDivide2() {
        Calc calc = new Calc();
        double actual = calc.divide(5, 2.5);
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void testDivide3() {
        Calc calc = new Calc();
        double actual = calc.divide(5.6, 2);
        Assertions.assertEquals(2.8, actual);
    }

    @Test
    public void testDivide4() {
        Calc calc = new Calc();
        double actual = calc.divide(5.5, 1.1);
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testDivide5() {
        Calc calc = new Calc();
        double actual = calc.divide(-5, 5);
        Assertions.assertEquals(-1, actual);
    }

    @Test
    public void testDivide6() {
        Calc calc = new Calc();
        double actual = calc.divide(-5, -5);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testDivide7() {
        Calc calc = new Calc();
        double actual = calc.divide(0, 5);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testDivide8() {
        Calc calc = new Calc();
        double actual = calc.divide(15, 0);
        Assertions.assertEquals(555555, actual);
    }
}
