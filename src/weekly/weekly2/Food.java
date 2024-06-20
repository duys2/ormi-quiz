package weekly.weekly2;

public class Food extends Product {
	private int expirationDate; // 유통기한

	public Food(String name, double price, int stock, int expirationDate) {
		super(name, price, stock);
		this.expirationDate = expirationDate;
	}

	@Override
	public double calculatePrice() {
		return (expirationDate <= 7) ? getPrice() * 0.8 : getPrice();
	}
}