package exception;


//Custom Exception �Զ����쳣

class   MyException  extends Exception{
	public MyException(String s){
		super(s);
	}
}

public class Custom_Exception {

	public static void main(String[] args) throws MyException {
		
		throw new MyException("custom exception");
		
	}

}
