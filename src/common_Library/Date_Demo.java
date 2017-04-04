package common_Library;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * Date-->long   long d = date.getTime();
 * long-->Date   Date date = new Date(System.currentTimeMillis());
 * 常用格式  yyyy/MM/dd  HH:mm:ss.SSS
 * */

import java.util.Date;
public class Date_Demo {

	public static void main(String[] args) throws ParseException {
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
		long d = date.getTime();
		System.out.println(d);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss.SSS");
		String string = sdf.format(new Date());
		System.out.println(string);
		Date date2 = sdf.parse(string);//throws ParseException
		System.out.println(date2);
		
	}

}
