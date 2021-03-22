package jo_basic_day5;

import java.util.Scanner;

public class Switches {

public static void main(String[] args)
{
	//switch
	//둘이상의 조건에 결과값에 따라 명령 문을 선택적으로 
	//실행하도록 작성하는 제어문 
	//switch(상수)
	//case 상수 1:실행문1;break;
	//case 상수 2:실행문2;break;
	//case 상수 3:실행문3;break;
	//    default:실행문4;}

//시간을 입력하면 시간을 의미하는 단어를 출력하는 프로그램

	
int daytime;
String result="";
Scanner sc= new Scanner(System.in);

System.out.println("시간을 입력하세요");
daytime = sc.nextInt();
//
//if (daytime >=7 && daytime<12)
//   result= "morning hours";
//else if ( daytime>=12&& daytime<1)
//	result="noon";
//조건이 많은 경우 if else if 는 다소 복잡해진다 

//이럴 경우 switch 사용
//옜날버전 c 언어 문자열 불가능 요즘은 가능 


switch(daytime) {
case 7:
case 8:
case 9:
case 10:
case 11:
		result="morning hours"; break;
case 12: case 13:
	result="noon";break;
case 14: case 15:case 16:case 17:
	result = "afternoon hours";break;
case 18:case 19:case 20:
	result= "evening hours";break;
case 21: case 22: case 23:
	result= "night hours";break;
case 24:
	result= "midnight";break;
case 1:
	result ="early morning hours";break;
case 5:
	result= "dawn";
}
System.out.println(result);









}
}

