package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;

public class Test_JU_16IsPositiveBoolean extends BaseCalculatorTestJU {

    @Test
    public void TestIsNegative15L() {
        boolean isNegative = calculator.isNegative(15L);
        Assert.assertEquals("Expected to be equal false", false, isNegative);
    }

    @Test
    public void TestIsNegative_15L() {
        boolean isNegative = calculator.isNegative(-15L);
        Assert.assertEquals("Expected to be equal true", true, isNegative);
    }

    @Test
    public void TestIsNegativeNull() {
        boolean isNegative = calculator.isNegative(0L);
        Assert.assertEquals("Expected to be equal false", false, isNegative);
        //Is it write? 0 is neutral
    }

    @Test
    public void TestIsNegative_Null() {
        boolean isPositive = calculator.isPositive(-0L);
        Assert.assertEquals("Expected to be equal false", false, isPositive);
    }
}