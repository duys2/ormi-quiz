package weekly.weekly3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements BookManager {
	private List<Book> books; // Book 객체 저장하는 ArrayList

	public BookShelf() {
		this.books = new ArrayList<>(); // 초기화
	}

	@Override
	public void addBook(Book book) { // 도서를 리스트에 추가
		if (book != null) {
			books.add(book);
		}
	}

	@Override
	public void removeBook(Book book) { // 도서를 리스트에서 삭제
		books.remove(book);
	}

	@Override
	public List<Book> searchByTitle(String title) { // 도서 제목으로 검색하기
		List<Book> result = new ArrayList<>();

		for (Book book : books) {
			// 대소문자 구분 없이 찾으려는 제목이 매개변수로 넣은 검색어를 포함하는지 판단
			if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				result.add(book);
			}
		}

		return result; // 결과 반환
	}

	@Override
	public List<Book> searchByAuthor(String author) { // 도서 저자로 검색하기
		List<Book> result = new ArrayList<>();

		for (Book book : books) {
			// 대소문자 구분 없이 찾으려는 저자명이 매개변수로 넣은 검색어를 포함하는지 판단
			if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
				result.add(book);
			}
		}

		return result; // 결과 반환
	}
}