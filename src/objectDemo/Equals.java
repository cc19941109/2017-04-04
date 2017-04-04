package objectDemo;


//字符串对象为空和空字符串有区别
//  ""占内存，在内存中会分配一个空间。
//null不占内存，为空引用。
//字符串对象与null的值不相等，且内存地址也不相等；
//空字符串对象与null的值不相等，且内存地址也不相等；
//创建一个字符串对象的默认值为""

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "";
		String b = null;
		System.out.println(a.toString());
	//	System.out.println(b.toString());// java.lang.NullPointerException
		System.out.println(a.equals(b));//false  
		System.out.println(a==b);//false 
		
		String c = "ccc";
		String d = new String("ccc");
		System.out.println("c d "+c.equals(d));//c d true 相同内容
		System.out.println(c==d);//false  不同地址

		String e  = new String();//默认String
		System.out.println(e.equals(a));//true
		System.out.println(e.toString());//输出为空，即  e = "";
	}

}
