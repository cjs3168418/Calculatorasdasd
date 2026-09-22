package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (1 == 1) {
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
            char operator = scanner.next().charAt(0);
            scanner.nextLine();

            switch (operator) {
                case '+':
                    int result1 = a + b;
                    System.out.println("계산 결과: " + result1);
                    break;

                case '-':
                    int result2 = a - b;
                    System.out.println("계산 결과: " + result2);
                    break;

                case '*':
                    int result3 = a * b;
                    System.out.println("계산 결과: " + result3);
                    break;

                case '/':
                    if(b != 0) {
                        int result4 = a / b;
                        System.out.println("계산 결과: " + result4);
                        break;
                    } else {System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        System.out.println();
                        continue;
                    } default: {
                    System.out.println("사칙연산 기호(+,-,*,/)중에 입력하세요!");
                    System.out.println();
                    continue;
                }
            }

            System.out.print("계산기를 종료하실려면 'exit'를 입력하세요: ");
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                break;
            }

            System.out.println();
        }

        System.out.println("계산기 종료");
    }
}