package weekly.weekly2;

public class PremiumShoppingMall extends ShoppingMall {
	public PremiumShoppingMall(int capacity) {
		super(capacity);
	}

	@Override
	public boolean checkOrderAvailability() {
		Product[] products = super.products; // 부모(ShoppingMall)의 상품이 담긴 배열

		boolean isOrderAvailable = true; // 주문 가능 여부

		for (int i = 0; i < products.length; i++) {
			// 모든 상품의 재고량 중 하나라도 10개가 안 되면 주문 불가
			if (products[i] != null && products[i].getStock() < 10) {
				isOrderAvailable = false;
				break;
			}
		}

		return isOrderAvailable; // 주문 가능 여부 반환
	}
}