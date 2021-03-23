package jo_basic_day6;

public class Methods {
    public static void main(String[] args) {

        //메서드 :
        //어떤 특정 작업을 수행하기 위한 코드들의 집합
        //c언어의 함수와 유사
        //유사한 코드들의 반복적 사용 막을수있음
        //모듈화를 통해 프로그램의 이해도 증가
        //코드의 문제발생 또는 기능 변경시에
        //손쉽게 유지보수 가능

        //메서드 형식
        //접근지정자 반환 타입 _메서드명 (매개 변수 목록)
        //메더드 몸체
        // return 변수
        //접근 지정자 :메서드 접근헝요 범위 지정( public/private)
        //반환타입 : 메서드 실행후 반환하는 자료의 타입 지정
        //반환 타입이 없는 경우 void로 저의
        //매개 변수 목록:메서드 호출시 전달하는 변수지정
        //
//메서드 호출
//메서드명
//메서드명(매개변수값)

        //ex) 1~10 사이 난수 10개 생성 v1

        for (int i = 1; i <= 10; ++i) {
            int magic = (int) (Math.random() * 10) + 1;
            System.out.print(magic + "");
        }
        System.out.println("");
        //ex) 1~10 사이 난수 10개 생성 v2
        for (int i = 1; i <= 10; ++i) {
            //make_magic();//난수를 만드는코드
        }//for
        //인삿말 출력 v1
//        System.out.println("Hello,wirld");
//        System.out.println("Hello,World!!");
//        sayHello2("World");
//        sayHello3("Java");//HEllo,java


    }//main

//    public static void make_magic(){ int magic = (int)(Math.random()*10)+1;
//        System.out.print(magic + "");
//
    //public static void sayHello4(String msg){
   // String say = "hello,"+msg + "!!"
    //dlstktakf cnffur
    //sayHell(msg:"python");
    //return


}