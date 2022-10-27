package project;

import java.util.Scanner;

public class Project {
	public static final int MAX = 10;

	static String[] box = new String[MAX];
	static int[] price = new int[MAX];
	static int[] stock = new int[MAX];
	static int count = 5;
	static int admin = 0000;
	static int profit = 0;
	static Scanner sc = new Scanner(System.in);

	public static void initialize() {
		box[0] = "water";
		price[0] = 500;
		stock[0] = 5;
		box[1] = "cola";
		price[1] = 1000;
		stock[1] = 5;
		box[2] = "cider";
		price[2] = 1000;
		stock[2] = 5;
		box[3] = "coffee";
		price[3] = 800;
		stock[3] = 5;
		box[4] = "milk";
		price[4] = 700;
		stock[4] = 5;
	}

	public static void admin() {
		while (true) {
			System.out.println("==============================");
			System.out.println("관리자 페이지 입니다.");
			System.out.println("1:메뉴 변경 2:가격 변경 3:재고 추가 4:메뉴 추가 5: 수익 확인 9:종료");
			System.out.print("번호를 입력하세요: ");
			int num = sc.nextInt();
			System.out.println("===============================");

			if (num == 1) {
				System.out.print("변경하실 메뉴의 번호를 입력하세요(1~" + count + ") :");
				int i = sc.nextInt();
				System.out.print(box[i - 1] + "을(를) 무엇으로 바꾸시겠습니까? :");
				sc.nextLine();
				String name = sc.next();
				System.out.print(name + "의 가격은 얼마입니까? ");
				int v = sc.nextInt();
				System.out.print(name + "의 재고를 몇 개 등록하시겠습니까? : ");
				int n = sc.nextInt();

				box[i - 1] = name;
				price[i - 1] = v;
				stock[i - 1] = n;
				System.out.println("메뉴 변경이 완료되었습니다!");
			} else if (num == 2) {
				System.out.print("가격을 변경하실 메뉴의 번호를 입력하세요(1~" + count + ") :");
				int i = sc.nextInt();
				System.out.print(box[i - 1] + "의 가격을 얼마로 바꾸시겠습니까? :");
				int j = sc.nextInt();
				price[i - 1] = j;
				System.out.println("가격 변경이 완료되었습니다!");
			} else if (num == 3) {
				System.out.print("재고를 추가하실 메뉴의 번호를 입력하세요(1~" + count + ") :");
				int i = sc.nextInt();
				System.out.print(box[i - 1] + "를(을) 몇 개 추가 하시겠습니까? :");
				int j = sc.nextInt();
				stock[i - 1] += j;
				System.out.println("재고 추가가 완료되었습니다!");
			} else if (num == 6) {
				if (count >= MAX - 1) {
					System.out.println("더 이상 메뉴가 들어갈 자리가 없습니다!");
					continue;
				} else {
					System.out.print("추가하실 메뉴의 가격을 입력하세요 : ");
					int i = sc.nextInt();
					System.out.print("추가하실 메뉴의 이름을 입력하세요 : ");
					sc.nextLine();
					String name = sc.next();
					System.out.print(name + "의 재고는 몇 개 입니까? : ");
					int j = sc.nextInt();

					box[count] = name;
					price[count] = i;
					stock[count] = j;
					count++;
					System.out.println("메뉴 추가가 완료되었습니다!");
				}
			} else if (num == 5) {
				System.out.println("현재까지의 수익은 " + profit + "입니다.");
			}
			else if (num == 9) {
				user();
				return;
			}
		}

	}

	public static void user() {
		Boolean first = true;
		int money = 0;

		while (true) {
			System.out.println("==================================================");
			System.out.println(" 자판기 입니다. (번호:상품(재고))");
			for (int i = 0; i < count; i++) {
				System.out.print((i + 1) + ":" + box[i] + "(" + price[i] + "원)-" + stock[i] + "개   ");
			}

			System.out.println();
			System.out.println("==================================================");

			if (first) {
				System.out.print("돈을 넣어주세요: ");
				money = sc.nextInt();
				first = false;
			}

			if (money == 0000) {
				admin();
				return;
			}

			System.out.print("메뉴 입력: ");
			int num = sc.nextInt();

			if (money >= price[num - 1]) {
				if (stock[num - 1] > 0) {
					money = money - price[num - 1];
					stock[num - 1]--;
					profit += price[num - 1];
					System.out.println(box[num - 1] + "이(가) 나왔다!");
				} else {
					System.out.println("현재 재고가 없습니다!");
					continue;
				}
			} else {
				System.out.println("잔액이 부족합니다!");
			}

			System.out.println("잔액 : " + money);

			if (money == 0) {
				System.out.println("감사합니다! 다음에 또 이용해주세요!!");
				first = true;
				continue;
			}

			System.out.println("1: 계속 구매하기 2: 금액 추가하기 3: 잔돈 반환하기 ");
			System.out.print("번호를 입력하세요: ");
			int num1 = sc.nextInt();

			if (num1 == 1) {
				continue;
			} else if (num1 == 2) {
				System.out.print("돈을 넣어주세요 : ");
				int extra = sc.nextInt();
				money += extra;
				System.out.println("금액이 추가되었습니다! 잔액: " + money);
			}

			else if (num1 == 3) {
				System.out.println("거스름돈 " + money + "원이 반환됩니다.");
				System.out.println("감사합니다! 다음에 또 이용해주세요!!");
				first = true;
			}

		}
	}

	public static void main(String[] args) {
		initialize();
		user();
		return;

	}

}
