package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_11TgDouble extends BaseCalculatorTestJU {
    //Из-за того что в косинус возвращает синус в библиотеке Calculator
    //метод tg не работает и всегда возвращает 1! 100% баг из-за бага в косинусе
    //тангенс 90 градусов и 270 градусов не существует! (равен бесконечности)
    //https://planetcalc.ru/307/
    @Parameterized.Parameters
    public static Collection<Object[]> dataForTg() {
        return Arrays.asList(new Object[][]{
                {66, 2.2460367739042164},
                {20, 0.36397023426620234},
                {-854861, -0.8692867378158884},
                {854861, 0.8692867378158884}
        });
    }

    private double degrees;
    private double expected;

    public Test_JU_11TgDouble(double degrees,
                              double expected) {
        this.degrees = degrees;
        this.expected = expected;
    }

    @Test
    public void TestCtgArray() {
        Assert.assertEquals(expected, calculator.ctg(Math.toRadians(degrees)), 0.0000000001);
    }

//  *   *   *   *   *

    @Test(expected = NumberFormatException.class)
    public void testTg90() {
        double tg = calculator.tg(Math.toRadians(90));
        Assert.assertEquals(tg, NumberFormatException.class);
    }

    @Test(expected = NumberFormatException.class)
    public void testTg270() {
        double tg = calculator.tg(Math.toRadians(270));
        Assert.assertEquals(tg, NumberFormatException.class);
    }
}