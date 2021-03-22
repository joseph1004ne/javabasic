package jo_basic_day4;

public class Looop {
	public static void main(String[] atgs) {
		
		 //while
		//특정조건을 만족할때까지 계속해서 주어진 명령을 수행
		//초기식
		//while(조건식){
		// 반복코드
		// 증감식
		//} 
		
		//조건식이 처음부터 false 면 
		//while 은 코드를 반복 실행 하지 않음
		//반면, do-while 문은 일단 코드를 먼저 실행하고
		//조건을 검사하기 때문에 
		//조건식이 false 라도 최소 한번정도는 코드를 실행할수있음
		
		
		//ex)1~10까지 정수 출력
		int i =1;
		while(i<=10) {//조건이 참이면 반복 실행
			System.out.println(i+" ");
		    i +=1;    //증감식
		}
	
		//ex)1~50 사이 홀수추력
		i=1;
		while(i<=50) { System.out.println(i+" ");
			i +=2;	}
		
	     //ex)1~50 사이 짝수추력
		 i=2;
		while(i<=50) {System.out.println(i+" ");           ///초 조 반 증    초 조현우 반증했다
		     i+=2;}
		

		
		
		//ex)1~100 사이 총합 구해서 출력	
		int sum=0;
		i=1;
		while(i<=100)
		{sum+=i;
		++i;
	
		}
		System.out.println(sum);
	
	//가우스 덧셈공식을 이용하면 특정 범위내의 모든 수의 합을 편리하게 구할수있음
	//총합: sum,시작범위: i ,끝범위: j
	//sum = (i+j)*j/2
	//sum =
		
		
	i=1;
	int j =99;
	
	sum = (i+j)*j/2;
	System.out.println(sum);
	
	
	
	}
}
