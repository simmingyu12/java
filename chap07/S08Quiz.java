//인터페이스 / 추상/ 클래스 이용 스마트폰 갤럭시 , 아이폰 만들기
//갤럭시s23 : 통화 문자 빅스비
//아이폰14 : 통화 문자 시리

package chap07;

interface 통화 {
    void 전화();
}

interface 문자 {
    void 문자보내기();
}

interface 빅스비 {
    void 빅스비연결();
}

interface 시리 {
    void 시리연결();
}

abstract class 스마트폰 implements 통화, 문자 {

    public void 전화() {

    }

    public void 문자보내기(){

    }
}


class 갤럭시S23 extends 스마트폰 implements 빅스비 {

    public void 빅스비연결() {
        System.out.println("안녕 빅스비");
    }

    public void 전화(String name) {
        System.out.println(name + "에게 전화중");
    }

    public void 문자보내기() {
      System.out.println("문자보내기 완료");
    }

}

class 아이폰14 extends 스마트폰 implements 시리{

    public void 시리연결() {
        System.out.println("반갑다 시리야");
    }

    public void 전화(String name) {
        System.out.println(name + "에게 전화중");
    }

    public void 문자보내기() {
      System.out.println("문자보내기 완료");
    }

    
}
public class S08Quiz {
    public static void main(String[] args) {

        갤럭시S23 갤럭시S23 = new 갤럭시S23();
        아이폰14 아이폰14 = new 아이폰14();
        
        갤럭시S23.빅스비연결();
        갤럭시S23.전화("이영빈");
        갤럭시S23.문자보내기();

        아이폰14.시리연결();
        아이폰14.전화("교수님");
        아이폰14.문자보내기();

    }
}
