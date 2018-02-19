package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_7DivLong extends BaseCalculatorTestJU {
    @Parameterized.Parameters
    public static Collection<Object[]> dataForDivLong() {
        return Arrays.asList(new Object[][]{
                {120, 2, 60},
                {-100, 2, -50},
                {-10, -5, 2},
                {2, -1, -2}
        });
    }

    private long first;
    private long second;
    private long expected;

    public Test_JU_7DivLong(long first,
                               long second,
                               long expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void testDivArray() {
        Assert.assertEquals(expected, calculator.div(first, second), 0.0);
    }

    @Test(expected = NumberFormatException.class)
    public void testDivNull( ) {
        long div = calculator.div(2,0);
        Assert.assertEquals(div, NumberFormatException.class);
    }
}