package generic;

class Mess<T> implements Echo<T>{
	public String echo(T echo) {
		return "Echo  "+echo;
	}
}

public class Generic_method {

	public static void main(String[] args) {
		Integer result[] = get(1,2,3);
		for (Integer i : result) {
			System.out.print(i+" ");
		}
	}
	public static<T> T[] get(T... arg) {
		return arg;
		
	}
}
