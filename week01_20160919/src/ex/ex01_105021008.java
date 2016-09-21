package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華a氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021008 陳畯程
 */

public class ex01_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a = scn.nextInt();
		System.out.print(((a-32)*(5.0/9.0)));

	}

}
