package exception;
/*
 * Error���Exception��ĸ��඼��throwable�࣬���ǵ������ǣ�
Error��һ����ָ���������ص����⣬��ϵͳ����������������ڴ�ռ䲻�㣬��������ջ��ȡ���
���������ĵ��µ�Ӧ�ó����жϣ������������޷��ָ��ͺ�Ԥ�������������Ĵ��󣬽����ó�����ֹ��
Exception���ʾ������Դ�����쳣�����Բ����ҿ��ָܻ������������쳣��Ӧ�þ�����
�����쳣��ʹ����ָ����У�����Ӧ��������ֹ�쳣��
Exception���ַ�Ϊ����ʱ�쳣��Runtime Exception�����ܼ����쳣(Checked Exception )������
ʱ�쳣;ArithmaticException,IllegalArgumentException��������ͨ��������һ���о���ֹ�ˣ�����
���ᴦ������ʱ�쳣�����������쳣���������ֹ�����ܼ����쳣��Ҫô��try������catch����Ҫô
��throws�־������׳����������ĸ��ദ��������벻��ͨ����
����ʱ�쳣�� Exception �����࣬Ҳ��һ���쳣���ص㣬�ǿ��Ա� Catch �鴦��ġ�ֻ�����������ǲ�
����������ˡ�Ҳ����˵���������������ʱ�쳣���д�����ô��������ʱ�쳣֮��Ҫô���߳���ֹ��
Ҫô����������ֹ��
�������������쳣�����ˣ������Ĵ���Ӧ���ǰ��쳣����������Ȼ���¼��־����Ӧ
�������쳣���ݶ�Ӱ��������������ݵĴ���
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
