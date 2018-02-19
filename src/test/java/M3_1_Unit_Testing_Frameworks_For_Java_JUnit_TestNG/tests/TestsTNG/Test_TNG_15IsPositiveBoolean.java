package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TNG_15IsPositiveBoolean extends BaseCalculatorTestTNG {

    @Test(priority = 60)
    public void dataProviderIsPositive1() {
        boolean isPositive = calculator.isPositive(15L);
        Assert.assertEquals(isPositive, true, "Expected to be equal true");
    }

    @Test(priority = 61)
    public void dataProviderIsPositive2() {
        boolean isPositive = calculator.isPositive(-15L);
        Assert.assertEquals(isPositive, false, "Expected to be equal false");
    }

    @Test(priority = 62)
    public void dataProviderIsPositive3() {
        boolean isPositive = calculator.isPositive(0L);
        Assert.assertEquals(isPositive, false, "Expected to be equal false");
    }


    @Test(priority = 63)
    public void dataProviderIsPositive4() {
        boolean isPositive = calculator.isPositive(-0L);
        Assert.assertEquals(isPositive, false, "Expected to be equal false");
    }

    @Test(priority = 64)
    public void dataProviderIsPositive5() {
        boolean isPositive = calculator.isPositive(3567955487885484L);
        Assert.assertEquals(isPositive, true, "Expected to be equal true");
    }
}