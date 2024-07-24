package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        int[] results = new int[10];
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        int index = 0;

        Scanner sc = new Scanner(System.in);
        String exit = "";

        while (!exit.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int n1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int n2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char op = sc.next().charAt(0);

            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            if (op == '+') {
                result = n1 + n2;
            } else if (op == '-') {
                result = n1 - n2;
            } else if (op == '*') {
                result = n1 * n2;
            } else if (op == '/' && n2 != 0) {
                result = n1 / n2;
            }

            if (op == '/' && n2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                System.out.println("결과: " + result);

                if (index == 10) {
                    for (int i = 1; i < 10; i++) {
                        results[i - 1] = results[i];
                    }

                    results[9] = result;
                } else {
                    /* 연산의 결과를 배열에 저장합니다. */
                    results[index] = result;
                    /* index를 증가 시킵니다. */
                    index++;
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            exit = sc.next();
        }

    }
}
