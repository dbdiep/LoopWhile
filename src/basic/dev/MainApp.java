package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int i = 0;
		int tong = 0;
		while (i <= 100) {
			tong += i;
			i++;
		}
		System.out.println("tong = " + tong);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao n");
		int n = sc.nextInt();
		
		int i1 = 0;
		int tong1 = 0;
		while (i1 <= n) {
			if (i1 % 3 == 0) {
				tong1 += i1;
			}
			i1++;
		}
		System.out.println("tong = " + tong1);
		
	}
}
