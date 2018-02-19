package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_5MultLong extends BaseCalculatorTestJU {

    @Parameterized.Parameters
    public static Collection<Object[]> dataForMultLong() {
        return Arrays.asList(new Object[][]{
                {12, 2, 24},
                {0, 0, 0},
                {-1, 5, -5},
                {0, -10, 0}
        });
    }

    private long first;
    private long second;
    private long expected;

    public Test_JU_5MultLong(long first,
                             long second,
                             long expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void testMultArray() {
        Assert.assertEquals(expected, calculator.mult(first, second), 0.0);
    }
}