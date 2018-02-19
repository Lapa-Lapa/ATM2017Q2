package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_JU_12CtgDouble extends BaseCalculatorTestJU {
    //Из-за того что вместо тангенса возвращает котангенс
    //сtg не работает! 100% баг!
    //кроме этого не существует котангенса 0, 180 и 360 градусов
    @Parameterized.Parameters
    public static Collection<Object[]> dataForCtg() {
        return Arrays.asList(new Object[][]{
                {181, 57.28996163076047},
                {359, -57.289961630759265}
        });
    }

    private double degrees;
    private double expected;

    public Test_JU_12CtgDouble(double degrees,
                               double expected) {
        this.degrees = degrees;
        this.expected = expected;
    }

    @Test
    public void TestCtgArray() {
        Assert.assertEquals(expected, calculator.ctg(Math.toRadians(degrees)), 0.000000001);
    }

    @Test(expected = NumberFormatException.class)
    public void testCtg0() {
        double ctg = calculator.ctg(Math.toRadians(0));
        Assert.assertEquals(ctg, NumberFormatException.class);
    }

    @Test(expected = NumberFormatException.class)
    public void testCtg180() {
        double ctg = calculator.ctg(Math.toRadians(180));
        Assert.assertEquals(ctg, NumberFormatException.class);
    }

    @Test(expected = NumberFormatException.class)
    public void testCtg360() {
        double ctg = calculator.ctg(Math.toRadians(360));
        Assert.assertEquals(ctg, NumberFormatException.class);
    }
}