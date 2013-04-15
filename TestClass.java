package view;

/**
 * 一个测试类。最好看看里面的结构和注释
 * <br>
 * 需要统计class个数（=4）、有效代码行数（黑色的行=26行。包括import、构造函数等）、doc注释行数(=42行)、block注释行数（=9）、单行注释（=4）、空行（=17）<br>
 * 我们根据颜色就能看出来，eclise默认蓝色为doc注释、黑色的为代码、绿色为block或single line注释
 * <br>
 * 高级的功能
 * <ul>
 *   <li>enum类的个数（=1）</li>
 *  <li>static的个数（=2）</li>
 *  <li>interface的个数（=1）</li>
 *  <li>abstract的个数（=2）</li>
 *  <li>成员变量的个数（=2）</li>
 *  <li>具有好的规范（注释+编码风格+类的组织+）</li>
 *  <li><b>觉得好的代码或结构要特别说明！！</b></li>
 * </ul>
 * @author d
 *
 */
public class TestClass {
	
	/**
	 * 成员变量
	 */
	private Object o1;
	
	private String[] ss;
	
	/**
	 * 
	 * doc注释
	 */
	public void publicMethod1(){
		
		// single line comment
		System.out.println("publicMethod1 line 1");
		
		/*
		 * block comment 块注释
		 * 以下一行属于注释+代码。这样的情况比较麻烦。可以考虑实现~~加分~~
		 */System.out.println("publicMethod1 line 2");
	}
	
	/**
	 * doc注释
	 */
	private void privateMethod2(){
		/* 
		 * 比较规范的块注释
		 
		 上面那空行居然也是块注释的内容  + 空行！！
		 以下一行是纯代码（黑色滴~）*/
		System.out.println("privateMethod2 line 1");
		
		System.out.println("privateMethod2 line 2");// comment 加分~~  //即是代码又是注释的一行~~ 代码后面跟注释 
	}     //comment    //这个也算是代码和注释的一行（因为有个括号） 加分~~
	
	/**
	 * 静态类
	 *
	 */
	public static class StaticClass{
	}
	
	/**
	 * 静态接口
	 *
	 */
	public static interface StaticInterface{}
	
}  //这是代码+注释 （因为包行单前的注释）

/**
 * 一个枚举
 *
 */
enum Enum{
	
}

/** 一个抽象类*/
abstract class AbstractClass
{
	
} 

abstract class AbstractClass2 extends AbstractClass
{
	
}
