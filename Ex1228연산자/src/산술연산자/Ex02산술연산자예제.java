package 산술연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받기
//		String name = sc.next();
//		
//		System.out.println("입력받은 글자는 >> " + name);
//		
//		System.out.println("숫자를 입력하세요 >> ");
//		// 3. 정수형 숫자 입력받기
//		int num = sc.nextInt();
		// 주석 단축키 : ctrl /
		
		// 1. 정수입력 글자 출력
		System.out.print("첫번째 정수 입력 : ");
		// 2. 정수 입력
		int firstNum = sc.nextInt();
		// 3. 정수입력 글자 출력
		System.out.print("두번째 정수 입력 : ");
		// 4. 정수 입력
		int secondNum = sc.nextInt();
		
		// 5. 더한 결과 값 출력 (연산까지!)
		System.out.println("더한 결과 값 : " + (firstNum + secondNum));
		System.out.println("뺀 결과 값 : " + (firstNum - secondNum));
		System.out.println("곱한 결과 값 : " + (firstNum * secondNum));
		System.out.println("나눈 결과 값 : " + (firstNum / (double)secondNum));
		// 한 줄 복사 단축키 : ctrl alt 화살표
	}

}
