package 자바페스티벌;

import java.util.Scanner;

public class Pro_31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		int fac = 1;
		
		for(int i = 1; i <= n; i++) {
			fac *= i;
		}
		System.out.println("출력 : " + fac);
	}

}
