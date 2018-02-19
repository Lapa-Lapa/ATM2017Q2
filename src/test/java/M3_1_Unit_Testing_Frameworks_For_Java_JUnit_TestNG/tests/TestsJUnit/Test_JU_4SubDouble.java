package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_4SubDouble extends BaseCalculatorTestJU {

    @Parameterized.Parameters
    public static Collection<Object[]> dataForSubDouble() {
        return Arrays.asList(new Object[][]{
                {5.0, 5.0, 0.0},
                {5.0, 10.0, -5.0},
                {10.1, 5.0, 5.1},
                {10.2, 5.0, 5.2},//I found bug!!! Because of type.
                {10.3, 5.0, 5.3},//I found bug!!! Because of type.
                {10.4, 5.0, 5.4},
                {10.5, 5.0, 5.5},
                {10.6, 5.0, 5.6},
                {10.7, 5.0, 5.7},//I found bug!!! Because of type.
                {10.8, 5.0, 5.8},//I found bug!!! Because of type.
                {10.9, 5.0, 5.9},
                {15.5, 10.0, 5.5},
                {0, 0, 0},
                {0.0, 1.0, -1.0},
                {0.0, 2.0, -2.0},
                {0.0, 3.9, -3.9},
                {-1.1, 3.9, -5.0}
        });
    }

    private double first;
    private double second;
    private double expected;

    public Test_JU_4SubDouble(double first,
                              double second,
                              double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void testSumArray() {
        Assert.assertEquals(expected, calculator.sub(first, second), 0.0);
    }
}