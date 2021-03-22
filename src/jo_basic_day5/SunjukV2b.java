package jo_basic_day5;

import java.util.Scanner;

//성적 처리 프로그램 v2b
//성적처리시 학점 계산을 swirch 문으로 작성
public class SunjukV2b {
	public static void main(String[]atgs) {
		//변수선언
		String name;
		int kor,eng,mat;
		int tot;
		double avg;
		char grd;
		String fmt ="%s,%d,%d,%d \n"+
					"%d,%.1f, %c \n";
		
		Scanner sc = new Scanner(System.in);
		//성적 처리
		int i =0;
		while (i<=1) {        //while 옆에 true즉 조건식을 투루 로설정하면
			                   //횟수제한없이 계속 코드를 실행함 
			System.out.println("이름은");
	 	 	name = sc.next();
			System.out.println("국어?");
	 	 	kor = sc.nextInt();
		 	System.out.println("영어?");
		 	eng=sc.nextInt();
		 	System.out.println("수학?");
		 	mat=sc.nextInt();
		 	
		 	tot = kor+ eng + mat;
				avg = (double) tot /3; 
				
//			
//				grd= '가';
//				if(avg >= 90) grd= '수' ;
//			else if  (avg >= 80) grd= '우' ;
//			else if (avg >= 70) grd= '미' ;
//			else if (avg >= 60) grd = '양';
			
				//학점계산 swirch문으로 작성하기
				//avg:99.9 =>(int)avg:99
				switch((int)avg / 10) {
				case 10:
				case 9: grd='수'; break;
				case 8: grd='우'; break;
				case 7: grd='미'; break;
				case 6: grd='양'; break;
				default : grd ='가';
				}
				System.out.printf(fmt,name,kor,eng,mat,tot,avg,grd);
				//반복 증감식
				
				++i;
				}
	//while
 //main
}}//class
