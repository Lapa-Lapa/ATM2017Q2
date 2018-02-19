package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Darya_Tarelko on 02-Jun-17.
 */
public class Test_TNG_7DivLong extends BaseCalculatorTestTNG {

    @DataProvider(name = "dataForDiv")
    public static Object[][] dataForDiv() {
        return new Object[][]{
                {12, 2, 6},
                {12, 5, 2},     //Is it ok? For longs it's ok.
                {-1, 5, 0},     //Is it ok? For longs it's ok.
                {0, -10, 0}     //I found bug!!!
        };
    }

    @Parameters({"first", "second", "expected"})
    @Test(priority = 30, dataProvider = "dataForDiv")
    public void testDivArrayFromDataProvider(long first, long second, long expected) {
        long div = calculator.div(first, second);
        Assert.assertEquals(div, expected);
    }

//  *   *   *   *   *

    @Test(groups = "need clarification", priority = 30, expectedExceptions = NumberFormatException.class)
    public void testDivNull() {
        long div = calculator.div(0, 0);
        Assert.assertEquals(div, "Attempt to divide by zero");
    }
}