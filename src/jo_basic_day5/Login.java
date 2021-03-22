package jo_basic_day5;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

	//키보드로 아이디 ,비밀번호 입력해
		//로그인 성공여부를 출력하는 프로그램
		//1.아이디x, 비밀번호x
		//2.아이디o ,비밀번호 x-비밀번호가 틀려요!
		//3.아이디x, 비밀번호o- 아이디가 틀려요!
	    //4.아이디o,비밀번호 o- 로그인 성공
		//=>입력값에 따른 결과처리 가 복잡하므로 단순화 시킴
		//입력처리가 복잡해지면 코드도 복잡하게 짤수밖에 없음
		//즉,1,2,3=>로그인 실패 ,4=>로그인 성공
		
		
		//변수선언
		
//아이디 /비번 입력 받아 비교
		
	String	userid;
	String	passwd;
	String  result;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("아이디는");
		userid=sc.next();
	System.out.println("비밀 번호는");
		passwd = sc.next();
//		
//		if (userid.equals("abc123"))
//			if(passwd.equals("987xyz"))  result="correct";
//			else result= "비밀번호가 틀렸습니다";
//		
//		else 
//			if(passwd .equals ("987xyz"))
//			   result = " 아이디는 틀리고 비밀번호는 맞아요";
//			
//			else result= "아이디 비번 틀려요";
		
//		if(userid.equals("abc123"))
//		
//		{if(passwd.equals("987xyz"))
//			result="로그인 성공";
//				ss
//			else result="로그인 실패";}
//		
//		else result="로그인 실패";s
//		
		
		if(userid.equals("abc123")&&
				passwd.equals("987xyz"))
			result = "로그인 성공";
		else 
			result= "로그인 실패";
		
		System.out.println(result);
		
		
		System.out.print(result);

	}}
