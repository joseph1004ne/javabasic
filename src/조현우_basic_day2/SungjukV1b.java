package 조현우_basic_day2;

import java.util.Scanner;

//v패키지명 소문자로 쓰세요


/*@author nickname
*@catsgory javabasic
*@version 1.0
 * 
 * @version 
 * 자바기초프로그램 -성적 처리 프로그램
 * 
 * 이름과 성적 데이터를 키보드로 직접 입력받아 처리
 * 처리결과 출력시 printf 메서드 사용
 * *입력 - 이름 국어 영어 수학
*처리 - 총점 평균 학점
*출력 - 이름 국어 영어 수학 총점 평균 학점
*
 * 		
 */
		
		
public class SungjukV1b {
	public static void main(String[] args){
		//변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;        
 		char grd;
		
		
 		
 		
 		//처리   스캐너 치고 ctr 스페이스 -java .utill 클릭 후 오른쪽 적어라
 	Scanner sc = new Scanner(System.in);
 		//키보드를 이용해서 성적 데이터를 입력 받기 위해
 	//Scanner 클래스를 초기화함
 	
 System.out.println("이름은?");
 	
 	name =  sc.next();
//키보드로 문자데이터를 입력 받아 name 변수에 대입
 	
 	System.out.println("국어?");
 	 	
 	kor = sc. nextInt();
 	System.out.println("영어?");
 	 	
 		// 키보드로 숫자 데이터를 입력 받아 name 변수에 대입
 	eng=sc.nextInt();
 	System.out.println("수학?");
 	 
 	mat=sc.nextInt();
 	
 	// 총점, 평균 처리
 	 tot = kor+ eng + mat;
 			avg = tot /3;
 	
 	
   //출력
 			//이름 : ?? 국어:?? ,영어:??,수학:??
 			//총점:??, 평균:??, 학점:??
 			
 			String fmt =
 					"이름:%s, 국어:%d,영어:%d, 수학:%\n";
 			System.out.printf(fmt,name,kor,eng,mat);
 	
 			fmt="총점:%d, 평균:%f,학점:%c"
 					System.out.printf(fmt,tot,avg,grd);
 	
	}
		
}
