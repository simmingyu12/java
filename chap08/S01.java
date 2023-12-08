//예외 처리

package chap08;

public class S01 {
    public static void main(String[] args) {
        
        System.out.println("이전 코드");

        //try는 예외가 일어날 것 같은 코드를 담는 공간
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("계산 중 예외가 발생했습니다.");
        }
        //catch는 예외가 발생시 프로그램을 멈추지 않고 예외를 처리한뒤  다음으로 넘김

        System.out.println("다음 코드");
    }
}
