package M3_1_Unit_Testing_Frameworks_For_Java_JUnit_TestNG.runners;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestsRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        XmlSuite xmlSuite = new XmlSuite();
        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
            add("./src/test/java/com/epam/tat/module4/test/resources/testslist.xml");
        }});
        xmlSuite.setSuiteFiles(files);
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(xmlSuite);
        tng.setXmlSuites(suites);
        tng.run();
    }
}