package generic;
/*
 * 泛型的好处
Java 语言中引入泛型是一个较大的功能增强。不仅语言、类型系统和编译器有了较大的变化，
以支持泛型，而且类库也进行了大翻修，所以许多重要的类，比如集合框架，都已经成为泛型化的了。
这带来了很多好处：
1，类型安全。 泛型的主要目标是提高 Java 程序的类型安全。通过知道使用泛型定义的变量的类型
限制，编译器可以在一个高得多的程度上验证类型假设。没有泛型，这些假设就只存在于程序员的
头脑中（或者如果幸运的话，还存在于代码注释中）。
2，消除强制类型转换。 泛型的一个附带好处是，消除源代码中的许多强制类型转换。这使得代码更
加可读，并且减少了出错机会。
3，潜在的性能收益。 泛型为较大的优化带来可能。在泛型的初始实现中，编译器将强制类型转换
（没有泛型的话，程序员会指定这些强制类型转换）插入生成的字节码中。但是更多类型信息可
用于编译器这一事实，为未来版本的 JVM 的优化带来可能。由于泛型的实现方式，支持泛型
（几乎）不需要 JVM 或类文件更改。所有工作都在编译器中完成，编译器生成类似于没有泛型
（和强制类型转换）时所写的代码，只是更能确保类型安全而已。
 * */


public class Demo1 {
	
	public static void main(String[] args) {
	
		Message<Integer> message =new Message<>();
		message.setInfo(100);
		print(message);
		Message<String> str = new Message<>();
		str.setInfo("welcome");
		print(str);
	}

	public static void print(Message<?> temp){
		System.out.println(temp.getInfo());
	}
}

class Message<T>{
	private T info;
	public void setInfo(T i ){
		this.info = i;
	}
	public  T  getInfo(){
		return info;
	}
	
}








