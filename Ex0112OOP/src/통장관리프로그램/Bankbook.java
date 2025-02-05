package 통장관리프로그램;

public class Bankbook {
	// 통장관리 프로그램을 만든다고 가정
	// 통장 설계도면 ---> 통장을 관리할 수 있는 우리만의 자료형 만들기

	// 1. Field(Data, 속성)
	// 잔액(money)
	private int money;
	// 정보 은닉을 지켜주어야한다.(사용자 임의로 변경하는 것을 막는다.)
	

	// 2. Method(Logic, 행위, 기능)
	// 입금하다(deposit)
	public void deposit(int money) {
		this.money += money;
		// this : 현재 클래스 자체를 의미하는 키워드
	}

	// 출금하다(withdraw)
	public void withdraw(int money) {
		this.money -= money;
	}

	// 잔액확인(showMoney)
	// 매개변수 X, 현재 잔액을 리턴해주는 메소드
	public int showMoney() {
		return this.money;
	}

}
