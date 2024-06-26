package weekly.weekly3;

public class Book<T> {
	/* ---------------- 필드 선언부 ---------------- */
	private String title; // 책의 제목
	private String author; // 책의 저자
	private T identifier; // 책의 고유 식별자

	/* ---------------- 생성자 선언부 ---------------- */
	public Book(String title, String author, T identifier) { // 필드값 초기화
		this.title = title;
		this.author = author;
		this.identifier = identifier;
	}

	/* ---------------- 접근자(getter) 선언부 ---------------- */
	public String getTitle() {
		return title; // 책 제목 반환
	}

	public String getAuthor() {
		return author; // 책 저자 반환
	}

	public T getIdentifier() {
		return identifier; // 책 고유 식별자 반환
	}
}