package weekly.weekly3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(); // BookShelf 객체 생성
		BookStack<Integer> bookStack = new BookStack<>(); // BookStack 객체 생성

		Scanner scanner = new Scanner(System.in);

		try { // 정상 실행 될 실행문
			/* BookShelf에 넣을 도서 정보 */
			String bookShelfTitle;
			String bookShelfAuthor;
			String bookShelfIdentifier;

			/* BookStack에 넣을 도서 정보들 */
			String bookStackTitle1;
			String bookStackAuthor1;
			int bookStackIdentifier1;
			String bookStackTitle2;
			String bookStackAuthor2;
			int bookStackIdentifier2;

			// /**/은 그룹으로 묶어서 설명하는 주석
			/* 입력 받기 */
			System.out.print("(BookShelf)제목을 입력하세요: ");
			bookShelfTitle = scanner.nextLine();
			System.out.print("(BookShelf)저자를 입력하세요: ");
			bookShelfAuthor = scanner.nextLine();
			System.out.print("(BookShelf)식별자를 입력하세요: ");
			bookShelfIdentifier = scanner.nextLine();
			System.out.print("(첫 번째 BookStack)제목을 입력하세요: ");
			bookStackTitle1 = scanner.nextLine();
			System.out.print("(첫 번째 BookStack)저자를 입력하세요: ");
			bookStackAuthor1 = scanner.nextLine();
			System.out.print("(첫 번째 BookStack)식별자를 입력하세요: ");
			bookStackIdentifier1 = scanner.nextInt();
			scanner.nextLine();
			System.out.print("(두 번째 BookStack)제목을 입력하세요: ");
			bookStackTitle2 = scanner.nextLine();
			System.out.print("(두 번째 BookStack)저자를 입력하세요: ");
			bookStackAuthor2 = scanner.nextLine();
			System.out.print("(두 번째 BookStack)식별자를 입력하세요: ");
			bookStackIdentifier2 = scanner.nextInt();
			scanner.nextLine();

			/* Book 객체 생성 */
			Book<String> toBookShelfObject = new Book<>(bookShelfTitle, bookShelfAuthor, bookShelfIdentifier);
			Book<Integer> toBookStackObject1 = new Book<>(bookStackTitle1, bookStackAuthor1, bookStackIdentifier1);
			Book<Integer> toBookStackObject2 = new Book<>(bookStackTitle2, bookStackAuthor2, bookStackIdentifier2);

			/* 객체 추가 */
			bookShelf.addBook(toBookShelfObject);
			bookStack.pushBook(toBookStackObject1);
			bookStack.pushBook(toBookStackObject2);

			// 도서 제목으로 검색 후 결과 출력
			for (Book book : bookShelf.searchByTitle(bookShelfTitle)) {
				System.out.println(book.getTitle());
				System.out.println(book.getAuthor());
				System.out.println(book.getIdentifier());
			}
			// List<Book> searchByTitle = bookShelf.searchByTitle(title); // 안 쓰는 코드 밑에 주석 처리

			// 도서 저자로 검색 후 결과 출력
			for (Book book : bookShelf.searchByAuthor(bookStackAuthor1)) {
				System.out.println(book.getTitle());
				System.out.println(book.getAuthor());
				System.out.println(book.getIdentifier());
			}

			// 도서 저자로 검색 후 결과 출력
			for (Book book : bookShelf.searchByAuthor(bookStackAuthor2)) {
				System.out.println(book.getTitle());
				System.out.println(book.getAuthor());
				System.out.println(book.getIdentifier());
			}

			/* 도서를 꺼내고 꺼낸 도서의 정보 출력하기 */
			Book<Integer> fromStackPopBook = bookStack.popBook();
			System.out.println(fromStackPopBook.getTitle());
			System.out.println(fromStackPopBook.getAuthor());
			System.out.println(fromStackPopBook.getIdentifier());

			/* 맨 위의 도서를 확인하고 해당 도서의 정보 출력하기 */
			System.out.println(bookStack.peekBook().getTitle());
			System.out.println(bookStack.peekBook().getAuthor());
			System.out.println(bookStack.peekBook().getIdentifier());

			// BookStack이 비어있는지 확인 후 결과 출력
			System.out.println(bookStack.isEmpty());
		} catch (InputMismatchException e) { // 예외 처리
			System.out.println("정확한 값을 입력해 주세요.");
		} finally { // 무조건 실행
			// 자원 반납
			scanner.close();
		}
	}
}