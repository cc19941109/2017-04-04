package exception;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "13,"; 
		int i =0;
		 i =Integer.parseInt(string,16);//16进制 -->10进制
		 //java.lang.NumberFormatExceptio
		 i = Integer.parseInt(string);
		 System.out.println(i);
	}

}
