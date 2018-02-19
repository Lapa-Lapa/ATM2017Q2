package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TNG_12CtgDouble extends BaseCalculatorTestTNG {
    //Из-за того что вместо тангенса возвращает котангенс
    //сtg не работает! 100% баг!
    //Котангенса 0, 180 и 360 градусов не существует (равен бесконечности)
    //prototype
    //https://planetcalc.ru/307/

    @Test(priority = 121, groups = "trigonometric functions")
    public void Ctg1() {
        double ctg = calculator.ctg(1);
        Assert.assertEquals(ctg, 0.6420926159343306, 0.0000000001);
    }

    //          *   *   *   *   *

    @Test(priority = 122, groups = "trigonometric functions", expectedExceptions = NumberFormatException.class)
    public void Ctg0() {
        double ctg = calculator.ctg(Math.toRadians(0));
        Assert.assertEquals(ctg, "Expected to be error!");
    }

    @Test(priority = 122, groups = "trigonometric functions", expectedExceptions = NumberFormatException.class)
    public void Ctg180() {
        double ctg = calculator.ctg(Math.toRadians(180));
        Assert.assertEquals(ctg, 0, "Expected to be error!");
    }

    @Test(priority = 122, groups = "trigonometric functions", expectedExceptions = NumberFormatException.class)
    public void Ctg360() {
        double ctg = calculator.ctg(Math.toRadians(360));
        Assert.assertEquals(ctg, "Expected to be error!");
    }

    //          *   *   *   *   *

    @Test(priority = 123, groups = "trigonometric functions")
    public void Ctg_151() {
        double ctg = calculator.ctg(Math.toRadians(-151));
        Assert.assertEquals(ctg, 1.8040477552714234, 0.0000000001);
    }

    @Test(priority = 124, groups = "trigonometric functions")
    public void Ctg361() {
        double ctg = calculator.ctg(Math.toRadians(361));
        Assert.assertEquals(ctg, 57.289961630760885, 0.0000000001);
    }
}