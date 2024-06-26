package weekly.weekly3;

import java.util.List;

public interface BookManager<T> {
	void addBook(Book<T> book); // 추상 메서드 선언: 도서 추가

	void removeBook(Book<T> book); // 추상 메서드 선언: 도서 삭제

	List<Book<T>> searchByTitle(String title); // 추상 메서드 선언: 도서 제목으로 검색

	List<Book<T>> searchByAuthor(String author); // 추상 메서드 선언: 도서 저자로 검색
}