package objectDemo;


//�ַ�������Ϊ�պͿ��ַ���������
//  ""ռ�ڴ棬���ڴ��л����һ���ռ䡣
//null��ռ�ڴ棬Ϊ�����á�

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
