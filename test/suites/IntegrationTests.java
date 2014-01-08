package suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import steps.Step1Test;
import steps.Step2Test;


/**
 * Created with IntelliJ IDEA.
 * User: dima
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Step1Test.class, Step2Test.class})
public class IntegrationTests {

    @BeforeClass
    public static void setUp() {
        // Start fake app, prepare fixtures etc...
        System.out.println("setUp");
    }

    @AfterClass
    public static void tearDown() {
        // stop fake app
        System.out.println("tearDown");
    }
}
