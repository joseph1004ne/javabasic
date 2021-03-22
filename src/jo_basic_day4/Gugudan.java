package jo_basic_day4;

import java.util.Scanner;

public class Gugudan {
	public static void main (String[] args) {
//구구단 출력하기
		//ex)7단 출력하기 v1
		System.out.println("문자열 그대로 손으로 다쓰기 ");
		System.out.println("문자열 그대로 손으로 다쓰기 ");
		System.out.println("문자열 그대로 손으로 다쓰기 ");
		System.out.println("문자열 그대로 손으로 다쓰기 ");
		System.out.println("문자열 그대로 손으로 다쓰기 ");
		System.out.println("문자열 그대로 손으로 다쓰기 ");
		System.out.println("------ -----");
		
		//ex)7단을 출력하세요 v2-for
		for(int i =1; i<=9;) {
			System.out.println("7곱하기"+i+"="+7*i);
			++i;}
			
		System.out.println("------ -----");
		
		int i=1;
		String fmt = "7 * %d  =  %d \n "  ; 
		while(i<=9) {System.out.printf(fmt, i, 7*i);
		   ++i;}
		                               //왜 않돼
		
		i=1;
	    fmt = "3 * %d  =  %d \n" ;
		while(i<=9) {
			System.out.printf(fmt,i,(i*3));
			++i;}
	
		System.out.println("------ -----");
		
		//구구단 프로그램 v1
		//사용자로부터 숫자 (1-9)를 하나 입력 받아,
		//구구단을 출력하는 프로그램 작성
		//1-9  까지의 숫자 외에 입력을 받으면 

	
		System.out.println("------ -----");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("출력할 구구단의 단을 입력하세요 ; ");
	int dan =sc.nextInt();
	
	i=1;
	 fmt = "%d * %d  =  %2d \n" ;
	while(i<=9) {
		System.out.printf(fmt, dan, i, (i*dan));
++i;
	}
		
	//1-9  까지의 숫자 외에 입력을 받으면 "잘못 받았습니다" 나오기
	//

	System.out.println("출력할 구구단의 단을 입력하세요 ; ");
	char dan2 =sc.next().charAt(0);
	//입력 받은 문자열 중 첫번째 글자만 뽑아서 
	//char 형 변수에 대입
	
	//입력받은 문자의ASCII코드값이 49~57인지 검사 
	String result=(dan2 >=49 && dan2 <=57) ?"구구단 출력":"잘못 입력하셨습니다";
	
	System.out.println(result);
	
	
	//구구단 프로그램 v1
	//사용자로부터 숫자 (1-9)를 하나 입력 받으면
	//1-9  까지의 숫자 외에 입력을 받으면 "잘못 받았습니다" 나오기
	System.out.println("출력할 구구단의 단을 입력하세요:");
	String dan3 = sc.next();
	
	i = 1;
	
	String fmt = "7 * %d  =  %d \n "  ;
	
	try {
	while(i<=9) {
			System.out.printf(fmt, Integer.parseInt(dan3), i,(Integer parseint(dan3)*i));
			++i;
			}
			}
	catch(Exceprion ex) {System.out.println("잘못입력하셨습니다");			
	
//예외처리코드르(try-catch)를 이용해서 프로글매 실행중 오류발생시 제얼르 catch 코드쪽으로 넘김
	
//ex)주민번호를 이용해서 성별을 출력하는 코드를 작성하세요
	//주민번호 중 123456-7654321에서 7이 성별을 나타내는 코드
	//1:1999년 이전에 출생한 남자
	//2:1999년 이전에 출생한 여자
	//3:2000년 이후에 출생한 남자
	//4:2000년 이후에 출생한 여자
	//charAt를 이용해서 풀어보세요
	String jumin = "123456-1234567";

	char gender = jumin.charAt(7);
	result = (gender == '1') ?"1999남자":
			 (gender == '2') ? "1999여자":
			 (gender == '3') ? "2000남자":"2000여자";

System.out.println(result);
	
	
	
	}
	
	