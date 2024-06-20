package weekly.weekly2;

public class Product {
	/* ---------- 필드 ---------- */
	private String name;
	private double price;
	private int stock;

	/* ---------- 생성자 ---------- */
	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	/* ---------- 접근자와 설정자 ---------- */
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* ---------- 메서드 ---------- */
	public double calculatePrice() {
		return price;
	}
}