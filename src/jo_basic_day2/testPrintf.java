package jo_basic_day2;

public class testPrintf {
 public static void main(String[] args) {
 int x=5;
 double pi=3.14;
 
 // 4개의 출력문을 사용해서 메세지 출력
 System.out.print("x=");
 System.out.print(x);
 System.out.print("and pi =");
 System.out.println(pi);

 //+연산자를 이용해서 2개의 출력문을 사용
 
 System.out.print("x="+x);
 System.out.println("and pi="+pi);
 
 
 
 //printf 메서드를 이용해서 1개의 출력문을 사용   정수d 실수 f
 //형식 지정자: 특정 문자열 내에 출력할 대상과 모양을 지정하는데 사용되는 특수한 문자 
 
 //%d : decimal, 정수를 표기할때 사용
 //%f : float., 실수를 표기할때 사용
 //%c : ccharacter, 문자하나를 표기할때 사요
 //%s : string , 문자열을 표기할때 상용
 
 System.out.printf("x=%d and pi =%f\n",x,pi);

 // x가 %x로 들어가고 pi가 %pi로 들어간다
 String fmt = "x=%d and pi =%f \n";
 System.out.printf(fmt,x,pi);
}}