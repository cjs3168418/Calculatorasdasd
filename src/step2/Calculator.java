package step2;

import java.util.ArrayList;

public class Calculator {

    //속성
    private ArrayList<Integer> list = new ArrayList<>();

    //생성자

    //기능
    int calculate (int num1,int num2,char sign) {
        int result = 0;
        switch (sign) {
            case '+':
                result = num1 + num2;
                System.out.println("계산 결과: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("계산 결과: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("계산 결과: " + result);
                break;

            case '/':
                if (num2 == 0) {
                    try {
                        throw new RuntimeException();
                        } catch (RuntimeException e) {
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                            System.out.println();
                        }
                } else {
                    result = num1 / num2;
                    System.out.println("계산 결과: " + result);
                    break;
                }
        } list.add(result);
        return result;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    void remove() {
        list.remove(0);
    }



}
