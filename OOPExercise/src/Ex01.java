
//인스턴스 멤버와 클래스 멤버간의 참조와 호출

public class Ex01 {
    void instantceMethod(){}
    static void staticMethod(){}

    void instatnceMethod2(){
        instantceMethod();
        staticMethod();
    }

/*
    static void staticMethod1(){
        instantceMethod();
        staticMethod();
    }
*/

    static void staticMethod2(){
        Ex01 ex01 = new Ex01();
        ex01.instantceMethod();
        staticMethod();
    }


}
