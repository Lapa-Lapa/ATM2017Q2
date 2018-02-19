package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TNG_13CosDouble extends BaseCalculatorTestTNG {
    //Из-за того что вместо cos возвращает sin
    //cos не работает! 100% баг!
    //prototype
    //https://planetcalc.ru/307/

    @Test(priority = 50,groups = "trigonometric functions")
    public void Cos27() {
        double cos = calculator.cos(Math.toRadians(27));
        Assert.assertEquals(cos, 0.8910065241883679, 0.0000000001);
    }

    @Test(priority = 52,groups = "trigonometric functions")
    public void Cos_150() {
        double cos = calculator.cos(Math.toRadians(-150));
        Assert.assertEquals(cos, -0.8660254037844387, 0.0000000001);
    }

    @Test(priority = 54,groups = "trigonometric functions")
    public void Cos361() {
        double cos = calculator.cos(Math.toRadians(361));
        Assert.assertEquals(cos, 0.9998476951563913, 0.0000000001);
    }

    @Test(priority = 55,groups = "trigonometric functions")
    public void CosPI() {
        double cos = calculator.cos(Math.toRadians(Math.PI));
        Assert.assertEquals(cos, -1, 0.0000000001);
    }
}