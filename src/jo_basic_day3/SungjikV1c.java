package jo_basic_day3;

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
 * 
 * 이름과 성적데이터를 기보드로 직접 입력 받아
 * 총점, 평균,학점,처리하고 결과 출력
 */
		
		
public class SungjikV1c {
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
 	
 	// 총점, 평균 ,학점 , 처리
 	 		tot = kor+ eng + mat;
 			avg = (double) tot /3;
 			grd = (avg >= 90) ? '수' :
 			      (avg >= 80) ? '우' :
 			      (avg >= 70) ? '미' :
 			      (avg >= 60) ? '양' : '가';
 						
   //출력
 			//이름 : ?? 국어:?? ,영어:??,수학:??
 			//총점:??, 평균:??, 학점:??
 			
 			String fmt =
 					"이름:%s, 국어:%d,영어:%d, 수학:%d\n";
 			System.out.printf(fmt,name,kor,eng,mat);
 	
 			fmt = "총점:%d, 평균:%f, 학점%s ";
 					System.out.printf(fmt,tot,avg,grd);
 	

	
	
	
	
	
	}
		
}

