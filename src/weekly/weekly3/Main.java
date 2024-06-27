package weekly.weekly3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(); // BookShelf 객체 생성
		BookStack<Integer> bookStack = new BookStack<>(); // BookStack 객체 생성

		// 사용자 입력을 받기 위한 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);

		try { // try-catch 블록으로 예외 처리
			// BookShelf에 넣을 도서 정보들
			// 첫 번째 도서
			String bookShelfTitle1;
			String bookShelfAuthor1;
			String bookShelfIdentifier1;
			// 두 번째 도서
			String bookShelfTitle2;
			String bookShelfAuthor2;
			String bookShelfIdentifier2;

			// BookStack에 넣을 도서 정보들
			// 첫 번째 도서
			String bookStackTitle1;
			String bookStackAuthor1;
			int bookStackIdentifier1;
			// 두 번째 도서
			String bookStackTitle2;
			String bookStackAuthor2;
			int bookStackIdentifier2;

			// 입력 받기
			System.out.print("(첫 번째 BookShelf)제목을 입력하세요: ");
			bookShelfTitle1 = scanner.nextLine();
			System.out.print("(첫 번째 BookShelf)저자를 입력하세요: ");
			bookShelfAuthor1 = scanner.nextLine();
			System.out.print("(첫 번째 BookShelf)식별자를 입력하세요: ");
			bookShelfIdentifier1 = scanner.nextLine();

			System.out.print("(두 번째 BookShelf)제목을 입력하세요: ");
			bookShelfTitle2 = scanner.nextLine();
			System.out.print("(두 번째 BookShelf)저자를 입력하세요: ");
			bookShelfAuthor2 = scanner.nextLine();
			System.out.print("(두 번째 BookShelf)식별자를 입력하세요: ");
			bookShelfIdentifier2 = scanner.nextLine();

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

			// Book 객체 생성
			Book<String> toBookShelfObject1 = new Book<>(bookShelfTitle1, bookShelfAuthor1, bookShelfIdentifier1);
			Book<String> toBookShelfObject2 = new Book<>(bookShelfTitle2, bookShelfAuthor2, bookShelfIdentifier2);
			Book<Integer> toBookStackObject1 = new Book<>(bookStackTitle1, bookStackAuthor1, bookStackIdentifier1);
			Book<Integer> toBookStackObject2 = new Book<>(bookStackTitle2, bookStackAuthor2, bookStackIdentifier2);

			// 객체 추가
			bookShelf.addBook(toBookShelfObject1);
			bookShelf.addBook(toBookShelfObject2);
			bookStack.pushBook(toBookStackObject1);
			bookStack.pushBook(toBookStackObject2);

			// 검색할 도서 제목 입력 받기
			System.out.print("\n(BookShelf)검색할 도서 제목을 입력하세요: ");
			String searchTitle = scanner.nextLine();

			// BookShelf: 도서 제목으로 검색 후 결과 출력
			System.out.println("\n===== BookShelf 도서 제목 검색 시작 =====");
			List<Book> searchByTitle = bookShelf.searchByTitle(searchTitle);
			// 검색된 도서가 있으면 출력하고 없으면 검색된 도서가 없음을 알림
			if (searchByTitle.isEmpty()) {
				System.out.println("검색된 도서가 없습니다.");
			} else {
				for (Book book : searchByTitle) {
					System.out.println(book.getTitle());
					System.out.println(book.getAuthor());
					System.out.println(book.getIdentifier());
				}
			}
			System.out.println("===== BookShelf 도서 제목 검색 종료 =====");

			// 검색할 도서 저자 입력 받기
			System.out.print("\n(BookShelf)검색할 도서 저자를 입력하세요: ");
			String searchAuthor = scanner.nextLine();

			// BookShelf: 도서 저자로 검색 후 결과 출력
			System.out.println("\n===== BookShelf 도서 저자 검색 시작 =====");
			List<Book> searchByAuthor = bookShelf.searchByAuthor(searchAuthor);
			// 검색된 도서가 있으면 출력하고 없으면 검색된 도서가 없음을 알림
			if (searchByAuthor.isEmpty()) {
				System.out.println("검색된 도서가 없습니다.");
			} else {
				for (Book book : searchByAuthor) {
					System.out.println(book.getTitle());
					System.out.println(book.getAuthor());
					System.out.println(book.getIdentifier());
				}
			}
			System.out.println("===== BookShelf 도서 저자 검색 종료 =====");

			// BookStack: 도서를 꺼내고(popBook) 꺼낸 도서의 정보 출력하기
			System.out.println("\n===== BookStack popBook()으로 받은 도서 정보 출력 시작 =====");
			// 스택은 후입선출이므로 두 번째(마지막)로 입력한 도서의 정보가 출력된다.
			Book<Integer> fromStackPopBook = bookStack.popBook();
			System.out.println(fromStackPopBook.getTitle());
			System.out.println(fromStackPopBook.getAuthor());
			System.out.println(fromStackPopBook.getIdentifier());
			System.out.println("===== BookStack popBook()으로 받은 도서 정보 출력 종료 =====");

			// BookStack: 맨 위의 도서를 확인하고(peekBook) 해당 도서의 정보 출력하기
			System.out.println("\n===== BookStack peekBook()으로 받은 도서 정보 출력 시작 =====");
			// 스택은 후입선출이므로 pop을 했으니 첫 번째로 입력한 도서만 남는다.
			System.out.println(bookStack.peekBook().getTitle());
			System.out.println(bookStack.peekBook().getAuthor());
			System.out.println(bookStack.peekBook().getIdentifier());
			System.out.println("===== BookStack peekBook()으로 받은 도서 정보 출력 종료 =====\n");

			// BookStack이 비어있는지 확인(isEmpty) 후 결과 출력(isEmpty가 false면 비어있지 않다는 뜻)
			System.out.println("BookStack은 " + (bookStack.isEmpty() ? "비어있습니다." : "비어있지 않습니다."));
		}
		// InputMismatchException: 입력 값의 데이터 타입이 잘못되었을 때 발생하는 예외
		catch (InputMismatchException e) { // 예외 처리
			System.out.println("정확한 값을 입력해 주세요.");
		}
		// 예외 발생 여부와 관계없이 항상 실행
		finally {
			scanner.close(); // Scanner 객체 닫기
		}
	}
}