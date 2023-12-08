package chap08;

//직접 예외를 만들 수 있다.
//Exception 또는 RuntimeException을 상속하는 것이 일반적이다.
class NotOneException extends Exception{

    public NotOneException(String message){
        super(message);
    }
}

class CalcUtil{

    //들어온 정수가 1이면 정상 / 아니면 에러
    //throw는 이 함수를 호출한 곳에 에러를 던지겠다 라는 뜻
    static void checkOne(int num) throws NotOneException{

        if(num ==1){
            System.out.println("정상");
        }else{
            throw new NotOneException("에러다");
        }
    }
}




public class S05 {
    public static void main(String[] args) {

        try {
            CalcUtil.checkOne(0);
        } catch (NotOneException e) {
            System.out.println(e.getMessage());
        }
    }
}
