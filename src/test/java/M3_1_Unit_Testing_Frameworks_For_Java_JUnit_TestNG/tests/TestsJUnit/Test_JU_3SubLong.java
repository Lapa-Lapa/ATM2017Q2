package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_3SubLong extends BaseCalculatorTestJU {

    @Parameterized.Parameters
    public static Collection<Object[]> dataForSubLong() {
        return Arrays.asList(new Object[][]{
                {5, -5, 10},
                {0, 0, 0},
                {5, 5, 0},
                {5, -6, 11},
                {10, 4, 6},
                {-5, 4, -9}
        });
    }

    private long first;
    private long second;
    private long expected;

    public Test_JU_3SubLong(long first,
                            long second,
                            long expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void testSubArray() {
        Assert.assertEquals(expected, calculator.sub(first, second), 0.0);
    }
}