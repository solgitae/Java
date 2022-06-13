
//오버로딩

public class Ex02 {

    void method1(int a) {
        System.out.println(a);
    }

    void method1(long b) {
        System.out.println(b);
    }

    void method1(float b) {
        System.out.println(b);
    }

    void method1(double b) {
        System.out.println(b);
    }

/*
    void method1(int a, int b) {
        System.out.println(a + b);
    }

    void method1(int x, int y) {
        System.out.println(x + y);
    }
*/

    void method1(int a, long b) {
        System.out.println(a + b);
    }

    void method1(long a, int b) {
        System.out.println(a + b);
    }
}
