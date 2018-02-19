package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import org.junit.Assert;
import org.junit.Test;

public class Test_JU_13CosDouble extends BaseCalculatorTestJU {
    //Из-за того что вместо cos возвращает sin
    //cos не работает! 100% баг!

    @Test
    public void testCos27() {
        double cos = calculator.cos(Math.toRadians(27));
        Assert.assertEquals(0.8910065241883679, cos, 0.0001);
    }

    @Test
    public void testCos389() {
        double cos = calculator.cos(Math.toRadians(389));
        Assert.assertEquals(0.8746197071393961, cos, 0.0001);
    }
    @Test
    public void testCos_3() {
        double cos = calculator.cos(Math.toRadians(-3));
        Assert.assertEquals(0.9986295347545738, cos, 0.0001);
    }
}