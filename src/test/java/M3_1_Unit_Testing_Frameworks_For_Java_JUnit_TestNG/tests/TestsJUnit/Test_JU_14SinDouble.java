package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;

public class Test_JU_14SinDouble extends BaseCalculatorTestJU {

    @Test
    public void Sin_3() {
        double sin = calculator.sin(Math.toRadians(-3));
        Assert.assertEquals(-0.05233595624294383, sin, 0.0000000001);
    }

    @Test
    public void Sin30() {
        double sin = calculator.sin(Math.toRadians(30));
        Assert.assertEquals(	0.49999999999999994, sin, 0.0000000001);
    }

    @Test
    public void Sin892() {
        double sin = calculator.sin(Math.toRadians(892));
        Assert.assertEquals(0.13917310096006624, sin, 0.0000000001);
    }
}