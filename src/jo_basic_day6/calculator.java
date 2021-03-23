package jo_basic_day6;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //간단한 계산 프로그램 작성
        //ex) 두수를 입력받아 더하기 계산을 수행1
//        int a,b;
//        int sum=0;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("두수를 입력받습니다요");
//        System.out.println("첫번째 숫자는?");
//       a=sc.nextInt();
//        System.out.println("두번째 숫자는?");
//        b=sc.nextInt();
//
//        sum =a+b;
//
//        String fmt = "입력받은 수는 각각 %d,%d이고요 \n"+
//                    "두수의 총합은 %d 입니다 ";
//        System.out.printf(fmt,a,b,sum);


        //ex) 두수를 입력받아 더하기 계산을 수행 하는 프로그램 2
        PlusTwo1();
    }
    // 두수를 입력받아 더하기를 수행하는 메서드
    public static void PlusTwo1(){
        int a,b;
        int sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("두수를 입력받습니다요");
        System.out.println("첫번째 숫자는?");
        a=sc.nextInt();
        System.out.println("두번째 숫자는?");
        b=sc.nextInt();

        sum =a+b;

        String fmt = "입력받은 수는 각각 %d,%d이고요 \n"+
                "두수의 총합은 %d 입니다 ";
        System.out.printf(fmt,a,b,sum);
        }

}
