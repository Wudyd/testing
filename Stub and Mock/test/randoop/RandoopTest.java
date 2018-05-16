package randoop;
import junit.framework.*;
import junit.textui.*;

public class RandoopTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RandoopTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RandoopTest0.class));
    result.addTest(new TestSuite(RandoopTest1.class));
    result.addTest(new TestSuite(RandoopTest2.class));
    result.addTest(new TestSuite(RandoopTest3.class));
    result.addTest(new TestSuite(RandoopTest4.class));
    result.addTest(new TestSuite(RandoopTest5.class));
    result.addTest(new TestSuite(RandoopTest6.class));
    result.addTest(new TestSuite(RandoopTest7.class));
    result.addTest(new TestSuite(RandoopTest8.class));
    result.addTest(new TestSuite(RandoopTest9.class));
    result.addTest(new TestSuite(RandoopTest10.class));
    result.addTest(new TestSuite(RandoopTest11.class));
    result.addTest(new TestSuite(RandoopTest12.class));
    result.addTest(new TestSuite(RandoopTest13.class));
    result.addTest(new TestSuite(RandoopTest14.class));
    result.addTest(new TestSuite(RandoopTest15.class));
    result.addTest(new TestSuite(RandoopTest16.class));
    result.addTest(new TestSuite(RandoopTest17.class));
    result.addTest(new TestSuite(RandoopTest18.class));
    result.addTest(new TestSuite(RandoopTest19.class));
    result.addTest(new TestSuite(RandoopTest20.class));
    result.addTest(new TestSuite(RandoopTest21.class));
    result.addTest(new TestSuite(RandoopTest22.class));
    result.addTest(new TestSuite(RandoopTest23.class));
    result.addTest(new TestSuite(RandoopTest24.class));
    result.addTest(new TestSuite(RandoopTest25.class));
    result.addTest(new TestSuite(RandoopTest26.class));
    result.addTest(new TestSuite(RandoopTest27.class));
    result.addTest(new TestSuite(RandoopTest28.class));
    result.addTest(new TestSuite(RandoopTest29.class));
    result.addTest(new TestSuite(RandoopTest30.class));
    result.addTest(new TestSuite(RandoopTest31.class));
    result.addTest(new TestSuite(RandoopTest32.class));
    result.addTest(new TestSuite(RandoopTest33.class));
    result.addTest(new TestSuite(RandoopTest34.class));
    result.addTest(new TestSuite(RandoopTest35.class));
    result.addTest(new TestSuite(RandoopTest36.class));
    result.addTest(new TestSuite(RandoopTest37.class));
    result.addTest(new TestSuite(RandoopTest38.class));
    result.addTest(new TestSuite(RandoopTest39.class));
    result.addTest(new TestSuite(RandoopTest40.class));
    result.addTest(new TestSuite(RandoopTest41.class));
    result.addTest(new TestSuite(RandoopTest42.class));
    result.addTest(new TestSuite(RandoopTest43.class));
    result.addTest(new TestSuite(RandoopTest44.class));
    result.addTest(new TestSuite(RandoopTest45.class));
    result.addTest(new TestSuite(RandoopTest46.class));
    result.addTest(new TestSuite(RandoopTest47.class));
    result.addTest(new TestSuite(RandoopTest48.class));
    result.addTest(new TestSuite(RandoopTest49.class));
    result.addTest(new TestSuite(RandoopTest50.class));
    result.addTest(new TestSuite(RandoopTest51.class));
    result.addTest(new TestSuite(RandoopTest52.class));
    result.addTest(new TestSuite(RandoopTest53.class));
    result.addTest(new TestSuite(RandoopTest54.class));
    result.addTest(new TestSuite(RandoopTest55.class));
    result.addTest(new TestSuite(RandoopTest56.class));
    result.addTest(new TestSuite(RandoopTest57.class));
    result.addTest(new TestSuite(RandoopTest58.class));
    result.addTest(new TestSuite(RandoopTest59.class));
    result.addTest(new TestSuite(RandoopTest60.class));
    result.addTest(new TestSuite(RandoopTest61.class));
    result.addTest(new TestSuite(RandoopTest62.class));
    result.addTest(new TestSuite(RandoopTest63.class));
    result.addTest(new TestSuite(RandoopTest64.class));
    result.addTest(new TestSuite(RandoopTest65.class));
    result.addTest(new TestSuite(RandoopTest66.class));
    result.addTest(new TestSuite(RandoopTest67.class));
    result.addTest(new TestSuite(RandoopTest68.class));
    result.addTest(new TestSuite(RandoopTest69.class));
    result.addTest(new TestSuite(RandoopTest70.class));
    result.addTest(new TestSuite(RandoopTest71.class));
    result.addTest(new TestSuite(RandoopTest72.class));
    result.addTest(new TestSuite(RandoopTest73.class));
    result.addTest(new TestSuite(RandoopTest74.class));
    result.addTest(new TestSuite(RandoopTest75.class));
    result.addTest(new TestSuite(RandoopTest76.class));
    result.addTest(new TestSuite(RandoopTest77.class));
    result.addTest(new TestSuite(RandoopTest78.class));
    result.addTest(new TestSuite(RandoopTest79.class));
    result.addTest(new TestSuite(RandoopTest80.class));
    result.addTest(new TestSuite(RandoopTest81.class));
    result.addTest(new TestSuite(RandoopTest82.class));
    result.addTest(new TestSuite(RandoopTest83.class));
    result.addTest(new TestSuite(RandoopTest84.class));
    result.addTest(new TestSuite(RandoopTest85.class));
    result.addTest(new TestSuite(RandoopTest86.class));
    result.addTest(new TestSuite(RandoopTest87.class));
    result.addTest(new TestSuite(RandoopTest88.class));
    result.addTest(new TestSuite(RandoopTest89.class));
    result.addTest(new TestSuite(RandoopTest90.class));
    result.addTest(new TestSuite(RandoopTest91.class));
    result.addTest(new TestSuite(RandoopTest92.class));
    result.addTest(new TestSuite(RandoopTest93.class));
    result.addTest(new TestSuite(RandoopTest94.class));
    result.addTest(new TestSuite(RandoopTest95.class));
    result.addTest(new TestSuite(RandoopTest96.class));
    result.addTest(new TestSuite(RandoopTest97.class));
    result.addTest(new TestSuite(RandoopTest98.class));
    result.addTest(new TestSuite(RandoopTest99.class));
    result.addTest(new TestSuite(RandoopTest100.class));
    result.addTest(new TestSuite(RandoopTest101.class));
    result.addTest(new TestSuite(RandoopTest102.class));
    return result;
  }

}
