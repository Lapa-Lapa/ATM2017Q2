package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.tests.TestsJUnit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.Date;

public class BaseCalculatorTestJU {

    protected static Calculator calculator;
    protected static Date start;
    protected static Date end;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
        start = new Date(System.currentTimeMillis());
        System.out.println("Test started at:" + start);
    }

    @AfterClass
    public static void afterClass() {
        end = new Date(System.currentTimeMillis());
        System.out.println("Test ended at:" + end);
    }
}