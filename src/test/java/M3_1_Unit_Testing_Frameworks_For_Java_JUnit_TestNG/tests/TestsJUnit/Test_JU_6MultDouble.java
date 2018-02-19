package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_6MultDouble extends BaseCalculatorTestJU {
    @Parameterized.Parameters
    public static Collection<Object[]> dataForMultDouble() {
        return Arrays.asList(new Object[][]{
                {12.5, 2, 25},
                {0.5, 0, 0},
                {-1, 5.0, -5},
                {0, -10.0, 0}
        });
    }

    private double first;
    private double second;
    private double expected;

    public Test_JU_6MultDouble(double first,
                               double second,
                               double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void testMultArray() {
        Assert.assertEquals(expected, calculator.mult(first, second), 0.0);
    }
}