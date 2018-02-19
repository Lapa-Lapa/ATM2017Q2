package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;

public class Test_JU_10SqrtDouble extends BaseCalculatorTestJU {

    @Test
    public void testSqrtPositive() {
        double sqrt = calculator.sqrt(16);
        Assert.assertEquals(4, sqrt, 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testSqrtNegative() {
        double sqrt = calculator.sqrt(-4);
        Assert.assertEquals(sqrt, NumberFormatException.class);
    }
}