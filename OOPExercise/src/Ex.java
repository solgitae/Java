import java.security.Signature;

public class Ex {
    public static void main(String[] args) {
        Singleton.s = new Singleton(1);
        System.out.println(Singleton.s.getA());
    }
}
