package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Test_TNG_5MultLong extends BaseCalculatorTestTNG {

    private long first;
    private long second;
    private long expected;

    @Factory(dataProvider = "dataForMult")
    public Test_TNG_5MultLong(long first, long second, long expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @DataProvider(name = "dataForMult")
    public static Object[][] dataForMult() {
        return new Object[][]{
                {12, 2, 24},
                {0, 0, 0},
                {-1, 5, -5},
                {0, -10, 0}
        };
    }

    @Test(priority = 28)
    public void testMultArreyFromDataProvider() {
        long mult = calculator.mult(first, second);
        Assert.assertEquals(mult, expected);
    }
}