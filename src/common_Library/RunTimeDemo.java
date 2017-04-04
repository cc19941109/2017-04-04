package common_Library;

/*
 * RunTime �Ĺ��췽������˽�л���
 * GC  Garbage Collector  �����ռ���  
 * 1. jvm�����ڵ�ִ��GC
 * 2. �û��Լ��ֶ�����runtime()��gc(),���������ͷ�
 * */

public class RunTimeDemo {

	public static void main(String[] args) {
		Runtime runtime  = Runtime.getRuntime();//ʵ����
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.totalMemory());
		runtime.gc();
		System.out.println(runtime.freeMemory());
	}

}
