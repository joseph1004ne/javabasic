package jo_basic_day7_EX04;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
//        //생년월일 을 입력 받아 나이 계산
//        //현재 연도 -생년 년도
//        //생일이 지났으면 그대로 사용
//        // 생일이 지나지 않았으면-1 그대로 사용
//        int byear, bmonth, bday;// 생년월일
//        int cyear, cmonth, cday;// 생년월일
//        Scanner sc= new Scanner(System.in);
//        String fmt =( "현재 : %d년 %d월 %d일 \n"+
//                   "생일 : %d년 %d월 %d일 \n"+
//                   "나이 : %d년 ");
//        //현재 년월일 설정
//        cyear = 2021;
//        cmonth =3;
//        cday  = 24;
//
//        //생년월일 입력받음
//        System.out.println("생일의 년도는?");
//        byear= sc.nextInt();
//        System.out.println("생일의 월은?");
//        bmonth= sc.nextInt();
//        System.out.println("생일의 일는?");
//        bday= sc.nextInt();
//
//        //나이계산
//        int age = cyear - byear;
//        if(cday> bday && cmonth >bmonth)//생일 지남 여부
//            age =age+1;
//        else
//            age =age-1;
//        System.out.printf(fmt,cyear,cmonth, cday ,byear,bmonth,bday,age);

        computeAge();

//        //잔돈 계산하는 프로그램
//        //지불 요구금액  : 54320원
//        //지불액  : 100000원
//        //잔돈 :45689원
//        int price, pay, change;
//        int w50000,w10000,w5000,w1000,w500,w100,w50,w10;
//        String fmt = "사용 요금은 %d,지불액은 %d 일때 \n"+
//                     "잔돈은 %d 입니다 \n"+
//                     "500000원권 %d 10000원권은 %d 개, \n"+
//                     "5000원권 %d 1000원권은 %d 개, \n"+
//                     "500원 %d 100원은 %d 개, \n"+
//                     "50원구너 %d 10원권은 %d 개";
//
//        Scanner sc =new Scanner (System.in);
//
//        System.out.println("사용요금은?");
//        price = sc.nextInt();
//        System.out.println("지불액은?");
//        pay = sc.nextInt();

//        //잔돈 계산
//        change= pay -price;
//        w50000 = change/ 50000;                 //
//
//        change = change -(50000*w50000);    //
//        w10000 = change / 10000;            //w10000 = change / 10000; 대신 CHAGE
//
//         change = change -(10000*w10000);
//        w5000 = change / 5000;
//
//         change = change -(5000*w5000);
//        w1000 = change / 1000;
//
//         change = change -(1000*w1000);
//        w500 = change / 500;
//
//        change = change -(500*w500);
//        w100 = change / 100;
//         change = change -(100*w100);
//        w50 = change / 50;
//
//        change = change -(50*w50);
//        w10 = change / 10;
//
//        System.out.println("사용 요금은?");
//
//        System.out.printf(fmt,price,pay,(pay-price),w50000 ,w10000,w5000,w1000,w500,w100,w50,w10);

    }

    public static void computeAge() {
        int byear, bmonth, bday;// 생년월일
        int cyear, cmonth, cday;// 생년월일
        Scanner sc = new Scanner(System.in);
        String fmt = ("현재 : %d년 %d월 %d일 \n" +
                "생일 : %d년 %d월 %d일 \n" +
                "나이 : %d년 ");
        //현재 년월일 설정
        cyear = 2021;
        cmonth = 3;
        cday = 24;

        //생년월일 입력받음
        System.out.println("생일의 년도는?");
        byear = sc.nextInt();
        System.out.println("생일의 월은?");
        bmonth = sc.nextInt();
        System.out.println("생일의 일는?");
        bday = sc.nextInt();

        //나이계산
        int age = cyear - byear;
        if (cday > bday && cmonth > bmonth)//생일 지남 여부
            age++;
        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);
        System.out.println(" ");

        computechange();

    }

    public static void computechange() {
        int price, pay, change;
        int[] wons = {0, 0, 0, 0, 0, 0, 0, 0};  //==  new int[8]
        int[] notes = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        String fmt = "사용 요금은 %d,지불액은 %d 일때 \n" +
                "잔돈은 %d 입니다 \n" +
                "500000원권 %d 10000원권은 %d 개, \n" +
                "5000원권 %d 1000원권은 %d 개, \n" +
                "500원 %d 100원은 %d 개, \n" +
                "50원구너 %d 10원권은 %d 개";

        Scanner sc = new Scanner(System.in);

        System.out.println("사용요금은?");
        price = sc.nextInt();
        System.out.println("지불액은?");
        pay = sc.nextInt();

        change = pay - price;

        for (int i = 0; i < wons.length; ++i){
            wons[i] = change / notes[i];
        change = change % notes[i];
        }



    System.out.printf(fmt,price,pay,(pay-price),wons[0] ,wons[1],wons[2],wons[3],wons[4],wons[5],wons[6],wons[7] );

    }

}