package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_8DivDouble extends BaseCalculatorTestJU {
    @Parameterized.Parameters
    public static Collection<Object[]> dataForDiv() {
        return Arrays.asList(new Object[][]{
                {12.0, 2, 6.0},
                {10.0, 3.0, 3.33333333333333333333333333333333333333333}, //I think it's ok. It's double type!
                {12, 5, 2.4},
                {-1, 5.0, -0.2},
                {0.0, -10, 0.0}     //Is it bug?
        });
    }

    private double first;
    private double second;
    private double expected;

    public Test_JU_8DivDouble(double first,
                              double second,
                              double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(expected, calculator.div(first, second), 0.0);
    }

    @Test(expected = NumberFormatException.class)
    public void testDivNull() {
        double div = calculator.div(2, 0);
        Assert.assertEquals(div, NumberFormatException.class);
    }
}