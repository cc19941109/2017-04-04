package common_Library;

/*String类 不能被继承
StringBuilder 常用方法
append    insert   replace 等
*/

public class StringBuffer {

	public static void main(String[] args) {
			StringBuilder a = new StringBuilder("hello ");
			StringBuilder b = new StringBuilder("world ");
			a.append(b);
			System.out.println(a.reverse());
			String c = a.toString();
			StringBuilder dBuilder = new StringBuilder();
			dBuilder = dBuilder.append(c.toUpperCase());
			dBuilder.reverse();
			System.out.println(dBuilder);
			System.out.println(dBuilder.replace(6, 12, "nihao"));
			System.out.println(dBuilder.insert(0,"cc "));
			System.out.println(dBuilder.lastIndexOf("i"));
			System.out.println(dBuilder.capacity()+"  "+dBuilder.length());
			dBuilder.append(" ha");
			System.out.println(dBuilder.capacity()+"  "+dBuilder.length());
			
	}

}
