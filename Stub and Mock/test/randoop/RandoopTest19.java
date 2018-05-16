package randoop;

import junit.framework.*;

public class RandoopTest19 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test1");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(100, 100, 10);
    int var24 = var0.mid(10, 0, 1);
    int var28 = var0.mid(0, 0, 10);
    int var32 = var0.mid(1, 100, 1);
    int var36 = var0.mid((-1), 0, 10);
    int var40 = var0.mid(1, 0, 1);
    int var44 = var0.mid(0, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 10);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test2");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid((-1), 100, 1);
    int var20 = var0.mid(100, 1, 0);
    int var24 = var0.mid(0, 10, 100);
    int var28 = var0.mid((-1), (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test3");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid(1, (-1), 1);
    int var8 = var0.mid(1, 1, (-1));
    int var12 = var0.mid(0, (-1), 10);
    int var16 = var0.mid(10, 0, 1);
    int var20 = var0.mid(100, (-1), 100);
    int var24 = var0.mid(1, 1, (-1));
    int var28 = var0.mid(1, 0, 100);
    int var32 = var0.mid(0, 1, 100);
    int var36 = var0.mid(1, 10, 1);
    int var40 = var0.mid(100, 0, (-1));
    int var44 = var0.mid(1, 0, 0);
    int var48 = var0.mid(10, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test4");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(1, 10, 0);
    int var24 = var0.mid(1, 0, (-1));
    int var28 = var0.mid((-1), 10, 1);
    int var32 = var0.mid(10, 1, 1);
    int var36 = var0.mid(100, 0, 100);
    int var40 = var0.mid(10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test5");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid(1, (-1), 1);
    int var8 = var0.mid(100, 0, (-1));
    int var12 = var0.mid(0, 1, (-1));
    int var16 = var0.mid(0, 1, 100);
    int var20 = var0.mid(10, 10, (-1));
    int var24 = var0.mid(0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test6");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(100, 100, 10);
    int var24 = var0.mid(100, (-1), 10);
    int var28 = var0.mid(1, 0, (-1));
    int var32 = var0.mid(10, 10, 0);
    int var36 = var0.mid(0, 1, 1);
    int var40 = var0.mid(0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test7");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(100, 100, 10);
    int var24 = var0.mid(10, 0, 1);
    int var28 = var0.mid(0, 0, 10);
    int var32 = var0.mid(1, 100, 1);
    int var36 = var0.mid(1, 0, 0);
    int var40 = var0.mid(0, (-1), 100);
    int var44 = var0.mid(100, 0, 1);
    int var48 = var0.mid((-1), 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test8");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(1, 0, (-1));
    int var24 = var0.mid(100, (-1), (-1));
    int var28 = var0.mid(0, 100, 100);
    int var32 = var0.mid((-1), 0, 0);
    int var36 = var0.mid(0, 100, 0);
    int var40 = var0.mid(0, 1, 10);
    int var44 = var0.mid(100, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test9");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 0, 0);
    int var16 = var0.mid(100, (-1), 0);
    int var20 = var0.mid(10, 10, 10);
    int var24 = var0.mid(1, 0, 100);
    int var28 = var0.mid((-1), 10, (-1));
    int var32 = var0.mid(100, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test10");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(1, (-1), 0);
    int var24 = var0.mid((-1), 100, 1);
    int var28 = var0.mid(10, 0, 100);
    int var32 = var0.mid(1, 100, 10);
    int var36 = var0.mid(1, (-1), 100);
    int var40 = var0.mid(0, 10, 10);
    int var44 = var0.mid(100, 1, 0);
    int var48 = var0.mid(100, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 100);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test11");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid((-1), 0, 1);
    int var20 = var0.mid(10, 10, 100);
    int var24 = var0.mid((-1), 100, 10);
    int var28 = var0.mid(1, 1, 10);
    int var32 = var0.mid((-1), 10, 10);
    int var36 = var0.mid(0, 1, (-1));
    int var40 = var0.mid(1, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test12");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(0, 10, (-1));
    int var24 = var0.mid((-1), 100, 1);
    int var28 = var0.mid(10, 10, (-1));
    int var32 = var0.mid(0, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test13");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid((-1), 1, 10);
    int var20 = var0.mid(1, 100, 0);
    int var24 = var0.mid((-1), 1, 10);
    int var28 = var0.mid(10, (-1), 0);
    int var32 = var0.mid(10, 0, (-1));
    int var36 = var0.mid((-1), (-1), 1);
    int var40 = var0.mid(10, 100, 0);
    int var44 = var0.mid(0, 100, (-1));
    int var48 = var0.mid(1, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test14");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(100, 100, 10);
    int var24 = var0.mid(10, 0, 1);
    int var28 = var0.mid(0, 0, 10);
    int var32 = var0.mid(1, 100, 0);
    int var36 = var0.mid(100, 1, 100);
    int var40 = var0.mid(1, 10, 100);
    int var44 = var0.mid(1, 1, 10);
    int var48 = var0.mid((-1), 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test15");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(1, (-1), 0);
    int var24 = var0.mid((-1), 100, 1);
    int var28 = var0.mid(10, 0, 100);
    int var32 = var0.mid((-1), 10, 100);
    int var36 = var0.mid(1, 10, 100);
    int var40 = var0.mid(100, 10, 1);
    int var44 = var0.mid(0, 0, 0);
    int var48 = var0.mid(10, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test16");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(100, 0, 100);
    int var24 = var0.mid((-1), 1, 10);
    int var28 = var0.mid(0, 0, 10);
    int var32 = var0.mid(100, (-1), 100);
    int var36 = var0.mid(100, 10, 0);
    int var40 = var0.mid(0, 10, 10);
    int var44 = var0.mid(1, 100, 100);
    int var48 = var0.mid(10, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test17");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), (-1), 100);
    int var12 = var0.mid(100, 0, 0);
    int var16 = var0.mid(100, 100, 100);
    int var20 = var0.mid(100, 100, 1);
    int var24 = var0.mid(10, (-1), 100);
    int var28 = var0.mid((-1), (-1), 100);
    int var32 = var0.mid(1, 1, 1);
    int var36 = var0.mid(1, 100, 0);
    int var40 = var0.mid((-1), (-1), 0);
    int var44 = var0.mid(100, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test18");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), (-1), 100);
    int var12 = var0.mid(1, 1, (-1));
    int var16 = var0.mid(100, 0, 100);
    int var20 = var0.mid((-1), 0, 100);
    int var24 = var0.mid(100, 0, 0);
    int var28 = var0.mid(10, (-1), 100);
    int var32 = var0.mid(10, 0, 1);
    int var36 = var0.mid((-1), 1, (-1));
    int var40 = var0.mid(1, 1, 1);
    int var44 = var0.mid((-1), (-1), 1);
    int var48 = var0.mid(1, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test19");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid(1, (-1), 1);
    int var8 = var0.mid(0, (-1), (-1));
    int var12 = var0.mid(0, (-1), 100);
    int var16 = var0.mid(10, 1, 1);
    int var20 = var0.mid(10, (-1), 0);
    int var24 = var0.mid(100, 10, 0);
    int var28 = var0.mid(100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test20");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(1, 1, 0);
    int var24 = var0.mid(1, (-1), 1);
    int var28 = var0.mid(1, 0, 0);
    int var32 = var0.mid(1, 0, 100);
    int var36 = var0.mid(1, 10, 10);
    int var40 = var0.mid((-1), 0, 1);
    int var44 = var0.mid(100, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test21");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(1, 1, 0);
    int var24 = var0.mid(1, (-1), 1);
    int var28 = var0.mid(0, 0, 0);
    int var32 = var0.mid(100, 1, 0);
    int var36 = var0.mid(10, (-1), 0);
    int var40 = var0.mid(1, 1, (-1));
    int var44 = var0.mid(100, (-1), 1);
    int var48 = var0.mid(100, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 100);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test22");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid(0, (-1), 100);
    int var12 = var0.mid(0, 100, 100);
    int var16 = var0.mid(10, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test23");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, 1, 10);
    int var20 = var0.mid((-1), 1, (-1));
    int var24 = var0.mid((-1), 10, 1);
    int var28 = var0.mid(100, 1, 1);
    int var32 = var0.mid((-1), 1, 100);
    int var36 = var0.mid(1, 100, 1);
    int var40 = var0.mid(0, 10, 100);
    int var44 = var0.mid(100, 0, (-1));
    int var48 = var0.mid(0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test24");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid((-1), 1, 10);
    int var20 = var0.mid(1, 100, 0);
    int var24 = var0.mid((-1), 1, 10);
    int var28 = var0.mid(100, 10, 1);
    int var32 = var0.mid(100, 100, 10);
    int var36 = var0.mid(1, 0, 10);
    int var40 = var0.mid((-1), 100, 10);
    int var44 = var0.mid(10, 1, 10);
    int var48 = var0.mid((-1), (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test25");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid(1, (-1), 1);
    int var8 = var0.mid(100, 0, (-1));
    int var12 = var0.mid(10, 100, 0);
    int var16 = var0.mid(1, 0, 1);
    int var20 = var0.mid(1, 0, 1);
    int var24 = var0.mid(10, 100, 100);
    int var28 = var0.mid(10, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test26");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(100, 100, 10);
    int var24 = var0.mid(10, 0, 1);
    int var28 = var0.mid(0, 0, 10);
    int var32 = var0.mid(1, 100, 0);
    int var36 = var0.mid(100, 1, 100);
    int var40 = var0.mid(100, 10, 1);
    int var44 = var0.mid((-1), 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test27");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(100, 0, (-1));
    int var16 = var0.mid(10, 10, 1);
    int var20 = var0.mid(0, (-1), 0);
    int var24 = var0.mid(1, 100, 10);
    int var28 = var0.mid(1, (-1), 1);
    int var32 = var0.mid(0, 100, 10);
    int var36 = var0.mid(1, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test28");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(1, 10, 0);
    int var24 = var0.mid(10, 0, (-1));
    int var28 = var0.mid(1, 1, 1);
    int var32 = var0.mid(10, (-1), (-1));
    int var36 = var0.mid((-1), 100, 10);
    int var40 = var0.mid(1, (-1), (-1));
    int var44 = var0.mid(1, 100, 1);
    int var48 = var0.mid(100, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test29");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(0, 0, (-1));
    int var24 = var0.mid((-1), (-1), 10);
    int var28 = var0.mid((-1), 10, 100);
    int var32 = var0.mid(10, 100, 10);
    int var36 = var0.mid(10, 100, 0);
    int var40 = var0.mid((-1), 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 100);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test30");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), (-1), 100);
    int var12 = var0.mid(1, 1, (-1));
    int var16 = var0.mid(100, 0, 100);
    int var20 = var0.mid((-1), 0, 100);
    int var24 = var0.mid(100, 0, 0);
    int var28 = var0.mid(100, 0, 1);
    int var32 = var0.mid(1, (-1), 100);
    int var36 = var0.mid(100, 10, 10);
    int var40 = var0.mid(10, 10, 10);
    int var44 = var0.mid(100, (-1), 100);
    int var48 = var0.mid(0, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test31");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(100, 0, (-1));
    int var16 = var0.mid(10, 1, 0);
    int var20 = var0.mid(0, (-1), 0);
    int var24 = var0.mid(0, 100, 0);
    int var28 = var0.mid(100, 0, 0);
    int var32 = var0.mid(0, (-1), 0);
    int var36 = var0.mid(0, (-1), (-1));
    int var40 = var0.mid(10, 10, 0);
    int var44 = var0.mid(10, 100, 10);
    int var48 = var0.mid((-1), 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test32");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid(1, (-1), 1);
    int var8 = var0.mid(1, 1, (-1));
    int var12 = var0.mid(0, (-1), 10);
    int var16 = var0.mid(10, 0, 1);
    int var20 = var0.mid((-1), 100, 1);
    int var24 = var0.mid(100, 100, 100);
    int var28 = var0.mid((-1), (-1), 1);
    int var32 = var0.mid((-1), 10, 1);
    int var36 = var0.mid(0, 1, 1);
    int var40 = var0.mid(1, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test33");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid(0, (-1), 100);
    int var12 = var0.mid(0, 100, 100);
    int var16 = var0.mid(100, (-1), 1);
    int var20 = var0.mid(1, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test34");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(1, 1, 0);
    int var24 = var0.mid(1, (-1), 1);
    int var28 = var0.mid(100, (-1), 1);
    int var32 = var0.mid(100, 100, (-1));
    int var36 = var0.mid(10, 10, 10);
    int var40 = var0.mid((-1), 0, 100);
    int var44 = var0.mid(10, 0, 1);
    int var48 = var0.mid(100, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 100);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test35");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), (-1), 100);
    int var12 = var0.mid(1, 1, (-1));
    int var16 = var0.mid((-1), 100, 0);
    int var20 = var0.mid((-1), (-1), (-1));
    int var24 = var0.mid(100, (-1), 100);
    int var28 = var0.mid(1, (-1), 100);
    int var32 = var0.mid(0, 1, 1);
    int var36 = var0.mid(0, 1, 0);
    int var40 = var0.mid(0, 10, 100);
    int var44 = var0.mid(1, 10, 0);
    int var48 = var0.mid(0, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test36");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(10, 10, 1);
    int var24 = var0.mid(10, 1, 100);
    int var28 = var0.mid(1, 100, 0);
    int var32 = var0.mid(100, 1, 0);
    int var36 = var0.mid(10, 1, 100);
    int var40 = var0.mid(10, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test37");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(1, (-1), 0);
    int var24 = var0.mid((-1), 100, 1);
    int var28 = var0.mid(10, 0, 100);
    int var32 = var0.mid(1, 100, 10);
    int var36 = var0.mid(100, 100, 1);
    int var40 = var0.mid((-1), 0, 1);
    int var44 = var0.mid((-1), 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test38");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid(0, 0, 0);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid((-1), 10, 10);
    int var20 = var0.mid(1, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test39");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(100, 1, 1);
    int var24 = var0.mid((-1), 1, 1);
    int var28 = var0.mid(10, 1, 100);
    int var32 = var0.mid(100, 10, 0);
    int var36 = var0.mid((-1), 1, 100);
    int var40 = var0.mid((-1), 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test40");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), (-1), 100);
    int var12 = var0.mid(100, 0, 0);
    int var16 = var0.mid(100, 100, 100);
    int var20 = var0.mid(100, 100, 1);
    int var24 = var0.mid(100, 1, 0);
    int var28 = var0.mid(1, 10, 10);
    int var32 = var0.mid((-1), 1, 0);
    int var36 = var0.mid(0, 0, 1);
    int var40 = var0.mid((-1), 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 100);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test41");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(0, 0, 1);
    int var24 = var0.mid(100, (-1), 1);
    int var28 = var0.mid((-1), 0, 1);
    int var32 = var0.mid(10, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test42");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(100, 0, (-1));
    int var16 = var0.mid(1, (-1), 0);
    int var20 = var0.mid(0, 100, 10);
    int var24 = var0.mid((-1), 1, 1);
    int var28 = var0.mid(1, 0, 100);
    int var32 = var0.mid(10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test43");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(1, (-1), 0);
    int var24 = var0.mid((-1), 100, 1);
    int var28 = var0.mid(10, 0, 100);
    int var32 = var0.mid((-1), 10, 100);
    int var36 = var0.mid(1, 10, 100);
    int var40 = var0.mid((-1), 1, (-1));
    int var44 = var0.mid(100, 1, (-1));
    int var48 = var0.mid((-1), 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test44");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(1, (-1), 0);
    int var24 = var0.mid((-1), 100, 1);
    int var28 = var0.mid((-1), 100, 0);
    int var32 = var0.mid(1, 100, 10);
    int var36 = var0.mid(100, 1, 1);
    int var40 = var0.mid(1, 10, 10);
    int var44 = var0.mid((-1), 0, (-1));
    int var48 = var0.mid(1, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test45");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(100, 0, 100);
    int var16 = var0.mid(100, 0, (-1));
    int var20 = var0.mid(100, 0, 100);
    int var24 = var0.mid(1, 0, 100);
    int var28 = var0.mid(100, (-1), (-1));
    int var32 = var0.mid(10, 0, 0);
    int var36 = var0.mid(1, (-1), 1);
    int var40 = var0.mid((-1), 1, 10);
    int var44 = var0.mid(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test46");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid((-1), 1, 10);
    int var20 = var0.mid(1, 100, 0);
    int var24 = var0.mid((-1), 1, 10);
    int var28 = var0.mid(10, (-1), 0);
    int var32 = var0.mid(10, 0, (-1));
    int var36 = var0.mid(0, 100, 10);
    int var40 = var0.mid(100, (-1), (-1));
    int var44 = var0.mid(10, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test47");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(1, 1, 0);
    int var24 = var0.mid(1, (-1), 1);
    int var28 = var0.mid(1, 0, 0);
    int var32 = var0.mid((-1), 0, (-1));
    int var36 = var0.mid(10, 0, 100);
    int var40 = var0.mid(1, 10, 100);
    int var44 = var0.mid(100, 100, (-1));
    int var48 = var0.mid((-1), (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test48");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(100, 0, 100);
    int var24 = var0.mid((-1), 0, (-1));
    int var28 = var0.mid(10, 0, 100);
    int var32 = var0.mid(0, 1, 1);
    int var36 = var0.mid(10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test49");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid(1, (-1), 1);
    int var8 = var0.mid(1, 1, (-1));
    int var12 = var0.mid(10, 0, 10);
    int var16 = var0.mid(100, 10, (-1));
    int var20 = var0.mid(100, 100, 100);
    int var24 = var0.mid(10, (-1), 0);
    int var28 = var0.mid(10, 0, 0);
    int var32 = var0.mid(10, 1, 10);
    int var36 = var0.mid(1, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test50");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(1, 1, 0);
    int var24 = var0.mid(1, (-1), 1);
    int var28 = var0.mid(1, 0, 0);
    int var32 = var0.mid(1, 0, 100);
    int var36 = var0.mid(1, 10, 10);
    int var40 = var0.mid(100, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 100);

  }

}
