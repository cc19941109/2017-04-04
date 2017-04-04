package common_Library;

//finalize() 用于执行对象回收前的收尾操作

public class System_Demo {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String string = "";
		for(int i =0;i<100000;i++){
			string +=string;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
