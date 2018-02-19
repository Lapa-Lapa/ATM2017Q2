package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_1SumLong extends BaseCalculatorTestJU {

    @Parameterized.Parameters
    public static Collection<Object[]> dataForSumLong() {
        return Arrays.asList(new Object[][]{
                {5, -5, 0},
                {5, -10, -5},
                {10, -5, 5},
                {0, 0, 0},
                {0, -1, -1},
                {0, -2, -2},
                {0, -3, -3},
                {-1, -3, -4}
        });
    }

    private long first;
    private long second;
    private long expected;

    public Test_JU_1SumLong(long first,
                            long second,
                            long expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void testSumArray() {
        Assert.assertEquals(expected, calculator.sum(first, second), 0.0);
    }
}