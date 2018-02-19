package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_TNG_4SubDouble extends BaseCalculatorTestTNG {

    private double first;
    private double second;
    private double expected;

    @Factory(dataProvider = "dataForMinus")
    public Test_TNG_4SubDouble(double first, double second, double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @DataProvider(name = "dataForMinus")
    public static Object[][] dataForMinus() {
        return new Object[][]{
                {1, 2, -1},
                {0, 0, 0},
                {-1, 1, -2},
                {1, -10, 11}
        };
    }

    @Test(priority = 26, groups = "math doubles")
    public void testMinusArrayFromDataProvider() {
        double sub = calculator.sub(first, second);
        Assert.assertEquals(sub, expected);
    }

//          *   *   *   *   *   *   *

    @DataProvider(name = "dataForMinusFormula")
    public static Object[][] DataForMinus() {
        final int COUNT = 10;
        Object[][] dataForMinus = new Object[COUNT][];
        double firstR = -100;
        double secondR = 100;
        double expectedR = 0;
        for (int i = 0; i < COUNT; i++) {
            firstR = firstR + (double) i;
            secondR = secondR - (double) i;
            expectedR = firstR - secondR;
            dataForMinus[i] = new Object[3];
            dataForMinus[i][0] = firstR;
            dataForMinus[i][1] = secondR;
            dataForMinus[i][2] = expectedR;
        }
        return dataForMinus;
    }

    @Parameters({"firstDP", "secondDP", "expectedDP"})
    @Test(priority = 27, groups = "math doubles", dataProvider = "dataForMinusFormula")
    public void testMinusArrayGeneratedFromDataProvider(double firstR, double secondR, double expectedR) {
        double sub = calculator.sub(firstR, secondR);
        Assert.assertEquals(sub, expectedR);
    }
}