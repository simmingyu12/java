// // 내부 클래스

// package chap07;

// // 내부 클래스 중 인스턴스 클래스는 메모리 누수 등 문제가 발생할 수있어서 특별한 경우가 아니면 사용하지 않는다.

// // 공장 설계도
// class 삼성공장 {
//     // 스마트폰 설계도
//     class Galaxy {

//     }

// }

// public class S09 {

//     public static void main(String[] args) {

//         // 공장 설계도에게 폰을 만들어 달라고 하는 느낌
//         // new 삼성공장.갤럭시();

//         // 공장 상상
//         삼성공장 factory;

//         // 공장을 짓는다
//         factory = new 삼성공장();

//         //공장에서 새 갤럭시 폰을 만듬
//         삼성공장.Galaxy phone = factory.new Galaxy();

//         삼성공장 factory1 = new 삼성공장();
        
//         factory1.new Galaxy();
//     }

// }
