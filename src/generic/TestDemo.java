package generic;
//generic interface 

/*already defined in Generic_method
 * class Mess<T> implements Echo<T>{
	public String echo(T echo) {
		return "Echo  "+echo;
	}
}
 * */

public class TestDemo {

	public static void main(String[] args) {
		Mess<String> msg = new Mess<>();
		System.out.println(msg.echo("cc"));
	}

}
