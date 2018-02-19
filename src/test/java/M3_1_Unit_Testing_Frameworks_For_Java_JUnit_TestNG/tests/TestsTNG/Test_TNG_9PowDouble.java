package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_TNG_9PowDouble extends BaseCalculatorTestTNG {

    @DataProvider(name = "dataForPow")
    public static Object[][] dataForPow() {
        return new Object[][]{
                {12.0, 2.9, 144.0},     //It's ok it's the left nearest to 2.9
                {10.0, 0, 1.0},
                {12, 5, 248832.0},
                {0, 0.0, 1.0},
                {11, 2.0, 121.0},
                {10000, -1.00000000001, 0.00000001}    //It's ok it's the left nearest to -1.00000000001
        };
    }

    @Parameters({"first", "second", "expected"})
    @Test(priority = 32, groups = "math doubles", dataProvider = "dataForPow")
    public void dataProviderPow(double first, double second, double expected) {
        double pow = calculator.pow(first, second);
        Assert.assertEquals(pow, expected);
    }
}