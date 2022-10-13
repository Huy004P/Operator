package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao a");
		int a = sc.nextInt();
		System.out.println("nhap vao b");
		int b = sc.nextInt();
		System.out.println("nhap vao c");
		int c = sc.nextInt();
		System.out.println("-----------");

		int tong = a + b;
		System.out.println("a + b= " + tong);
		int hieu = a - b;
		System.out.println("a - b= " + hieu);
		int tich = a * b;
		System.out.println("a * b= " + tich);
		int thuong = a / b;
		System.out.println("a / b= " + thuong);
		System.out.println("-----------");

		boolean lonHon = a > b;
		boolean beHon = a < b;
		boolean beHonBang = a <= b;
		boolean lonHonBang = a >= b;
		System.out.println(lonHon);
		System.out.println(beHon);
		System.out.println(beHonBang);
		System.out.println(lonHonBang);

	}

}
