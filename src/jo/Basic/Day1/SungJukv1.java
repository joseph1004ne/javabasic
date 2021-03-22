package jo.Basic.Day1;

/**
*
*@author nickname
*@catsgory javabasic
*@version 1.0
*자바 기초프로그램 - 성적처리프로그램
*입력 - 이름 국어 영어 수학
*처리 - 총점 평균 학점
*출력 - 이름 국어 영어 수학 총점 평균 학점
*
*
*
*/
public class SungJukv1{
	public static void main(String[] args) {

		//변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;        //소수점 으로 나올수 있으니까 double
 		char grd;         //짧게  abc 수우미 이런거니까 char 써줘도 좋음
		
		//처리
 		name ="홍길동";
 		kor = 95;
 		eng = 78;
 		mat = 84;
 		tot = kor+eng+mat;
 		avg = tot/3;
 		
 		grd = '가';
 		
 		
 		System.out.println(name);
 		
 		System.out.println(kor);
 		
 		System.out.println(eng);
 		System.out.print("수학 : ");
 		System.out.println(mat);
 		System.out.print("총점 : ");
 		System.out.println(tot);
 		System.out.print("평균 : ");
 		System.out.println(avg);
 		System.out.print("학점 : ");
 		System.out.println(grd);
 		// 결과출력
	}
}