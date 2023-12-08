// class Person {

//     // 인스턴스의 사적인 속성은 private로 숨긴다.

//     private String name;
//     private boolean male;

//     public Person(String name, boolean male) {
//         this.name = name;
//         this.male = male;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setMale(boolean male) {
//         this.male = male;
//     }

//     // 인스턴스의 사적인 속성을 외부에서 요청할 때
//     // 가공해서 전달할 수 있다.
//     public String hideName() {
//         return this.name.substring(0, 1);
//     }

//     // boolean은 get 대신에 is를 사용할 수 있다.
//     public boolean isMale() {
//         return this.male;
//     }

//     // @Override와 같은 것들을 어노테이션이라고 함
//     // 주석 -> 사람이 보라고 만든 내용
//     // 어노테이션 -> 컴파일러, JVM 등이 읽을 수 있는 설명
//     // Override와 같이 적어도 되고 안적어도 되는 경우가 있다
//     // 상황에 따라 필수적으로 적어야 한느 어노테테이션도 있다.
//     // 프로그램은 어노테이션을 참고해서 특수한 기능을 수행할 수 있다.
//     // 예를 들어 @Override 부모의 메소드를 사용하지 않고 새로운 로직을 사용하겠다는 뜻

//     @Override
//     public String toString() {
//         return "저는 " + this.name + "이고 " + (this.male ? "남자" : "여자") + "입니다.";
//     }

// }

// public class Study06 {

//     public static void main(String[] args) {

//         Person person = new Person("홍길동", true);

//         Person person2 = new Person("김자옥", false);

//         // 겉으로 봐서는 사람의 이름을 알 수가 없다.
//         // System.out.println(person.name);

//         // 너 이름이 뭐야?
//         System.out.println(person.getName());

//         // 너 이름이 뭐야?
//         System.out.println(person.hideName());

//         // 너 남자니?
//         System.out.println(person.isMale());

//         System.out.println(person); // 인스턴스를 print하면 toString메소드가 실행된다. 즉 person은 person.toString과 같다.

//         System.out.println(person2);

//         Person nick = person2;
//         System.out.println(nick);

//         //김자옥 남자로 변경
//         person2.setMale(false);
//         //김자옥 이름 변경
//         person2.setName("이영빈");

//         System.out.println(person2);
//     }
// }
