package MVC;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {
	// View : 사용자 화면
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 노래 재생을 담당하는 Controller 생성하기
		MusicController con = new MusicController();
		
		System.out.println("==========연재의 MP3 Player==========");

		
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			int input = sc.nextInt();
			System.out.println();
			
			if (input == 1) {
				System.out.println("======재생======");
				// 재생시킬 노래를 지정시키고 싶은 경우
				System.out.print("몇번째 노래를 재생시키겠습니까?(1~5) >> ");
				int songN = sc.nextInt();
				
				Music m = con.play(songN);
				
				System.out.println(m.getSinger() + " - " + m.getTitle() + " 이(가) 재생중입니다.");
				
			} else if (input == 2) {
				System.out.println("======정지======");
				
				if(con.stop()) {
					System.out.println("노래재생을 정지합니다!");
				} else {
					System.out.println("재생중인 노래가 없습니다.");
				}
				
			} else if (input == 3) {
				System.out.println("======이전곡======");
				Music m = con.prev();
				if(m != null) {
					System.out.println(m.getSinger() + " - " + m.getTitle() + " 이(가) 재생중입니다.");
				} else {
					System.out.println("이전 곡이 없습니다.");
				}
				
				
			} else if (input == 4) {
				System.out.println("======다음곡======");
				Music m = con.next();
				if(m != null) {
					System.out.println(m.getSinger() + " - "+ m.getTitle() + " 이(가) 재생중입니다.");
				} else {
					System.out.println("다음곡이 없습니다.");
				}
				
			} else if (input == 5) {
				System.out.println("======MP3 Player 종료======");
				con.stop();
				break;
				
			} else {
				System.out.println("번호를 잘못 눌렀습니다. 다시 눌러주세요.");
			}
		}
	}

}
