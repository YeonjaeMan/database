package 자바페스티벌;

public class Pro_b3 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1, num2, op));
		
		
	}
	
	private static int cal(int num1, int num2, char op) {
		
		int result = 0;
		
		if(op == '+') {
			result = num1 + num2;
		} else if(op == '-') {
			result = num1 - num2;
		} else if(op == '*') {
			result = num1 * num2;
		} else if(op == '/') {
			result = num1 / num2;
		}
		
		return result;
	}

}
