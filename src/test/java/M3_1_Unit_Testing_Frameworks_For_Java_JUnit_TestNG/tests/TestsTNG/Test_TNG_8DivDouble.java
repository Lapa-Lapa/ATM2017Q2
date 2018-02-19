package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_TNG_8DivDouble extends BaseCalculatorTestTNG {

    @DataProvider(name = "dataForDiv")
    public static Object[][] dataForDiv() {
        return new Object[][]{
                {12.0, 2, 6.0},
                {10.0, 3.0, 3.33333333333333333333333333333333333333333}, //I think it's ok. It's double type!
                {12, 5, 2.4},
                {-1, 5.0, -0.2},
                {0.0, -10, 0.0}     //Is it bug?
        };
    }

    @Parameters({"first", "second", "expected"})
    @Test(priority = 31, groups = "math doubles", dataProvider = "dataForDiv")
    public void testDiv(double first, double second, double expected) {
        double div = calculator.div(first, second);
        Assert.assertEquals(div, expected);
    }

    //Почему он зеленый? Нет же обработки на ноль в этом классе!
    @Test(priority = 31, groups = "need clarification", expectedExceptions = NumberFormatException.class)
    public void testDivNull() {
        double div = calculator.div(0, 0);
        Assert.assertEquals(div, "Attempt to divide by zero");
    }
}