package jo_basic_day3;

public class TestCast {

	public static void main(String[] args) {
		
//자바의 JVM은 기본족으로 32비트단위로 처리함
	byte x = 1;
	byte y = 2;
	
byte z =(byte)(x+y);
				//byte형 변수 연산시 자동으로 int로 변환
				//따라서 ,겨ㄹ과를 byte 로 저장하려면
				//int 를 byte로 변환하는 과정 필요 ​​
				//성적 처리시 적절하게 평계산하기​​
System.out.println(z);
	

	}
}
