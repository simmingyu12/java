class Dog{
    String name;
    int position;
    public Dog(String name, int position){
        this.name = name;
        this.position = position;
        System.out.println(this.name + "이 너를 혼낼라고 쫓아다녀");
    }

    public Dog(String name){
        this(name, 0);
    }

    public void moveRight(){
        this.position++;
        System.out.println(this.name + "을 피해 우측방향으로 도망치십시오");
    }

    public void moveLeft(){
        this.position--;
        System.out.println(this.name + "을 피해 좌측방향으로 도망치십시오");
    }
}


public class S02 {
    public static void main(String[] args) {
        
        Dog dog = new Dog("캣맘");

        dog.moveRight();
        dog.moveRight();

        System.out.println("나의 현재 위치는 : " + dog.position);
    }
}
