package weekly.weekly2;

public class Electronics extends Product {
	private String brand;

	public Electronics(String name, double price, int stock, String brand) {
		super(name, price, stock);
		this.brand = brand;
	}

	@Override
	public double calculatePrice() {
		return (brand.equals("Apple")) ? getPrice() * 1.2 : getPrice();
	}
}