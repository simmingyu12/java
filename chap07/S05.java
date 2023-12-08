package chap07;

public class S05 {
    public static void main(String[] args) {
        
        Object object = new Object();

        object.getClass();
        object.hashCode();
        object.toString();
        object.equals(null);

        String str = "홍길동";

        str.getClass();
        str.hashCode();
        str.toString();
        str.equals("김첨지");
    }    
}
