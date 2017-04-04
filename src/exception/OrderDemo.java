package exception;
/*
 * Error类和Exception类的父类都是throwable类，他们的区别是：
Error类一般是指与虚拟机相关的问题，如系统崩溃，虚拟机错误，内存空间不足，方法调用栈溢等。对
于这类错误的导致的应用程序中断，仅靠程序本身无法恢复和和预防，遇到这样的错误，建议让程序终止。
Exception类表示程序可以处理的异常，可以捕获且可能恢复。遇到这类异常，应该尽可能
处理异常，使程序恢复运行，而不应该随意终止异常。
Exception类又分为运行时异常（Runtime Exception）和受检查的异常(Checked Exception )，运行
时异常;ArithmaticException,IllegalArgumentException，编译能通过，但是一运行就终止了，程序
不会处理运行时异常，出现这类异常，程序会终止。而受检查的异常，要么用try。。。catch捕获，要么
用throws字句声明抛出，交给它的父类处理，否则编译不会通过。
运行时异常是 Exception 的子类，也有一般异常的特点，是可以被 Catch 块处理的。只不过往往我们不
对他处理罢了。也就是说，你如果不对运行时异常进行处理，那么出现运行时异常之后，要么是线程中止，
要么是主程序终止。
如队列里面出现异常数据了，正常的处理应该是把异常数据舍弃，然后记录日志。不应
该由于异常数据而影响下面对正常数据的处理。
 * 
 * */


public class OrderDemo {
@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			System.out.println("1");
			
			int i =10/0;         //java.lang.ArithmeticException: / by zero
			System.out.println("2");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		System.out.println("5");
	}

}
