// 메서드 오버로딩

class Calc {

    public static int add(int a, int b) {
        return a + b;
    }

    // 오버로딩(같은 이름의 다른 메서드를 생성)
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 리턴 타입이 달라지더라도 오버로딩이 가능하다
    public static long add(long a, long b) {
        return a + b;
    }

    public static void print(String str, int num){
        System.out.println(str + num);
    }

    // 사용되는 매개변수 타입이 같더라도 위치가 달라지면 오버로딩 된다.
    public static void print(int num, String str){
        System.out.println(str + num);
    }
}

public class S08 {

    public static void main(String[] args) {

    }

}
