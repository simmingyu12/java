package chap08;

public class S02 {

    public static void main(String[] args) {

        int[] intArray = { 10, 20 };

        try {
            System.out.println(10 / 0);
            System.out.println(intArray[2]);
        }catch(Exception e){
            System.out.println("예외가 발생했습니다.");
        }

        System.out.println("나 출력됨?");
    }
}
