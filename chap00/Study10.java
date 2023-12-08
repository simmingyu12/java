// import java.util.Optional;

// public class Study10 {

//     public static void main(String[] args) {

//         String str = "안녕하세요";

//         if(str == null){
//             System.out.println("데이터가 null입니다.");
//         }else{
//             System.out.println(str.length());
//         }

//         // null 값이 들어올 수있는 변수를 컨트롤 할 때 사용한다.
//         // null 처리를 강제할 수 있다
//         Optional<String> optionalStr = Optional.of(null);

//         if(optionalStr.isEmpty()){
//             System.out.println("데이터가 null입니다.");
//         }else{
//             System.out.println(optionalStr.get().length());
//         }

//         System.out.println(optionalStr.orElse("값이없습니다."));
//     }
// }
