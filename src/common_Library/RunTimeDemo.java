package common_Library;

/*
 * RunTime 的构造方法都被私有化了
 * GC  Garbage Collector  垃圾收集器  
 * 1. jvm不定期的执行GC
 * 2. 用户自己手动调用runtime()的gc(),进行垃圾释放
 * */

public class RunTimeDemo {

	public static void main(String[] args) {
		Runtime runtime  = Runtime.getRuntime();//实例化
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.totalMemory());
		runtime.gc();
		System.out.println(runtime.freeMemory());
	}

}
