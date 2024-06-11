package daily;

// 2024. 06. 11 (화)

/* ---------------- 문제 ---------------- */
// 여러분 자신을 추상화 해봅시다.
// 그리고 상호작용 하고 싶은 대상을 만들어보고 서로 상호 작용 할 수 있는 메소드를 만들어 봅시다.

import java.util.ArrayList;

public class dailyQuiz6 {
	public static void main(String[] args) {
		My my = new My("홍길동", "남자", "팔토시", 39, 120);
		JoongGoMarket joongGoMarket = new JoongGoMarket();

		my.selfIntroduction();
		my.sayMyItem();

		joongGoMarket.registerItem(my.myItem);
		joongGoMarket.removeItem(my.myItem);
		joongGoMarket.registerItem("짚신");
		joongGoMarket.searchItem("부채");
		joongGoMarket.searchItem("짚신");
	}
}

class My {
	/* ---------------- 변수 ---------------- */
	String nickName;
	String gender;
	String myItem;
	int age;
	int confidenceFigure; // 신뢰 수치

	/* ---------------- 생성자 ---------------- */
	public My(String nickName, String gender, String myItem, int age, int confidenceFigure) {
		this.nickName = nickName;
		this.gender = gender;
		this.myItem = myItem;
		this.age = age;
		this.confidenceFigure = confidenceFigure;
	}

	/* ---------------- 메서드 ---------------- */
	// 자기소개
	public void selfIntroduction() {
		System.out.println("저의 닉네임은 " + nickName + "이고 성별은 " + gender + ", 나이는 " + age + "살입니다.");
		System.out.println("저의 신뢰도는 " + confidenceFigure + "점입니다.");
	}

	// 가진 물건 소개
	public void sayMyItem() {
		System.out.println("저는 " + myItem + "를(을) 가지고 있습니다.");
	}
}

class JoongGoMarket {
	/* ---------------- 변수 ---------------- */
	private ArrayList<String> items;

	/* ---------------- 생성자 ---------------- */
	public JoongGoMarket() {
		items = new ArrayList<>();
	}

	/* ---------------- 메서드 ---------------- */
	// 물품 등록하기
	public void registerItem(String item) {
		items.add(item);
		System.out.println("고객님의 상품 " + item + "이(가) 등록되었습니다.");
	}

	// 등록한 물품 삭제
	public void removeItem(String item) {
		boolean isItemRemoved = false;

		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equals(item)) {
				items.remove(i);
				isItemRemoved = true;
				System.out.println("등록한 고객님의 상품 " + item + "를(을) 내립니다.");
				break;
			}
		}

		if (!isItemRemoved) {
			System.out.println("삭제할 물품이(가) 없습니다.");
		}
	}

	// 물품 찾기
	public void searchItem(String item) {
		boolean isItemSearched = false;

		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equals(item)) {
				isItemSearched = true;
				System.out.println("찾는 물품 " + item + "이(가) 있습니다.");
				break;
			}
		}

		if (!isItemSearched) {
			System.out.println("찾는 물품 " + item + "이(가) 없습니다.");
		}
	}
}