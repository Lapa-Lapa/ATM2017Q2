package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;

public class Test_TNG_1SumLong extends BaseCalculatorTestTNG {

    @Test(priority = 1, description = "1+0=1", alwaysRun = true)
    public void testOnePlusZero() {
        long sum = calculator.sum(1, 0);
        Assert.assertEquals(sum, 1, "Expected to be equal 1");
    }

    @Test(priority = 1, description = "1+1=2", alwaysRun = true)
    public void testOnePlusOne() {
        long sum = calculator.sum(1, 1);
        Assert.assertEquals(sum, 2, "Expected to be equal 2");
    }

//          *   *   *   *   *   *   *

    @Test(priority = 1, alwaysRun = true)
    public void testOnePlusTwo() {

        long sum = calculator.sum(1, 2);
        Assert.assertEquals(sum, 3, "Expected to be equal 3");
    }

    @Test(priority = 1, alwaysRun = true)
    public void testOnePlusThree() {
        long sum = calculator.sum(1, 3);
        Assert.assertEquals(sum, 4, "Expected to be equal 4");
    }

//          *   *   *   *   *   *   *

    //parameters from testslist.xml file
    @Parameters({"first", "second"})
    @Test(priority = 1, description = "First plus second Test_1_MethodTNG", alwaysRun = true)
    public void firstPlusSecond(long first, long second) {
        long expected = 5;
        long sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
    }

//          *   *   *   *   *   *   *

    @DataProvider(name = "dataForSum")
    public Object[][] dataForSum() {
        return new Object[][]{
                {5, -5, 0},
                {5, -10, -5},
                {10, -5, 5},
                {0, 0, 0},
                {0, -1, -1},
                {0, -2, -2},
                {0, -3, -3},
                {-1, -3, -4},
        };
    }

    @Parameters({"firstDP", "secondDP", "expectedDP"})
    @Test(priority = 2, dataProvider = "dataForSum", alwaysRun = true)
    public void dataProviderSumArray(long firstDP, long secondDP, long expectedDP) {
        long sum = calculator.sum(firstDP, secondDP);
        Assert.assertEquals(sum, expectedDP);
    }

//          *   *   *   *   *   *   *

    @Test(priority = 3, alwaysRun = true)
    public void testTwoPlusFour() {
        long sum = calculator.sum(2, 4);
        Assert.assertEquals(sum, 6, "Expected to be equal 6");
    }

//          *   *   *   *   *   *   *

    @DataProvider(name = "dataForSumRandom")
    public static Object[][] DataForSumRandom() {
        final int COUNT = 10;
        Object[][] dataForTest = new Object[COUNT][];
        long firstR = 0;
        long secondR = 0;
        long expectedR = 0;
        for (int i = 0; i < COUNT; i++) {
            Random random = new Random();
            firstR = random.nextLong();
            secondR = random.nextLong();
            expectedR = firstR + secondR;
            dataForTest[i] = new Object[3];
            dataForTest[i][0] = firstR;
            dataForTest[i][1] = secondR;
            dataForTest[i][2] = expectedR;
        }
        return dataForTest;
    }

    @Parameters({"firstDP", "secondDP", "expectedDP"})
    @Test(priority = 4, dataProvider = "dataForSumRandom", alwaysRun = true)
    public void testSumRandomArrayFromDtaProvider(long firstR, long secondR, long expectedR) {
        long sum = calculator.sum(firstR, secondR);
        Assert.assertEquals(sum, expectedR);
    }
}