package 최종;

import java.util.Scanner;

public class problem_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int su = sc.nextInt();
		
		System.out.println(dan + "단");
		for(int i = 1; i <= su; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}

}
