import org.example.*;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class CalculatorTest {
    final Calculator calc = new Calculator();

    @Test
    public void testCalculator_divideByZero() {
        final int original= calc.divide.apply(5,0);
        assertThat(original, equalTo(0));
    }
    @Test
    public void testAds_negativeNum(){
        final int original = calc.ads.apply(-10);
        final int expected = 10;
        assertThat(original, equalTo(expected));
    }
    @Test
    public void testIsPositive_negativeNum(){
        final boolean original = calc.isPositive.test(-10);
        final boolean expected = false;
        assertThat(original, equalTo(expected));
    }
    @Test
    public void testPow_negativeNum(){
        final int original = calc.pow.apply(-10);
        final int expected = 100;
        assertThat(original, equalTo(expected));
    }
}
