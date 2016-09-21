package hw;
import java.util.Random;
import java.util.Scanner;
/*
 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 105021008 陳畯程
 */
public class hw02_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd= new Random();
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int v1 = rnd.nextInt(n)+1;
		int v2 = rnd.nextInt(n)+1;
		int v3 = rnd.nextInt(n)+1;
		int v4 = rnd.nextInt(n)+1;
		int v5 = rnd.nextInt(n)+1;
		int v6 = rnd.nextInt(n)+1;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
				

	}

}
