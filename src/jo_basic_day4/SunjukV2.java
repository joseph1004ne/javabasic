package jo_basic_day4;

import java.util.Scanner;

//성적 처리 프로그램
public class SunjukV2 {
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
		int i =1;
		while (1<=3) {        //while 옆에 true즉 조건식을 투루 로설정하면
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
				grd = (avg >= 90) ? '수' :
				      (avg >= 80) ? '우' :
				      (avg >= 70) ? '미' :
				      (avg >= 60) ? '양' : '가';
			//결과출력
		System.out.printf(fmt,name,kor,eng,mat,tot,avg,grd);
			//반복 증감식
		++i;
	}//while
 }//main
}//class
