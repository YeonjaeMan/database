package 메소드;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '-';
		System.out.println(cal(num1, num2, op));
	}

	// private : 다른 클래스에서는 접근이 불가능하게 막아주는 접근제한자
	private static int cal(int num1, int num2, char op) {
		int result = 0;
		// op가 어떤 연산자가 들어있는지 판별
		switch(op) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 >= num2 ? num1 - num2 : num2 - num1;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		case '%' :
			result = num1 % num2;
			break;
		default :
			result = 0;
			break;
		}
		
		return result;
	}
}
