package jo_basic_day8;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Overloading {
    public static void main(String[] args) {
        //메서드 다중정의overloading 오버로딩
        //객체지향 3대 개념 중 다형성에 해당
        //같은 이름의 메서드를 중복해서 정의하는 것을 의미
        //메서드의 서명을 다르게해서 한클래스에서
        //같은 이름의 메서드를 2개이상 선언 하는것

        //정수/실수 매개변수를 2개 또는 3개
        //이용해서 간단한 덧셈을 수행하는 프로그램 작성
        NonOver no= new  NonOver();

        Over ov = new Over();
//        System.out.println( ov.add(a:10,b:20));


    }//main
}//class

class NonOver{
    //1.정수 2개를 이용한 덧셈 메서드
    public int add_int(int a,int b){
       return a+b;
    }
    //2.정수 3개를 이용한 덧셈 메서드
    public int add_int3(int a,int b,int c){
        return a+b+c;
    }
    //3. 실수 2개를 이용한 덧셈 메서드
    public double add_double(double a,double b){
        return a+b;
    }
    //다형성이 적용되지 않으면
    //생성한 메서드마다 이름을 제각가 정해야함 개발자 일일히 기억못함




}
class Over{
    //1.정수 2개를 이용한 덧셈 메서드
    public int add(int a,int b){
        return a+b;
    }
    //2.정수 3개를 이용한 덧셈 메서드
    public int add(int a,int b,int c){
        return a+b+c;
    }
    //3. 실수 2개를 이용한 덧셈 메서드
    public double add(double a,double b){
        return a+b;
    }}
//다형성이 적용하면
//기능은 달라도 메서드 이름을 통일되므로
//개발자가 외울 필요 없음
//단지 , 메서드를 어떻게 호출할지 알고 있으면 됨


