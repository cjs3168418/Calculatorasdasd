package step2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("0 이상의 첫 번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();

            if (a < 0) {
                System.out.println("0 이상의 숫자를 입력해주세요!");
                System.out.println();
                continue;
            }

            System.out.print("0 이상의 두 번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();

            if (b < 0) {
                System.out.println("0 이상의 숫자를 입력해주세요!");
                System.out.println();
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
            char sign = scanner.next().charAt(0);
            scanner.nextLine();
            if (sign == '+') {}
            else if (sign == '-') {}
            else if (sign == '*') {}
            else if (sign == '/') {}
            else {
                System.out.println("사칙연산 기호(+,-,*,/)중에 입력하세요!");
                System.out.println();
                continue;
            }

            int z = calculator.calculate(a, b, sign);

            System.out.println("Getter 메서드 활용: " + calculator.getList());

            System.out.print("'삭제' 입력시 배열의 1번째 요소 삭제: ");
            String remove = scanner.nextLine();

            if (remove.equals("삭제")) {
                calculator.remove();
                System.out.println("Getter 메서드 활용: " + calculator.getList());
            }


            System.out.print("계산기를 종료하실려면 'exit'를 입력하세요: ");
            String command = scanner.nextLine();
            System.out.println();

            if (command.equals("exit")) {
                break;
            }
        }

        System.out.println("계산기 종료");











    }
}