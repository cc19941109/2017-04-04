package objectDemo;


//�ַ�������Ϊ�պͿ��ַ���������
//  ""ռ�ڴ棬���ڴ��л����һ���ռ䡣
//null��ռ�ڴ棬Ϊ�����á�
//�ַ���������null��ֵ����ȣ����ڴ��ַҲ����ȣ�
//���ַ���������null��ֵ����ȣ����ڴ��ַҲ����ȣ�
//����һ���ַ��������Ĭ��ֵΪ""

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
		System.out.println("c d "+c.equals(d));//c d true ��ͬ����
		System.out.println(c==d);//false  ��ͬ��ַ

		String e  = new String();//Ĭ��String
		System.out.println(e.equals(a));//true
		System.out.println(e.toString());//���Ϊ�գ���  e = "";
	}

}
