package jo_basic_day5;

import java.util.Scanner;

public class LeapYear27 {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

//윤년 여부를 출력하는 프로그램
		//지구의 공전주기와 자전주기의 불일치로 발생함
		//공전주기:365.24일
	//달력의 하루 주기:0.24일
		//이 둘간의 오차때문에 4년마다 하루를 추가하는 방법으로
		//오류를 보정함		
		//조건:4로나누어떨어지면서 100으로는 나눠떨어지지 않음
		//조건2: 단, 400 으로 나눠 떨어짐
		//1600(윤년),2020(윤년)1900(평년)2021(?)
	
//	double x = sc.nextDouble();                           
// 
// if (x%4 == 0 &&  x%100!=0	|| x%400==0) 
//	 
//	 System.out.println("윤년입니다");
// 
// else System.out.println("땡입니다");
// 
//                
 
		int year;
		String result;
		
		System.out.print("년도를 입력하세요");
		year=sc.nextInt();
		
	
		 if ((year%4 == 0 &&  year%100!=0	)|| (year%400==0)) 
			 result="윤년";
		 else
			 result = "평년";
System.out.println(result);
	
	
	}
}