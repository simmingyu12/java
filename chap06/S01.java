
class Cat {
    // 필드(객체의 속성)
    String name;
    int age;

    // 생성자 (객체를 생성할 떄 사용)
    // 생성자 이름은 클래스명과 동일하게 만든다.
    // 생성자가 있어야 클래스를 인스턴스화 할 수 있다.
    // 생성자는 리턴 타입이 없다.(void)
    // 클래스에 아무 생성자가 없을 경우
    // 매개변수가 없는 생성자가 기본적으로 세팅 되어 있다.
    // public Cat() {
    // System.out.println("난 살고 있다.");
    // }

    // 다른 생성자를 직접 만들 경우
    // 기본적으로 세팅 되어 있는 생성자는 없어진다.
    // this는 클래스가 아니라 생성될 인스턴스를 가리킨다.
    // 먹고잇는 붕어빵이 있는데 봉지 안 다른 붕어빵은 사라지지 않는다.
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println(this.name + "가 태어났다.");
    }

    // 받지 않은 데이터는 개발자가 직접 초기화 해줘야 한다
    // public Cat(int age){
    // this.name = "길냥이";
    // this.age = age;

    public Cat(int age) {
        //this를 이용해서 생성자에서 다른 생성자를 불러낼 수 있다.
        // 보통은 매게변수가 제일 많은 생성자를 가져온다.
        this("길냥이", age);
    }

        public Cat(){
        this.name = "길냥이";
        this.age = 1;

        System.out.println("이름이" + this.name + "인 고양이의 나이는" + this.age + "입니다");
    }

    // System.out.println(this.name + "가 태어났다.");
    // }

    // 메소드(객체의 기능)
    // 생성된 인스턴스에서 사용할 수 있는 기능
    public void cry() {
        System.out.println("야옹");
    }
}

public class S01 {

    public static void main(String[] args) {

        // Cat cat : 오브젝트는 상상 할 수 있지만 실체화 되지 않은 것

        // cat = new Cat(); : new를 통해서 오브젝트에 인스턴스를 넣어 준다.

        Cat cat = new Cat("캣맘", 2); // 인스턴스

        Cat cat2 = new Cat(1);

        Cat cat3 = new Cat();

        cat.cry();
        cat2.cry();
        cat3.cry();

    }
}
