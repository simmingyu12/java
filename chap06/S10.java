class Star{
    String name;

    public Star(String name){
        this.name = name;
    }
}

public class S10 {
    
    public static void main(String[] args) {
        //참조형 변수를 아래처럼 사용 시 복사의 개념이 아니라
        //같은 객체에 별명을 하나 더 붙여 준 것돠 비슷하다.
        Star star1 = new Star("북두칠성");
        Star star2 = star1;

        //star2의 내용을 바꾸면
        star2.name =  "혜성";

        // star1의 내용도 바뀐다.(star1과 star2는 같은 객체이기 때문이다.)
        System.out.println(star1.name);
    }
}
