package Question6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();

		while (true) {
			System.out.println("====뮤직 플레이어====");
			System.out.print("1.등록 2.목록 3.삭제 4.전체삭제 5.종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("====등록====");
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int playTime = sc.nextInt();

				list.add(new MusicVO(title, singer, playTime));

			} else if (input == 2) {
				System.out.println("====노래 목록====");
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". " + list.get(i).toString());
				}

			} else if (input == 3) {
				System.out.println("====노래 삭제====");
				System.out.print("삭제하고 싶은 노래 번호 입력 : ");
				int deleteSing = sc.nextInt();
				
				System.out.println(list.get(deleteSing - 1).getTitle() + " 노래를 삭제합니다.");
				list.remove(deleteSing - 1);
				
			} else if (input == 4) {
				System.out.println("====전체노래삭제====");
				list.clear();
				System.out.println("전체 노래가 삭제되었습니다.");
			} else if (input == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}

	}

}
