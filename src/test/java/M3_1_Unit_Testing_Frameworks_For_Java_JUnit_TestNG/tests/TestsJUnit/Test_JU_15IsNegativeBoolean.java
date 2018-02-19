package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;

public class Test_JU_15IsNegativeBoolean extends BaseCalculatorTestJU {

    @Test
    public void TestIsPositive15L() {
        boolean isPositive = calculator.isPositive(15L);
        Assert.assertEquals("Expected to be equal true", true, isPositive);
    }

    @Test
    public void TestIsPositive_15L() {
        boolean isPositive = calculator.isPositive(-15L);
        Assert.assertEquals("Expected to be equal false", false, isPositive);
    }

    @Test
    public void TestIsPositiveNull() {
        boolean isPositive = calculator.isPositive(0L);
        Assert.assertEquals("Expected to be equal false", false, isPositive);
    }   //Is it write? I thunk YES because 0 is neutral

    @Test
    public void TestIsPositive_Null() {
        boolean isPositive = calculator.isPositive(-0L);
        Assert.assertEquals("Expected to be equal false", false, isPositive);
    }
}