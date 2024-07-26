package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int n1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int n2 = sc.nextInt();
            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char op = sc.next().charAt(0);

            int result = 0;
            float resultf = 0;

            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            switch (op) {
                case '+' :
                    result = n1 + n2;
                    System.out.println("결과: " + result);
                    break;
                case '-' :
                    result = n1 - n2;
                    System.out.println("결과: " + result);
                    break;
                case '*' :
                    result = n1 * n2;
                    System.out.println("결과: " + result);
                    break;
                case '/' :
                    if (n2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        resultf = (float) n1 / n2;
                        System.out.println("결과: " + resultf);
                    }
                    break;
                default :
                    System.out.println("알 수 없는 사칙연산 기호를 입력하셨습니다.");
            }
        } catch (Exception e) {
            System.out.println("알 수 없는 값을 입력하셨습니다.");
        }
    }
}
