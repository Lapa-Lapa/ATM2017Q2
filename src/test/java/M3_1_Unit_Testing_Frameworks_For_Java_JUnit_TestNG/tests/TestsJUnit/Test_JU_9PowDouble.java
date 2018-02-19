package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_9PowDouble extends BaseCalculatorTestJU {
    @Parameters
    public static Collection<Object[]> dataForPow() {
        return Arrays.asList(new Object[][]{
                {12.0, 2.9, 144.0},
                {10.0, 0, 1.0},
                {12, 5, 248832.0},
                {0, 0.0, 1.0},
                {11, 2.0, 121.0},
                {10000, -1.00000000001, 0.00000001}
        });
    }

    private double first;
    private double second;
    private double expected;

    public Test_JU_9PowDouble(double first,
                              double second,
                              double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void dataProviderPow() {
        Assert.assertEquals(expected, calculator.pow(first, second), 0.0);
    }
}