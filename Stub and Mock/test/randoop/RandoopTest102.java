package randoop;

import junit.framework.*;

public class RandoopTest102 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test1");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 0, 10);
    int var20 = var0.mid(10, 100, 0);
    int var24 = var0.mid((-1), 0, 0);
    int var28 = var0.mid(100, 0, 10);
    int var32 = var0.mid((-1), 10, 1);
    int var36 = var0.mid((-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test2");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), (-1), 100);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(1, 100, 10);
    int var20 = var0.mid(0, 1, 100);
    int var24 = var0.mid((-1), 100, 100);
    int var28 = var0.mid((-1), 10, 10);
    int var32 = var0.mid((-1), 10, 0);
    int var36 = var0.mid((-1), 1, 100);
    int var40 = var0.mid(100, 1, 1);
    int var44 = var0.mid(1, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test3");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid(0, 0, 10);
    int var20 = var0.mid((-1), 1, 0);
    int var24 = var0.mid((-1), 100, 10);
    int var28 = var0.mid(1, (-1), 1);
    int var32 = var0.mid(1, (-1), 100);
    int var36 = var0.mid(1, 0, 10);
    int var40 = var0.mid(100, 1, (-1));
    int var44 = var0.mid(10, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 10);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test4");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid(0, 0, (-1));
    int var20 = var0.mid(0, 10, 1);
    int var24 = var0.mid((-1), 10, 10);
    int var28 = var0.mid(10, 1, 10);
    int var32 = var0.mid(1, 100, (-1));
    int var36 = var0.mid(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test5");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid(0, 0, 10);
    int var20 = var0.mid((-1), 1, 0);
    int var24 = var0.mid((-1), 100, 10);
    int var28 = var0.mid(1, (-1), 1);
    int var32 = var0.mid(1, (-1), 100);
    int var36 = var0.mid(0, 1, 10);
    int var40 = var0.mid((-1), 0, 0);
    int var44 = var0.mid(0, 10, (-1));
    int var48 = var0.mid(100, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test6");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), (-1), 100);
    int var12 = var0.mid(1, 1, (-1));
    int var16 = var0.mid((-1), 100, 0);
    int var20 = var0.mid((-1), (-1), (-1));
    int var24 = var0.mid(100, (-1), 100);
    int var28 = var0.mid(0, 1, 0);
    int var32 = var0.mid(10, 10, 100);
    int var36 = var0.mid((-1), 0, 1);
    int var40 = var0.mid(0, 100, 10);
    int var44 = var0.mid(1, (-1), 1);
    int var48 = var0.mid((-1), 1, 1);
    
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
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test7");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(100, 100, 1);
    int var16 = var0.mid(1, 100, (-1));
    int var20 = var0.mid((-1), 10, 100);
    int var24 = var0.mid(1, 1, 1);
    int var28 = var0.mid(1, 1, (-1));
    int var32 = var0.mid(10, (-1), (-1));
    int var36 = var0.mid(0, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test8");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 0, 0);
    int var16 = var0.mid(100, 100, 100);
    int var20 = var0.mid(10, 100, (-1));
    int var24 = var0.mid(1, 0, 100);
    int var28 = var0.mid((-1), 100, 10);
    int var32 = var0.mid(1, (-1), 1);
    int var36 = var0.mid((-1), 0, (-1));
    int var40 = var0.mid(1, 0, (-1));
    int var44 = var0.mid(10, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 10);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test9");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(10, 100, 1);
    int var24 = var0.mid(10, 100, 1);
    int var28 = var0.mid(100, 100, 100);
    int var32 = var0.mid(0, 0, 1);
    int var36 = var0.mid(100, (-1), 100);
    int var40 = var0.mid(100, 1, 1);
    int var44 = var0.mid((-1), 1, 1);
    int var48 = var0.mid(100, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test10");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid(10, 0, (-1));
    int var12 = var0.mid(1, 0, (-1));
    int var16 = var0.mid((-1), 100, 10);
    int var20 = var0.mid(0, 0, 1);
    int var24 = var0.mid(100, (-1), (-1));
    int var28 = var0.mid(10, (-1), 0);
    int var32 = var0.mid(1, 100, 1);
    int var36 = var0.mid((-1), 0, 10);
    int var40 = var0.mid(1, 1, 1);
    
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
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test11");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid((-1), 0, 1);
    int var20 = var0.mid(10, 10, 100);
    int var24 = var0.mid(10, 0, 0);
    int var28 = var0.mid(100, 10, 0);
    int var32 = var0.mid(100, 10, 1);
    int var36 = var0.mid(10, 0, 10);
    
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
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 10);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test12");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid((-1), 1, 1);
    int var12 = var0.mid(0, 10, 10);
    int var16 = var0.mid(10, (-1), 10);
    int var20 = var0.mid(1, 1, 0);
    int var24 = var0.mid(1, (-1), 1);
    int var28 = var0.mid(100, (-1), 1);
    int var32 = var0.mid(1, 10, 1);
    int var36 = var0.mid(1, 1, 1);
    int var40 = var0.mid(100, 1, 100);
    int var44 = var0.mid(1, 10, 1);
    
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
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test13");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid((-1), 0, 1);
    int var20 = var0.mid(10, 10, 100);
    int var24 = var0.mid((-1), 100, 10);
    int var28 = var0.mid(100, 0, 0);
    int var32 = var0.mid(10, 1, 10);
    int var36 = var0.mid(10, 1, 10);
    int var40 = var0.mid(1, 1, 10);
    int var44 = var0.mid(0, 0, 100);
    int var48 = var0.mid(10, 100, 1);
    
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

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test14");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 100, 0);
    int var8 = var0.mid((-1), 100, 1);
    int var12 = var0.mid(10, 1, 100);
    int var16 = var0.mid((-1), 1, 10);
    int var20 = var0.mid(1, 100, 0);
    int var24 = var0.mid((-1), 1, 10);
    int var28 = var0.mid(100, 10, 1);
    int var32 = var0.mid(1, 0, 100);
    int var36 = var0.mid((-1), 10, 0);
    int var40 = var0.mid(10, 100, 10);
    int var44 = var0.mid(10, 1, 0);
    
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
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest102.test15");


    cn.tjuscs.st.Mid var0 = new cn.tjuscs.st.Mid();
    int var4 = var0.mid((-1), 10, 100);
    int var8 = var0.mid(1, 1, 10);
    int var12 = var0.mid((-1), 1, 10);
    int var16 = var0.mid((-1), 10, 10);
    int var20 = var0.mid(100, 1, 0);
    int var24 = var0.mid(1, (-1), 10);
    int var28 = var0.mid(1, 1, 10);
    int var32 = var0.mid(10, (-1), (-1));
    int var36 = var0.mid(100, 1, (-1));
    int var40 = var0.mid((-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);

  }

}
