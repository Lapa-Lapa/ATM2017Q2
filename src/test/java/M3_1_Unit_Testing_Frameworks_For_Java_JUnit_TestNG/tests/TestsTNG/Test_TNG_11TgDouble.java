package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TNG_11TgDouble extends BaseCalculatorTestTNG {
    //Из-за того что в косинус возвращает синус в библиотеке Calculator
    //метод tg не работает и всегда возвращает 1! 100% баг из-за бага в косинусе
    //Тангенс 90 градусов и 270 градусов не существует! (равен бесконечности)
    //prototype
    //https://planetcalc.ru/307/

    @Test(priority = 111, groups = "trigonometric functions")
    public void Tg91() {
        double tg = calculator.tg(Math.toRadians(91));
        Assert.assertEquals(tg, -57.28996163075955, 0.0000000001);
    }

    @Test(priority = 112, groups = "trigonometric functions", expectedExceptions = NumberFormatException.class)
    public void Tg90() {
        double tg = calculator.tg(90);
        Assert.assertEquals(tg, "Expected to be equal error!");
    }

    @Test(priority = 112, groups = "trigonometric functions", expectedExceptions = NumberFormatException.class)
    public void Tg270() {
        double tg = calculator.tg(270);
        Assert.assertEquals(tg, "Expected to be equal error!");
    }

    @Test(priority = 113, groups = "trigonometric functions")
    public void Tg_202() {
        double tg = calculator.tg(Math.toRadians(-202));
        Assert.assertEquals(tg, -0.4040262258351568, 0.0000000001);
    }

    @Test(priority = 114, groups = "trigonometric functions")
    public void Tg361() {
        double tg = calculator.tg(361);
        Assert.assertEquals(tg, 0.01745506492821714, 0.0000000001);
    }
}