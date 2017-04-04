package objectDemo;


//字符串对象为空和空字符串有区别
//  ""占内存，在内存中会分配一个空间。
//null不占内存，为空引用。

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "";
		String b = null;
		System.out.println(a.toString());
	//	System.out.println(b.toString());// java.lang.NullPointerException
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		String c = "ccc";
		String d = new String("ccc");
		System.out.println("c d "+c.equals(d));
		System.out.println(c==d);

		String e  = new String();
		System.out.println(e.equals(a));
		System.out.println(e.toString());//new String -->""
	}

}
