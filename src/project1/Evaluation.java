package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Evaluation {

	private static ArrayList<Player> playerList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("==========================================");
			System.out.println("1.선수추가 | 2.선수삭제 | 3.선수조회 | 4. 성적입력 | 5.종료");
			System.out.println("==========================================");
			System.out.print("선택>>");
			int selectNum = Integer.parseInt(scanner.next());
			switch (selectNum) {
			case 1:
				createPlayer();
				break;
			case 2:
				deletePlayer();
				break;
			case 3:
				searchPlayer();
				break;
			case 4:
				evaluation();
				break;
			default:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

	private static void createPlayer() {
		System.out.print("선수이름:");
		String name = scanner.next();
		System.out.print("선수나이: ");
		int age = scanner.nextInt();
		System.out.print("선수포지션:");
		String position = scanner.next();
		scanner.nextLine();
		Player p = new Player();
		p.setName(name);
		p.setAge(age);
		p.setPosition(position);
		playerList.add(p);
	}

	private static void deletePlayer() {
		System.out.print("선수이름: ");
		String name = scanner.next();
		boolean noneResult = false;
		for (int i = 0; i < playerList.size(); i++) {
			Player p = playerList.get(i);
			if (p.getName().equals(name)) {
				noneResult = true;
				playerList.remove(i);
				System.out.println("삭제되었습니다.");
				break;
			}
		}
		if (!noneResult) {
			System.out.println("검색결과가 없습니다.");
		}
	}

	private static void searchPlayer() {
		System.out.print("선수이름: ");
		String name = scanner.next();
		boolean noneResult = false;
		for (int i = 0; i < playerList.size(); i++) {
			Player p = playerList.get(i);
			if (p.getName().equals(name)) {
				noneResult = true;
				System.out.println("이름: " + p.getName() + "포지션: " + p.getPosition() + "나이: " + p.getAge() + " | 경기수:"
						+ p.getPlayed() + " | 슈팅:" + p.getShoot() + " | 유효슈팅:" + p.getTargetShot() + "| 골:"
						+ p.getGoal());
				break;
			}
		}
		if (!noneResult) {
			System.out.println("검색결과가 없습니다.");
		}
	}

	private static void evaluation() {
		System.out.print("선수이름: ");
		String name = scanner.next();
		boolean noneResult = false;
		for (int i = 0; i < playerList.size(); i++) {
			Player p = playerList.get(i);
			if (p.getName().equals(name)) {
				noneResult = true;
				System.out.print("경기수: ");
				int played = scanner.nextInt();
				System.out.print("슈팅: ");
				int shoot = scanner.nextInt();
				System.out.print("유효슈팅: ");
				int targetShot = scanner.nextInt();
				System.out.print("골: ");
				int goal = scanner.nextInt();
				p.setPlayed(played);
				p.setShoot(shoot);
				p.setTargetShot(targetShot);
				p.setGoal(goal);
				break;
			}
		}
		if (!noneResult) {
			System.out.println("검색결과가 없습니다.");
		}
	}
}
