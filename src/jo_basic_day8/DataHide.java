package jo_basic_day8;

import jo_basic_day7_EX04.ClassB;

public class DataHide {
    public static void main(String[] args) {
        //캡슐화 capsulation  사용자가 굳이 알필요 가 없는 정보
        // 사용자로부터 숨겨야 한다는 개념 최소한 의 정보만으로 프로그램쉽게 이해하고 사용할 수 있음

        //접근지정자
        //클래스와 멤버 변수 , 메서드 선언시 정보은닉 정도를 부여할 수 있음

        //자바의 4가지 접근 지정자
        //private(동일패키지도 안됨 동일 클래스만  > default(패키지내에선 가능 다른패키지 불가
        // > protected(동일패키지 다른패키지라도 자식 클래스 가능)> public(모든패키지 모든 클래스 가능)
        //

        //동일 패키지내 클래스
        A one=new A();
        System.out.println(one.c); //public 변수
        System.out.println(one.a);
       // System.out.println(one.b);

        //다른 패키지
        ClassB two=new ClassB();    //day7 클래스
       // System.out.println(two.d);  //defalt: 다른패키지라  day7d ClassB
      //  System.out.println(two.e);  //private :
        System.out.println(two.f);  //public

    }//main
}//class

class A{
    int a;          //default 접근 지정
    private int b;  //private 접근지정
    public int c;   //public 접근지정


}