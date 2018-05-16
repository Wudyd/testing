package cn.tjuscs.st;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestA.class,
		TestB.class})
public class TestSuite {
	/*
	 * 测试原则：
	 * 	1、建议创建一个专门的source folder --> test
	 *  2、测试类的包应该保持和需要测试的类一致
	 *  3、测试单元中的每一个测试方法都必须独立执行，没有顺序
	 *    测试方法
	 */

}
