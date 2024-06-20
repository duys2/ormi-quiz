package weekly.weekly2;

import java.util.Objects;

public class Clothing extends Product {
	private String size;

	public Clothing(String name, double price, int stock, String size) {
		super(name, price, stock); // 부모 생성자 호출은 맨 윗줄
		this.size = size;
	}

	@Override
	public double calculatePrice() { // 옷 사이즈: XS S M L XL 2XL 순서
		return (size.equals("L") || size.equals("XL") || size.equals("2XL")) ? getPrice() * 1.1 : getPrice();
	}
}