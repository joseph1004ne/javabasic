package jo_basic_day6;

import java.sql.SQLOutput;

public class Breaks {
    public static void main(String[] args) {
        //반복문 제어 break,continue
        //break:반복문 실행을 중단하는 명령

        // eX)1~100 까지으 ㅣ총합을 구해서 출력
        //단, 총합이 500을 넘는 경우 , 실행을 중단람

//int sum= 0;
//int i;
//for (i =0;i<=100; ++i) {
//    sum +=i;
//    if(sum>=500)break;}
// //부분합이 500이상인 경우 반복실행 중지
//        System.out.println("총합:"+sum);
//        System.out.println("회수:"+ i);
//        //ex)주사위 눈이 6나올때까지 굴리는 프로그램 작성
//        //6나올때까지의 횟수도 출력


        int dice=0;
        int count = 0;

        while(true){
            dice =(int)(Math.random()*6)+1;
           ++count;
            System.out.println(dice+" ");
            if (dice==6) break;
        }
        System.out.println("굴린 총 횟수 : " +count);

//        int sum;
//
//        switch(idx) {
//            case '1':
//                sum += 1;
//            case '2':
//                sum += 1;
//            case '3':
//                sum += 1;
//            case '4':
//                sum += 1;
//            case '5':
//                sum += 1;
//            case '6':
//                break;
//        }
//
//        System.out.println(gamble[idx]);
//        System.out.println((int) sum);
//


    }
}
