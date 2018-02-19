package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;

public class Test_TNG_3SubLong extends BaseCalculatorTestTNG {

    @Test(priority = 18, description = "1-0=1")
    public void testOneMinusZero() {
        long sub = calculator.sub(1, 0);
        Assert.assertEquals(sub, 1, "Expected to be equal 1");
    }

    @Test(priority = 19, description = "1-1=0")
    public void testOneMinusOne() {
        long sub = calculator.sub(1, 1);
        Assert.assertEquals(sub, 0, "Expected to be equal 2");
    }

//          *   *   *   *   *   *   *

    @Test(priority = 20)
    public void testOneMinusTwo() {
        long sub = calculator.sub(1, 2);
        Assert.assertEquals(sub, -1, "Expected to be equal -1");
    }

    @Test(priority = 21)
    public void testOneMinusThree() {
        long sub = calculator.sub(1, 3);
        Assert.assertEquals(sub, -2, "Expected to be equal -2");
    }

//          *   *   *   *   *   *   *

    //parameters from testcasesforcalculator.xml file
    @Parameters({"first", "second"})
    @Test(priority = 22, description = "First minus second Test_TNG_3SubLong")
    public void firstMinusSecond(long first, long second) {
        long sub = calculator.sub(first, second);
        long expected = first - second;
        Assert.assertEquals(sub, expected); //1-4=-3
    }

//          *   *   *   *   *   *   *

    @DataProvider(name = "dataForMinus")
    public Object[][] dataForMinus() {
        return new Object[][]{
                {5, -5, 10},
                {5, -10, 15},
                {10, -5, 15},
                {0, 0, 0},
                {0, -1, 1},
                {0, -2, 2},
                {0, -3, 3},
                {-1, -3, 2},
        };
    }

    @Parameters({"firstDP", "secondDP", "expectedDP"})
    @Test(priority = 23, dataProvider = "dataForMinus")
    public void testMinusArrayFromDataProvider(long firstDP, long secondDP, long expectedDP) {
        long sub = calculator.sub(firstDP, secondDP);
        Assert.assertEquals(sub, expectedDP);
    }

//          *   *   *   *   *   *   *

    @Test(priority = 24, alwaysRun = true)
    public void testTwoMinusFour() {
        long sub = calculator.sub(2, 4);
        Assert.assertEquals(sub, -2, "Expected to be equal 6");
    }

//          *   *   *   *   *   *   *

    @DataProvider(name = "dataForMinusRandom")
    public static Object[][] DataForMinusRandom() {
        final int COUNT = 10;
        Object[][] dataForMinusRandom = new Object[COUNT][];
        long firstR = 0;
        long secondR = 0;
        long expectedR = 0;
        for (int i = 0; i < COUNT; i++) {
            Random random = new Random();
            firstR = random.nextLong();
            secondR = random.nextLong();
            expectedR = firstR - secondR;
            dataForMinusRandom[i] = new Object[3];
            dataForMinusRandom[i][0] = firstR;
            dataForMinusRandom[i][1] = secondR;
            dataForMinusRandom[i][2] = expectedR;
        }
        return dataForMinusRandom;
    }

    @Parameters({"firstDP", "secondDP", "expectedDP"})
    @Test(priority = 25, dataProvider = "dataForMinusRandom")
    public void testMinusRandomArrayFromDataProvider(long firstR, long secondR, long expectedR) {
        long sub = calculator.sub(firstR, secondR);
        Assert.assertEquals(sub, expectedR);
    }
}