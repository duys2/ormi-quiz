package weekly.weekly3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
	private Stack<Book<T>> books; // Book 객체들을 저장하는 Stack

	public BookStack() { // 초기화
		this.books = new Stack<>();
	}

	public void pushBook(Book<T> book) { // 스택에 도서 추가
		if (book != null) { // book이 존재하면
			books.push(book); // Stack에 추가
		}
	}

	public Book<T> popBook() { // 도서 제거 후 반환
		if (books.isEmpty()) { // Stack이 비어있으면
			throw new EmptyStackException(); // EmptyStackException throw
		}

		return books.pop(); // 도서 반환
	}

	public Book<T> peekBook() {
		if (books.isEmpty()) { // Stack이 비어있으면
			throw new EmptyStackException(); // EmptyStackException throw
		}

		return books.peek(); // 도서 반환
	}

	public boolean isEmpty() { // Stack이 비어있는지 판단
		return books.isEmpty(); // Stack이 비어있는지 판단 후 결과값 반환
	}
}