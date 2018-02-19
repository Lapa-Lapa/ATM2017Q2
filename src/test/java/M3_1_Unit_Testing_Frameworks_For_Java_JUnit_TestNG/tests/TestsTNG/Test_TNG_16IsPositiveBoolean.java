package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 04.06.2017.
 */
public class Test_TNG_16IsPositiveBoolean extends BaseCalculatorTestTNG {

    @Test(priority = 65)
    public void dataProviderIsNegative1() {
        boolean isNegative = calculator.isNegative(15L);
        Assert.assertEquals(isNegative, false, "Expected to be equal true");
    }

    @Test(priority = 66)
    public void dataProviderIsNegative2() {
        boolean isNegative = calculator.isNegative(-15L);
        Assert.assertEquals(isNegative, true, "Expected to be equal true");
    }

    @Test(priority = 67)
    public void dataProviderIsNegative3() {
        boolean isNegative = calculator.isNegative(0L);
        Assert.assertEquals(isNegative, false, "Expected to be equal false");
    }

    @Test(priority = 68)
    public void dataProviderIsNegative4() {
        boolean isPositive = calculator.isPositive(-0L);
        Assert.assertEquals(isPositive, false, "Expected to be equal false");
    }
}