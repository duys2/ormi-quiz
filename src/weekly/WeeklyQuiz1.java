package weekly;

import java.util.InputMismatchException; // catch에서 Exception말고 InputMismatchException쓰려면 필요
import java.util.Scanner;

public class WeeklyQuiz1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("원하는 기능을 선택하세요.");
				int function = scanner.nextInt();
				int num1, num2;

				if (function == 0) {
					break;
				}

				switch (function) {
					case 1:
						System.out.println("첫 번째 값을 입력하고 엔터를 누르세요.");
						num1 = scanner.nextInt();
						System.out.println("두 번째 값을 입력하고 엔터를 누르세요.");
						num2 = scanner.nextInt();
						System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
						break;
					case 2:
						System.out.println("첫 번째 값을 입력하고 엔터를 누르세요.");
						num1 = scanner.nextInt();
						System.out.println("두 번째 값을 입력하고 엔터를 누르세요.");
						num2 = scanner.nextInt();
						System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
						break;
					case 3:
						System.out.println("첫 번째 값을 입력하고 엔터를 누르세요.");
						num1 = scanner.nextInt();
						System.out.println("두 번째 값을 입력하고 엔터를 누르세요.");
						num2 = scanner.nextInt();
						System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
						break;
					case 4:
						System.out.println("첫 번째 값을 입력하고 엔터를 누르세요.");
						num1 = scanner.nextInt();
						System.out.println("두 번째 값을 입력하고 엔터를 누르세요.");
						num2 = scanner.nextInt();
						System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
						break;
					default:
						System.out.println("다시 입력해 주세요.");
						break;
				}
			} catch (Exception e) { // 예외 처리
				System.out.println("유효한 값을 입력해 주세요.");
				scanner.next(); // 입력 버퍼 비우기
			}
		}
	}
}