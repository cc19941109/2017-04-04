package common_Library;


/*
 * random.nextInt(101);  小于101的int型数
 * round  四舍五入
 * */
import java.util.Random;

public class Random_Math_Demo {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i =0 ;i<1000;i++){
			int x = random.nextInt(101);
			if(x>=100){
				System.out.println(x);
			}
		}
		System.out.println(Math.round(1.5));
		System.out.println(Math.round(-1.5));
		System.out.println(Math.round(-1.51));
		
	}

}
