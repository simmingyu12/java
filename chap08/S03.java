package chap08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {

        // 스캐너는 마지막에 꼭 close()를 해줘야함;

        Scanner scanner = new Scanner(System.in);
        
        int num;

        try {
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            num = 0;
            System.out.println("잘못된 값을 넣었다.");
        } finally {
            scanner.close();
        }

        //finally는 try안의 변수와 관련된 객체가 무조건 처리되어야 할 경우 사용한다.

        System.out.println(num);
    }
}
