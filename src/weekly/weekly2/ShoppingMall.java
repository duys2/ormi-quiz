package weekly.weekly2;

public abstract class ShoppingMall {
	Product[] products;

	public ShoppingMall(int capacity) {
		products = new Product[capacity];
	}

	public void addProduct(Product product) {
		// 상품 객체 넣기
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) { // 상품이 있고
				if (products[i].getName().equals(product.getName())) { // 추가할 상품과 이름이 같으면
					products[i].setStock(products[i].getStock() + product.getStock()); // 재고량 추가
					return; // 더 이상 작동할 필요가 없으므로 메서드 종료
				}
			} else { // 상품이 없으면(비어있으면) 상품 추가
				products[i] = product;
				return;
			}
		}

		// 배열이 가득 차있다면: 여기까지 오면 배열이 가득 차있다는 뜻(다른 상품들만 있을 때)
		int currentSize = products.length; // 현재 배열의 사이즈

		// 기존 크기의 2배인 새로운 배열 생성 후 기존의 배열을 새로운 배열로 대치
		this.products = extendArray(products, currentSize);
		this.products[currentSize] = product; // 배열에 객체 추가
	}

	public void removeProduct(Product product) {
		int removedCount = 0;

		for (int i = 0; i < products.length; i++) {
			if (products[i] != null && products[i] == product) { // 해당 객체 삭제
				products[i] = null;
				removedCount++;
			}
		}

		if (removedCount == 0) {
			System.out.println("삭제하려는 상품이 없습니다.\n");
		}
	}

	public void removeProduct(String productName) {
		int removedCount = 0;

		for (int i = 0; i < products.length; i++) {
			if (products[i] != null && products[i].getName().equals(productName)) { // 이름이 같은 상품 삭제
				products[i] = null;
				removedCount++;
			}
		}

		if (removedCount == 0) {
			System.out.println("삭제하려는 상품이 없습니다.\n");
		}
	}

	public void displayProducts() {
		for (Product product : products) {
			if (product != null) { // 상품이 있다면 출력
				System.out.println("상품의 이름: " + product.getName());
				System.out.println("상품의 가격: " + product.calculatePrice()); // 가격 표시는 요구사항에 맞추어 조건별로 다르게 출력
				System.out.println("상품의 재고량: " + product.getStock());
				System.out.println();
			}
		}
	}

	public Product[] extendArray(Product[] products, int currentSize) {
		Product[] newProducts = new Product[currentSize * 2]; // 기존 사이즈 2배의 배열 생성

		// 기존 배열의 내용을 새로운 배열에 복사
		for (int j = 0; j < currentSize; j++) {
			newProducts[j] = products[j];
		}
		// 이렇게 해도 된다고 한다: System.arraycopy(products, 0, newProducts, 0, currentSize);

		return newProducts; // 배열 리턴
	}

	public abstract boolean checkOrderAvailability();
}