class Human{
    String name;
    int hp;
    int position;

    public Human(String name, int hp, int position){
        this.name = name;
        this.hp = hp;
        this.position = position;
    }

    public Human(String name){
        this(name, 100, 0);
        
        System.out.println(this.name + "의 체력은" + hp + "입니다.");
    }

    public void moveRight(){
        this.position++;
        System.out.println(this.name + "이 오른쪽으로 이동하여 hp가 1 감소했습니다.");
        myhp();
    }
        public void moveLeft(){
            if(this.position < 1){
                System.out.println(this.name + "는 이제 이동할 수 없습니다.");
                return; // 함수에서 return을 만나면 아래 코드는 실행되지 않는다.
            }
        this.position--;
        System.out.println(this.name + "이 오른쪽으로 이동하여 hp가 1 감소했습니다.");
        this.hp--;
        myhp();
    }

    public void myhp(){
        this.hp--;
        System.out.println("현재 나의 잔여 체력은 " + hp + "입니다.");
    }

    public void elikcer(int food){
        this.hp = this.hp + food;
        if(this.hp + food > 100){
            this.hp = 100;
            System.out.println("체력이 가득 찼습니다.");
            return;
        }
        System.out.println("엘릭서를 먹어 나의 체력이" + hp + "로 되었습니다.");
    }

    public String dong(){
        return "영빈시치의 신짜오 똥";
    }
}



public class S03 {
    public static void main(String[] args) {
        
        Human human = new Human("이영빈");

        human.moveLeft();
        human.moveRight();
        human.moveRight();
        human.moveLeft();
        human.elikcer(40);
        System.out.println(human.hp);

        System.out.println(human.dong());
    }   
}
