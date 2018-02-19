package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TNG_10SqrtDouble extends BaseCalculatorTestTNG {

    @Test(priority = 33, groups = "math doubles")
    public void dataProviderSqrt1() {
        double sqrt = calculator.sqrt(1);
        Assert.assertEquals(sqrt, 1.0, "Expected to be equal 1.0");
    }

    @Test(priority = 34, groups = "math doubles")
    public void dataProviderSqrt2() {
        double sqrt = calculator.sqrt(100);
        Assert.assertEquals(sqrt, 10.0, "Expected to be equal 10.0");
    }

    @Test(priority = 35, groups = "math doubles")
    public void dataProviderSqrt3() {
        double sqrt = calculator.sqrt(121.0);
        Assert.assertEquals(sqrt, 11.0, "Expected to be equal 11.0");
    }

    @Test(priority = 36, groups = "math doubles")
    public void dataProviderSqrt4() {
        double sqrt = calculator.sqrt(144);
        Assert.assertEquals(sqrt, 12.0, "Expected to be equal 12.0");
    }

    @Test(priority = 37, groups = "math doubles")
    public void dataProviderSqrt5() {
        double sqrt = calculator.sqrt(4.0);
        Assert.assertEquals(sqrt, 2.0, "Expected to be equal 2.0");
    }

    //BUG!BUG!BUG!
    //http://school-assistant.ru/?predmet=algebra&theme=kvadratni_koren
    //I know about abs that makes -4=|-4|=4, but it isn't wright!
    @Test(priority = 38, groups = "math doubles", expectedExceptions = NumberFormatException.class)
    public void dataProviderSqrt6() {
        double sqrt = calculator.sqrt(-4);
        Assert.assertEquals(sqrt, "Expected to be error!!!");
    }
}