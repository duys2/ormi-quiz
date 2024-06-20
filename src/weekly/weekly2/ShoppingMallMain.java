package weekly.weekly2;

public class ShoppingMallMain {
	public static void main(String[] args) {
		ShoppingMall shoppingMall = new PremiumShoppingMall(1);

		/*  상품 객체 생성 */
		Product greenPlum = new Food("초록매실", 0.3, 10, 10);
		Product sikHye = new Food("비락식혜", 0.2, 20, 4);
		Product greenPlum2 = new Food("초록매실", 0.3, 15, 10); // 중복된 이름의 상품
		Product iphone = new Electronics("아이폰", 80.0, 1, "Apple");
		Product galaxy = new Electronics("갤럭시", 65.0, 22, "삼성");
		Product blackJeans = new Clothing("블랙진", 7.8, 12, "L");
		Product slacks = new Clothing("슬랙스", 5.0, 29, "M");

		/* 상품 추가 */
		shoppingMall.addProduct(greenPlum);
		shoppingMall.addProduct(sikHye);
		shoppingMall.addProduct(greenPlum2); // 중복된 이름의 상품 추가: 기존 상품의 재고량이 증가한다
		shoppingMall.addProduct(iphone);
		shoppingMall.addProduct(galaxy);
		shoppingMall.addProduct(blackJeans);
		shoppingMall.addProduct(slacks);

		System.out.println("=== 현재 상품 정보 출력 시작 ===");
		shoppingMall.displayProducts();
		System.out.println("=== 현재 상품 정보 출력 종료 ===\n");

		/* 상품 별 가격 출력 */
		System.out.println("=== 상품 별 가격 정보 표시 시작 ===");
		System.out.println("초록매실의 가격: " + greenPlum.calculatePrice());
		System.out.println("비락식혜의 가격: " + sikHye.calculatePrice());
		System.out.println("아이폰의 가격: " + iphone.calculatePrice());
		System.out.println("갤럭시의 가격: " + galaxy.calculatePrice());
		System.out.println("블랙진의 가격: " + blackJeans.calculatePrice());
		System.out.println("슬랙스의 가격: " + slacks.calculatePrice());
		System.out.println("=== 상품 별 가격 정보 표시 종료 ===\n");


		/* 상품 삭제 */
		shoppingMall.removeProduct("비락식혜");
		shoppingMall.removeProduct("비락식혜"); // 이미 지운 상품 삭제 시도: "삭제하려는 상품이 없습니다." 출력
		shoppingMall.removeProduct("코카콜라"); // 목록에 없는 상품 삭제 시도: "삭제하려는 상품이 없습니다." 출력
		shoppingMall.removeProduct(blackJeans); // 블랙진 삭제
		shoppingMall.removeProduct(blackJeans); // 이미 지운 상품 삭제 시도: "삭제하려는 상품이 없습니다." 출력

		System.out.println("=== 삭제 후 현재 상품 목록 출력 시작 ===");
		shoppingMall.displayProducts();
		System.out.println("=== 삭제 후 현재 상품 목록 출력 종료 ===\n");

		System.out.print("주문 가능 여부: ");
		// 주문 가능 여부 출력: 아이폰의 재고가 10 미만이므로 주문 불가
		System.out.println((shoppingMall.checkOrderAvailability() ? "주문이 가능합니다." : "주문이 불가능합니다."));
	}
}