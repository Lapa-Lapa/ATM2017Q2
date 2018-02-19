package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TNG_14SinDouble extends BaseCalculatorTestTNG {
    //prototype
    //https://planetcalc.ru/307/

    @Test(priority = 56, groups = "trigonometric functions")
    public void Sin30() {
        double sin = calculator.sin(Math.toRadians(30));
        Assert.assertEquals(sin, 0.5, 0.0000000001);
    }

    @Test(priority = 56, groups = "trigonometric functions")
    public void SinPI() {
        double sin = calculator.sin(Math.PI);
        Assert.assertEquals(sin, 0.0, 0.0000000001);
    }

    @Test(priority = 56, groups = "trigonometric functions")
    public void Sin180() {
        double sin = calculator.sin(Math.toRadians(180));
        Assert.assertEquals(sin, 0.0, 0.0000000001);
    }

    @Test(priority = 58, groups = "trigonometric functions")
    public void Sin_150() {
        double sin = calculator.sin(Math.toRadians(-150));
        Assert.assertEquals(sin, -0.5, 0.0000000001);
    }

    @Test(priority = 59, groups = "trigonometric functions")
    public void Sin361() {
        double sin = calculator.sin(Math.toRadians(361));
        Assert.assertEquals(sin, 0.01745240643728307, 0.0000000001);
    }
}