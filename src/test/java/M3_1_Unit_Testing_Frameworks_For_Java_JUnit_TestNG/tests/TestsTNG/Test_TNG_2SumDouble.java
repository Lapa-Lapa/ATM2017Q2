package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;

public class Test_TNG_2SumDouble extends BaseCalculatorTestTNG {

    @Test(priority = 9, groups = "math doubles", description = "1.0+0.0=1.0")
    public void testOnePlusZero() {
        double sum = calculator.sum(1.0, 0.0);
        Assert.assertEquals(sum, 1.0, "Expected to be equal 1.0");
    }

    @Test(priority = 10, groups = "math doubles", description = "1.0+1.0=2.0")
    public void testOnePlusOne() {
        double sum = calculator.sum(1.0, 1.0);
        Assert.assertEquals(sum, 2.0, "Expected to be equal 2");
    }

//          *   *   *   *   *   *   *

    @Test(priority = 12, groups = "math doubles")
    public void testOnePlusTwo() {
        long sum = calculator.sum(1, 2);
        Assert.assertEquals(sum, 3, "Expected to be equal 3");
    }

    @Test(priority = 13, groups = "math doubles")
    public void testOnePlusThree() {
        long sum = calculator.sum(1, 3);
        Assert.assertEquals(sum, 4, "Expected to be equal 4");
    }

//          *   *   *   *   *   *   *

    //parameters from testslists.xml file
    @Parameters({"first", "second"})
    @Test(priority = 14, groups = "math doubles", description = "First plus second Test_TNG_2SumDouble")
    public void firstPlusSecond(double first, double second) {
        double expected = 5;
        double sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
    }

//          *   *   *   *   *   *   *

    @DataProvider(name = "dataForSum")
    public Object[][] dataForSum() {
        return new Object[][]{
                {5.0, -5.0, 0.0},
                {5.0, -10.0, -5.0},
                {10.1, -5.0, 5.1},
                {10.2, -5.0, 5.2},//I found bug!!! Because of type.
                {10.3, -5.0, 5.3},//I found bug!!! Because of type.
                {10.4, -5.0, 5.4},
                {10.5, -5.0, 5.5},
                {10.6, -5.0, 5.6},
                {10.7, -5.0, 5.7},//I found bug!!! Because of type.
                {10.8, -5.0, 5.8},//I found bug!!! Because of type.
                {10.9, -5.0, 5.9},
                {15.5, -10.0, 5.5},
                {0, 0, 0},
                {0.0, -1.0, -1.0},
                {0.0, -2.0, -2.0},
                {0.0, -3.9, -3.9},
                {-1.1, -3.9, -5.0},
        };
    }

    @Parameters({"firstDP", "secondDP", "expectedDP"})
    @Test( priority = 15, groups = "math doubles", dataProvider = "dataForSum")
    public void testSumArrayFromDataProvider(double firstDP, double secondDP, double expectedDP) {
        double sum = calculator.sum(firstDP, secondDP);
        Assert.assertEquals(sum, expectedDP);
    }

//          *   *   *   *   *   *   *

    @Test(priority = 16, groups = "math doubles", alwaysRun = true)
    public void testTwoPlusFour() {
        double sum = calculator.sum(2.5, 4.2);
        Assert.assertEquals(sum, 6.7, "Expected to be equal 6");
    }

//          *   *   *   *   *   *   *

    @DataProvider(name = "dataForSumRandom")
    public static Object[][] DataForSumRandom() {
        final int COUNT = 10;
        Object[][] dataForSumRandom = new Object[COUNT][];
        double firstR = 0;
        double secondR = 0;
        double expectedR = 0;
        for (int i = 0; i < COUNT; i++) {
            Random random = new Random();
            firstR = random.nextDouble();
            secondR = random.nextDouble();
            expectedR = firstR + secondR;
            dataForSumRandom[i] = new Object[3];
            dataForSumRandom[i][0] = firstR;
            dataForSumRandom[i][1] = secondR;
            dataForSumRandom[i][2] = expectedR;
        }
        return dataForSumRandom;
    }

    @Parameters({"firstDP", "secondDP", "expectedDP"})
    @Test(priority = 17, groups = "math doubles", dataProvider = "dataForSumRandom")
    public void testSumRandomArrayFromDataProvider(double firstR, double secondR, double expectedR) {
        double sum = calculator.sum(firstR, secondR);
        Assert.assertEquals(sum, expectedR);
    }
}