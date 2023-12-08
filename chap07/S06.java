// package chap07;

// import chap07.sub.Sub01;


// public class S06 {

//     public static int first = 1;
//     public String second = "준우승";

//     public void printSecond(){
//         System.out.println(second);
//     }

//     public static void main(String[] args) {
//         Sub01 sub01 = new Sub01();
//         System.out.println(sub01.getData());
//         System.out.println(first); //first = S06.first
//         // System.out.println(second); // static이 아니면 가져올 숭 없다
//         // System.out.println(printSecond); 실행할 수 없다

//         //static이 아닌 필드는 인스턴스를 생성해서 가져와야 한다.

//         S06 s06 = new S06();
//         System.out.println(s06.second);
//         s06.printSecond();

//         S06.first = 11;

//         final String str = "홍길동";
//         // str = "임꺽정";
//     }
// }
