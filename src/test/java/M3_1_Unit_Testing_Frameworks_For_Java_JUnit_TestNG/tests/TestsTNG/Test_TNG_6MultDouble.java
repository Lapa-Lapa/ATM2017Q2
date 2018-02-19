package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Darya_Tarelko on 02-Jun-17.
 */
public class Test_TNG_6MultDouble extends BaseCalculatorTestTNG {

    @DataProvider(name = "dataForMult")
    public static Object[][] dataForMult() {
        return new Object[][]{
                {12.0, 2, 24.0},
                {0, 1.5, 0.0},
                {2, 1.5, 3.0},
                {3, 1.5, 4.5}, //Is it bug?
                {-1, 5.0, -5.0},
                {0, -10.0, 0.0} //I found bug!!!
        };
    }

    @Parameters({"first", "second", "expected"})
    @Test(priority = 29, groups = "math doubles", dataProvider = "dataForMult")
    public void testMultArrayFromDataProvider(double first, double second, double expected) {
        double mult = calculator.mult(first, second);
        Assert.assertEquals(mult, expected);
    }
}