package exception;
/*
 * Exception���ڳ����б���ʹ��try...catch���д�����
RuntimeException�����Բ�ʹ��try...catch���д���������������쳣���������쳣����JVM���д�����
 * ������RuntimeException- -
                                      
RuntimeException�ǿ����������������ģ������о�һ�³�����RuntimeException��
1��NullPointerException����������ˣ���ʵ�ܼ򵥣�һ�㶼����null�����ϵ��÷����ˡ�
2��NumberFormatException���̳�IllegalArgumentException���ַ���ת��Ϊ����ʱ���֡�
����int i= Integer.parseInt("ab3");
3��ArrayIndexOutOfBoundsException:����Խ�硣���� int[] a=new int[3]; int b=a[3];
4��StringIndexOutOfBoundsException���ַ���Խ�硣���� String s="hello"; char c=s.chatAt(6);
5��ClassCastException:����ת�����󡣱��� Object obj=new Object(); String s=(String)obj;
6��UnsupportedOperationException:�ò�������֧�֡��������ϣ����֧����������������׳����
�쳣����Ȼ��֧�ֻ�Ҫ��������п��������в���֧�ָ������еķ���������ֱ���׳�����쳣��
7��ArithmeticException���������󣬵��͵ľ���0��Ϊ������ʱ��
8��IllegalArgumentException���Ƿ��������ڰ��ַ���ת�������ֵ�ʱ�򾭳����ֵ�һ���쳣������
�������Լ��ĳ����кú���������쳣��
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