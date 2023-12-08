package hello;

import java.util.Random;
import java.util.Scanner;

// 메뉴 작성
// 메뉴를 출력
// 사용자에게 입력받고
// 메뉴 선택
// 아무거나 선택 가능
// 선택된 메뉴 출력

class Menu {

    String food;

    public String choice(String food) {
        System.out.println("오늘의 점심메뉴는 : " + food + "입니다.");
        return food;
    }

}

public class App {
    public static void main(String[] args) {

        System.out.println("오늘 뭐먹지");

        Menu menu = new Menu();

        menu.choice("돈까스");

        //메뉴 작성
        String[] items = {"피자","치킨","메이플하러가자","잠이나 자자"};

        // 메뉴 출력
        // System.out.println("오늘의 점심메뉴");
        // System.out.print("1. " + items[0]);
        // System.out.println("1. " + items[1]);
        // System.out.print("1. " + items[2]);
        // System.out.println("1. " + items[3]);

        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + "." + items[i]);
        }

        // 사용자 입력

        System.out.print("먹고 싶은 메뉴를 입력하세요 " );
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 1){
            System.out.println("1. 피자");
        }else if (number == 2){
            System.out.println("2. 치킨");
        }else if (number == 3){
            System.out.println("3. 메이플 하러가자");
        }else if (number == 4){
            System.out.println("4. 잠이나 자자");
        }else{
            System.out.println("다른 번호를 입력했으니 끝이다.");
        }

        //아무거나 선택
        Random random = new Random();
        int randomNum = random.nextInt(items.length);
        System.out.println("오늘은 이번의 밥을 먹도록 : " + randomNum);

        sc.close();
        

    }
}
