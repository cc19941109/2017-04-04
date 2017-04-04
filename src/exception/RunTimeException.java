package exception;
/*
 * Exception：在程序中必须使用try...catch进行处理。
RuntimeException：可以不使用try...catch进行处理，但是如果有异常产生，则异常将由JVM进行处理。
 * 常见的RuntimeException- -
                                      
RuntimeException是开发中最容易遇到的，下面列举一下常见的RuntimeException：
1、NullPointerException：见的最多了，其实很简单，一般都是在null对象上调用方法了。
2、NumberFormatException：继承IllegalArgumentException，字符串转换为数字时出现。
比如int i= Integer.parseInt("ab3");
3、ArrayIndexOutOfBoundsException:数组越界。比如 int[] a=new int[3]; int b=a[3];
4、StringIndexOutOfBoundsException：字符串越界。比如 String s="hello"; char c=s.chatAt(6);
5、ClassCastException:类型转换错误。比如 Object obj=new Object(); String s=(String)obj;
6、UnsupportedOperationException:该操作不被支持。如果我们希望不支持这个方法，可以抛出这个
异常。既然不支持还要这个干吗？有可能子类中不想支持父类中有的方法，可以直接抛出这个异常。
7、ArithmeticException：算术错误，典型的就是0作为除数的时候。
8、IllegalArgumentException：非法参数，在把字符串转换成数字的时候经常出现的一个异常，我们
可以在自己的程序中好好利用这个异常。
 * */

public class RunTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = null;
		String string2 = "null";
		System.out.println(string2);//null
		System.out.println(string);//null
		System.out.println(string2.equals(string));//false
		//System.out.println(string.toString());// java.lang.NullPointerException

	}

}
