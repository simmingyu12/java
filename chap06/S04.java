class Fish{
    String name;
    static int countCat = 0;

    public Fish(){
        this.name = "고기고기물고기";
        Fish.addFish();
    }

    public static void addFish(){
        Fish.countCat++;
        System.out.println("새로운 물고기의 탄생");
    }

}





public class S04 {
    
    public static void main(String[] args) {
        
        new Fish();
        new Fish();
        new Fish();
        new Fish();
        new Fish();

        System.out.println("고양이의 수는 : " + Fish.countCat);

    }
}
