package hw;
import java.util.Scanner;
/*
 * Topic: 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/19
 * Author: 105021008 陳畯程
 */
public class hw04_105021008{
/* Math.pow(9,1/3)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float a=scn.nextFloat();
		float b=scn.nextFloat();
		System.out.print(Math.pow(a,1.0/b));
		
	}

}
