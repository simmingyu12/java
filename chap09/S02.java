package chap09;

public class S02 {
    public static void main(String[] args) {

        //0이상 1미만의 랜덤한 double
        System.out.println("Math.random() : " + Math.random());

        //abs 숫자의 절댓값을 리턴한다.
        System.out.println("Math.abs(-10) : " + Math.abs(-10));

        //round 5를 기준으로 반올림값을 리턴한다.
        System.out.println("Math.round(1.5) : " + Math.round(1.5));
        System.out.println("Math.round(1.4) : " + Math.round(1.4));

        //floor 내림값을 double로 리턴한다
        System.out.println("Math.floor(1.5) : " + Math.floor(1.5));
        System.out.println("Math.floor(1.25) : " + Math.floor(1.25));

        //ceil 올림값을 double로 리턴한다
        System.out.println("Math.ceil(1.5) : " + Math.ceil(1.5));
        System.out.println("Math.ceil(1.5) : " + Math.ceil(1.25));
        System.out.println("Math.ceil(1.5) : " + Math.ceil(1.557));

        //pow 제곱값을 더블로 리턴한다.
        System.out.println("Math.pow(2,3) : " + Math.pow(2,3));

        //sqrt 루트값을 double로 리턴한다.
        System.out.println("Math.sqrt(4) : " + Math.sqrt(4));

        
        System.out.println("Math.PI : " + Math.PI);
    }
}
